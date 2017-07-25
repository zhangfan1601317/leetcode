package niukewang;

public class InversePairs
{
//谁知道这个的解决办法 还是没提交成功呢！
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int array[]={1,2,3,4,5,6,7,0};				
		//int array[]={7,5,6,4};
		System.out.println(InversePairs(array));
	}
    public static  int InversePairs(int [] array) {
        if(array==null||array.length<=0)
        	return 0;
        int length=array.length;
        int [] copy=new int [length];
        for(int i=0;i<length;i++){
        	copy[i]=array[i];
        }
        int count=SubInversePair(array, copy, 0, length-1);//数值过大求余
        return count;
    }
    public static int SubInversePair(int []array,int []copy,int start,int end){
    	if(start==end){
    		return 0;
    	}
    	
    	int length=(start+end)>>1;
    	
    	int left=SubInversePair(array, copy, start, length)%1000000007;
    	int right=SubInversePair(array, copy,length+1, end)%1000000007;
    	
    	int i=length;
    	int j=end;
    	int indexcopy=end;
    	int count=0;
    	
    	while(i>=start&&j>=length+1){
    		if(array[i]>array[j]){
    			copy[indexcopy--]=array[i--];
    			count+=j-length;
    			if(count>=1000000007){
    				count%=1000000007;
    			}
    		}
    		else{
    			copy[indexcopy--]=array[j--];
    		}
    	}
    	for(;i>=start;i--){
    		copy[indexcopy--]=array[i];
    	}
    	for(;j>length;j--){
    		copy[indexcopy--]=array[j];
    	}
    	for(int s=start;s<=end;s++)
        {
            array[s] = copy[s];
        }
    	return (left+right+count)%1000000007;
    }  

}
