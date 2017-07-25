package niukewang;

public class MoreThanHalfNum_Solution
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int [] array={4,2,4,1,4,2};
		System.out.println(MoreThanHalfNum_Solution(array));

	}
    public static  int MoreThanHalfNum_Solution(int [] array) {
        if(array==null||array.length==0)
        	return 0;
        int result=array[0];
        int time=1;
        for(int i=1;i<array.length;i++){
        	if(time==0)
        	{
        		result=array[i];
        		time=1;
        	}
        	else if(array[i]==result){
				time++;
			}
        	else {
				time--;
			}
        }
    	if(CheckMoreThanHalf(array, result)==false)
    	    result=0;
    	return result;
    }
    public static boolean CheckMoreThanHalf(int []array,int result){
    	int time=0;
    	for(int i=0;i<array.length;i++){
    		if(array[i]==result)
    			time++;
    	}
    	boolean isMoreThanHalf=true;
    	if(time*2<=array.length){
    		isMoreThanHalf=false;
    	}
    	return isMoreThanHalf;
    }
}
