package niukewang;

public class Sum
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int n=5;
		//System.out.println("hello world");
		System.out.println(Sum_Solution1(n));

	}
    public static int Sum_Solution(int n) {	
    	int sum=(int)(Math.pow(n, 2)+n);
    	return sum>>1;
    }
    public static int Sum_Solution1(int n) {	
    	int sum=n;
    	boolean flag=(n>0)&&((sum+=Sum_Solution(n-1))>0);
    	return sum;
    }
}
