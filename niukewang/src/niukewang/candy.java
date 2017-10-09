package niukewang;

public class candy
{

	public static int candy(int[] ratings) {
        int Total=0;
        int length=0;
        int pre=1;
        int dec=pre;
        int start=0;
        if(start<ratings.length){
        	Total++;
        	for(int i=start+1;i<ratings.length;i++){
        		if(ratings[i]<ratings[i-1]){
        			length++;
        			if(dec<=length){
        				Total++;
        			}
        			Total+=length;
        			pre=1;
        		}
        		else{
        			int cur=0;
        			if(ratings[i]>ratings[i-1])
        				cur=pre+1;
        			else
        				cur=1;
        			Total+=cur;
        			length=0;
        			dec=cur;
        			pre=cur;
        		}        		
        	}
        }
        return Total;
    }
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int ratings[]=new int[]{1,2};
		int res=candy(ratings);
		System.out.println(res);

	}

}
