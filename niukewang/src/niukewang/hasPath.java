package niukewang;

public class hasPath
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String input="abcesfcsadee";
		char [] matrix=input.toCharArray();
		int rows=3;
		int cols=4;
		String target="bcced";
		char [] str=target.toCharArray();
		System.out.println(hasPath(matrix,rows,cols,str));
	}
	public static  boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
		if(matrix==null||matrix.length==0||str==null||str.length==0||matrix.length!=rows*cols||rows<=0||cols<=0){
			return false;
		}
		boolean visited[]=new boolean[rows*cols];
		int []pathLength={0};
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(hasPathCore(matrix, rows, cols, str, i, j, visited, pathLength)){
					return true;
				}
			}
		}
		return false;
		
    }
	 public  static boolean hasPathCore(char[]matrix,int rows,int cols,char[]str,int i,int j,boolean[]visited,int []pathLength){
	        boolean flag=false;
	        if(i>=0 && i<rows && j>=0 && j<cols && visited[i*cols+j]==false && matrix[i*cols+j]==str[pathLength[0]]){
                pathLength[0]++;
                visited[i*cols+j]=true;
                if(pathLength[0]==str.length){
                    return true;
                }
                flag=hasPathCore(matrix, rows, cols, str, i+1, j, visited, pathLength)||
                        hasPathCore(matrix, rows, cols, str, i-1, j, visited, pathLength)||
                        hasPathCore(matrix, rows, cols, str, i, j+1, visited, pathLength)||
                        hasPathCore(matrix, rows, cols, str, i, j-1, visited, pathLength);
                if(!flag){
                    pathLength[0]--;
                    visited[i*cols+j]=false;
                }
	              
	        }
	        return flag;
	    }

}
