package niukewang;

public class Fibonacci
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	public static int Fibonacci(int n) {
//		if(n<=0)
//			return 0;
//		if(n==1)
//			return 1;
//		return Fibonacci(n-1)+Fibonacci(n-2);
    	
    	int []res={0,1};
    	if(n<2)
    		return res[n];
    	int fibNMinusOne=1;
    	int fibNMinusTwo=0;
    	int fibN=0;
    	for(int i=2;i<=n;i++)
    	{
    		fibN=fibNMinusOne+fibNMinusTwo;
    		fibNMinusTwo=fibNMinusOne;
    		fibNMinusOne=fibN;
    	}
    	return fibN;
    }
}
