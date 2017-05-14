
public class ValidPerfectSquare367
{

	public static void main(String[] args)
	{
		int num=808201;
		System.out.println(isPerfectSquare(num));
		
	}
	public static boolean isPerfectSquare(int num) {
        int product=num;
        int left=0;
        int right=0;
		while(num>0)
		{			
			if((int)Math.pow(num, 2)<product)
			{
				left=num;
				break;
			}
			right=num;
			num/=2;
		}
		for(int i=left;i<=right;i++)
		{
			if(i*i==product)
				return true;
		}
		return false;
    }

}
