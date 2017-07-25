package niukewang;

public class minNumberInRotateArray
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	public static  int minNumberInRotateArray(int [] array) {
    	if(array==null||array.length==0)
    		return 0;
    	int index1=0;
    	int index2=array.length-1;
    	int mid=index1;
    	while(array[index1]>=array[index2]){
    		if(index2-index1==1)
    		{
    			mid=index2;
    			break;
    		}
    		mid=(index1+index2)/2;
    		if(array[index1]==array[index2]&&array[index1]==array[mid])
    		{
    			return  minNumber(array, index1, index2);
    		}
    		if(array[mid]>=array[index1])
    			index1=mid;
    		else if(array[mid]<=array[index2])
    			index2=mid;
    	}
        return array[mid];
    }
	public static int minNumber(int []array,int index1,int index2){
    	int res=array[index1];
    	for(int i=index1;i<=index2;i++){
    		if(res>array[i])
    			res=array[i];
    	}
    	return res;
    }
}
