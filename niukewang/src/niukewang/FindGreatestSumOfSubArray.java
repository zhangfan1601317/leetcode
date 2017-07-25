package niukewang;

public class FindGreatestSumOfSubArray
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		//int [] array={6,-3,-2,7,-15,1,2,2};
		int [] array={-2,-8,-1,-5,-9};
		System.out.println(FindGreatestSumOfSubArray(array));

	}
    public static  int FindGreatestSumOfSubArray(int[] array) {
        if(array==null||array.length==0){
        	return 0;
        }
    	int cursum=array[0];
        int sum=cursum;
        for(int i=1;i<array.length;i++){        	
        	cursum+=array[i]; 
        	if(cursum<array[i])
        		cursum=array[i];
        	if(cursum>sum)
        		sum=cursum;  
        	     	
        }
        return sum;
    }

}
