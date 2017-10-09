package niukewang;

public class countBitDiff
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int m=0;
		int n=0;
		System.out.println(countBitDiff(m, n));

	}
	public  static int countBitDiff(int m, int n) {
		int cnt=0;
		while(m!=0||n!=0)
		{
			int rm=m%2;
			int rn=n%2;
			if((rm^rn)==1){
				cnt++;
			}
			m/=2;
			n/=2;
		}
		return cnt;
    }

}
