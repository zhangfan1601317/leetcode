package Chapter1;

import java.util.Arrays;
import java.util.Scanner;

public class HuiHuanBianWei
{

	public static void main(String[] args)
	{
//		 TODO 自动生成的方法存根
//		Scanner in=new Scanner(System.in);
//		String s=in.nextLine();
//		//String t=in.nextLine();
//		in.close();
//		//System.out.println(HuiHuan(s, t));
//		System.out.println(mystery(s)); 
		//System.out.println(Reverse());
		YeShu();
	}
	public static int Reverse(){
		Scanner in=new Scanner(System.in);
		int A=in.nextInt();
		int B=in.nextInt();
		int K=in.nextInt();
		int Max=200000;
		in.close();
		for(int i=0;i<=Max;i++)
		{
			if((i*K-A)<0||(i*K-A)%2!=0)
				continue;
			if((i*K-A)/2<=A*((i-1)/2)+B*(i/2))
			{
				return i;
			}				
		}
		return -1;
	}
	public static void YeShu()
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		int page[]=new int[10];	
		for(int i=0;i<10;i++)
		{
			page[i]=0;
		}
		count(n, page);
		for(int i=0;i<10;i++){
			System.out.print(page[i]+" ");
		}
		System.out.print(page[9]);
	}
	public static void count1(int n, int arr[]) {  
        for (int i = 1; n / i != 0; i *= 10) {  
            //394 i=1时，before=39 after=0 current=4;  
            // i=10 before=3 after=3,current=9;  
            int before = n / (i * 10);  
            int after = n % i;  
            int current = (n / i) % 10;  
            //统计当前循环0的个数  
            if (current == 0) {  
                arr[0] += (before - 1) * i + after + 1;  
            } else {  
                arr[0] += before * i;  
            }  
            //统计当前current循环1至9的个数  
            for (int index = 1; index < 10; index++) {  
                if (index < current) {  
                    arr[index] += (1 + before) * i;  
                } else if (index == current) {  
                    arr[index] += before * i + after + 1;  
                } else {  
                    arr[index] += before * i;  
                }  
            }  
        }  
  
    }  
	public static void count(int n,int page[]){
		for(int i=1;n/i!=0;i*=10){
			int before=n/(i*10);
			int after=n%i;
			int current=(n/i)%10;
			
			if(current==0){
				page[0]+=(before-1)*i+after+1;
			}else{
				page[0]+=before*i;
			}
			for(int index=1;index<10;index++){
				if(index<current){
					page[i]+=(1+before)*i;
				}else if(index==current){
					page[index]+=before*i+after+1;
				}else{
					page[i]+=before*i;
				}
			}
		}
	}
	public static void XuLieHe(){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int L=in.nextInt();
		in.close();
		for(int i=L;i<=100;i++)
		{
			if((2*N+i-i*i)%(2*i)==0)
			{
				int a1=(2*N+i-i*i)/(2*i);
				for(int j=0;j<i-1;j++){
					System.out.println(a1+j+" ");
				}
				System.out.println(a1+i-1);
				return;
			}
		}
		System.out.println("No");		
		
	}
	public static void SuShu(){
		Scanner in =new Scanner(System.in);  
		long n=in.nextLong();
        in.close();
        double p=0;
        boolean IsPrime=false;
        long limit=(long)Math.sqrt(n);
        for(long q=2;q<=limit;q++)
        {
        	p=Math.pow((double)n, 1d/q);
        	if((long)p==p&&IsPrime((long)p)){
        		System.out.println((long)p+" "+q);
        		IsPrime=true;
        		break;
        	}
        }  
        if(!IsPrime){
        	System.out.println("No");
        }
	}
	public static boolean IsPrime(long n)
	{
		if(n==2)
			return true;
		if(n>2)
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
					return false;
			}
			return true;
		}
		return false;
	}
	public static String ZhaoShu()
	{
		Scanner in =new Scanner(System.in);     
        int n=in.nextInt();
        String string="";
        int num[]=new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=in.nextInt();
        }
        in.close();
        Arrays.sort(num);
        if(num[n-1]<=num[0]+n)
        {
        	for(int i=1;i<n;)
        	{
        		if(num[i]==num[i-1]+1)
        		{
        			i++;
        		}
        		else if(num[i]==num[i-1])
        		{
        			return string+"mistake";
        		}
        		else
        		{
        			int right=num[i]-1;
        			return string+right;
        		}
        	}
        	if(num[0]!=1)
        	{
        		int min=num[0]-1;
        		string=string+min+" ";
        	}
        	if(num[n-1]!=1000000000)
        	{
        		int max=num[n-1]+1;
        		string=string+max;
        	}
        		return string;
        }
        else
        {
        	return string+"mistake";
        }
	}
	public static void PeiDui()
	{
		Scanner in=new Scanner(System.in);
        String aString=in.next();
        String bString=in.next();
        in.close();
        int min=0;
        if(aString.length()==bString.length())
        {
        	for(int i=0;i<aString.length();i++)
        	{
        		switch (aString.charAt(i))
				{
				case 'A':
					if(bString.charAt(i)!='T')
						min++;
					break;
				case 'T':
					if(bString.charAt(i)!='A')
						min++;
					break;case 'C':
						if(bString.charAt(i)!='G')
							min++;
						break;case 'G':
							if(bString.charAt(i)!='C')
								min++;
							break;
				default:
					break;
				}
        	}
        }
        System.out.println(min);
	}
	public static void XunHuan()
	{
		Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        String [] s=new String[n];
        boolean[] right=new boolean[n];
        for(int i=0;i<n;i++)
        {
        	s[i]=in.next();
        	right[i]=true;
        }
        in.close();
        for(int i=0;i<n;i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		if(s[i].length()==s[j].length()&&s[i].concat(s[i]).indexOf(s[j])>=0)
        		{
        			right[j]=false;
        			
        		}
        	}
        }        
        int num=0;
        for(int i=0;i<n;i++)
        {
        	if(right[i])
        		num++;
        }
		System.out.println(num);	
	}
	public static boolean HuiHuan(String s,String t)
	{
		if(s.length()==t.length()&&s.concat(s).indexOf(t)>=0)
			return true;
		else
			return false;
	}
	public static String mystery(String s)
	{
		int N=s.length();
		if(N<=1) return s;
		String a=s.substring(0, N/2);
		String b=s.substring(N/2, N);
		return mystery(b)+mystery(a);
	}

}
