package niukewang;

public class GetNumberOfK
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int [] array={1,3,3,3,3,4,5};
		int k=6;
		System.out.println(GetNumberOfK(array, k));

	}
	public static  int GetNumberOfK(int [] array , int k) {
	     int num=0;
	     if(array!=null&&array.length>0){
	    	  int first=GetFirstK(array, k, 0, array.length-1);
	     int last=GetLastK(array, k, 0, array.length-1);
	     if (first>-1&&last>-1)
	    	 num=last-first+1;
	     }		    
	     return num;
    }
	public static int GetFirstK(int [] array,int k,int start,int end){
		  if(start>end)
	    	   return -1;
	       int mid=(start+end)/2;
	       int data=array[mid];
	       if(data==k){
	    	   if((mid>0&&array[mid-1]!=k)||mid==0)
	    		   return mid;
	    	   else
	    		   end=mid-1;
	       }
	       else if(data>k)
	    	   end=mid-1;
	       else {
			start=mid+1;
		}
	       return GetFirstK(array,k,start,end);
	}
	public static int GetLastK(int [] array,int k,int start,int end){
		if(start>end)
			return -1;
		int mid=(start+end)/2;
		int data=array[mid];
		if(data==k){
			if((mid<array.length-1&&array[mid+1]!=k)||mid==array.length-1)
				return mid;
			else
				start=mid+1;
		}
		else if(data<k)
			start=mid+1;
		else {
			end=mid-1;
		}
		return GetLastK(array, k, start, end);
	}

}
