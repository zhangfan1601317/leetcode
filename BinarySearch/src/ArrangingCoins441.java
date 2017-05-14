
public class ArrangingCoins441
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int n=1804289383;
		System.out.println(arrangeCoins(n));

	}
	public static int arrangeCoins(int n) {
//		int i = 0;  
//        int sum = 0;  
//        for (i = 1; sum <= n - i; i++) {  
//            sum += i;  
//        }  
//        return (i - 1); 
		return (int)(Math.sqrt(8.0*n+1)-1)/2;
    }
}
