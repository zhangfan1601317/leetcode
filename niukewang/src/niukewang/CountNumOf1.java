package niukewang;

public class CountNumOf1
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int n=21345;
		int a[] ={0,1,2,3,4,5} ;
		System.out.println(NumberOf1Between1AndN_Solution(n));

	}
	public static  int NumberOf1Between1AndN_Solution(int n) {
	    if(n<1)
	    	return 0;
	    int count=0;
	    int base=1;
	    int round=n;
	    while(round>0){
	    	int weight=round%10;
	    	int former=n%base;
	    	round/=10;
	    	if(base==1){	    			    		
	    		if(weight==0)
	    			count+=round;
	    		else
	    			count+=(round+1);
	    		
	    	}
	    	else{
	    		if(weight==0)
	    			count+=round*base;
	    		else if(weight==1)
	    			count+=round*base+former+1;
	    		else {
					count+=round*base+base;
				}
	    	}
	    	base*=10;
	    }
	    return count;
    }

}
