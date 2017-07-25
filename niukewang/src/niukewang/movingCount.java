package niukewang;

public class movingCount
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int rows=50;
		int cols=50;
		int threshold=18;
		System.out.println(movingCount(threshold, rows, cols));

	}
	public static  int movingCount(int threshold, int rows, int cols)
    {
        boolean [] visited=new boolean[rows*cols];
        return SubmovingCount(threshold, 0, 0, rows, cols, visited);
    }
	public  static int SubmovingCount(int threshold,int i,int j,int rows,int cols,boolean[]visited){
		if(i<0||i>=rows||j<0||j>=cols){
			return 0;
		}
		int index=i*cols+j;
		if(visited[index]==true||CheckSum(threshold, i, j)==false){
			return 0;
		}
		visited[index]=true;
		return 1+SubmovingCount(threshold, i+1, j, rows, cols, visited)
		+SubmovingCount(threshold, i-1, j, rows, cols, visited)
		+SubmovingCount(threshold, i, j+1, rows, cols, visited)
		+SubmovingCount(threshold, i, j-1, rows, cols, visited);
	}
	public static  boolean CheckSum(int threshold,int i,int j){
		int sum=0;
		while(i!=0){
			sum+=i%10;
			i/=10;
		}
		while(j!=0){
			sum+=j%10;
			j/=10;
		}
		if(sum>threshold)
			return false;
		return true;
	}
		
}
