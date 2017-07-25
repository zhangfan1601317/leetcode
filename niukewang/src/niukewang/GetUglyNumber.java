package niukewang;

public class GetUglyNumber
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int index=8;
		System.out.println(GetUglyNumber_Solution(index));

	}
	public static int GetUglyNumber_Solution(int index) {
        if(index<=0)
		return 0;
        int []p=new int[index];
        p[0]=1;
        int begin=1,m2=0,m3=0,m5=0;
        while(begin<index){
        	p[begin]=min(p[m2]*2, p[m3]*3, p[m5]*5);
        	while((p[m2]*2<=p[begin])){
        		m2++;
        	}
        	while((p[m3]*3)<=p[begin]){
        		m3++;
        	}
        	while((p[m5]*5)<=p[begin]){
        		m5++;
        	}
        	begin++;
        }
        return p[index-1];
    }
	public static int min(int i,int j,int k){
		int temp=i<j?i:j;
		return temp<k?temp:k;
	}

}
