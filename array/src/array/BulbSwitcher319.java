public class BulbSwitcher319 {
	public static void main(String[] args) {
		int n=99;
		int bulbOn=0;
		int [] bulb=new int[n];
		for(int i=0;i<n;i++)//表示轮回
		{
			for(int j=0;j<n;j++)//表示第几个灯
			{				
				if(i==0)
				{
					bulb[j]=1;
				}
				else if(i==1 && (j+1)%(i+1)==0)
				{
					bulb[j]=0;
				}		
				else if((j+1)%(i+1)==0)
				{
					bulb[j]=1-bulb[j];
				}
			}
		}
		for(int j=0;j<n;j++)
		{
			if(bulb[j]==1)
				bulbOn++;
		}
      System.out.println(bulbOn);
      System.out.println((int)Math.sqrt(n));
	}
}
