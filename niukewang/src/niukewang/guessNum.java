package niukewang;
import java.util.Scanner;

public class guessNum
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int mod=(int)Math.pow(10, 9)+7;
		int maxn=(int)Math.pow(10, 6)+5;
		int vis[]=new int[maxn];
		 Scanner in=new Scanner(System.in);
		 while(in.hasNext()){
			 int n=in.nextInt();
			 long res=1;
			 for(int i=2;i<=n;i++){
				 if(vis[i]==1) continue;
				 for(int j=i+i;j<=n;j+=i){
					 vis[j]=1;
				 }				
				 int temp=n,cnt=0;
				 while(temp>=i){
					  temp/=i;
					  cnt++;
				 }
				res=res*(cnt+1)%mod;	
			 }
			 System.out.println(res);
		 }
	}

}
