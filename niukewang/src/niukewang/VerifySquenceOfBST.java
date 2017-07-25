package niukewang;

import java.awt.Robot;

import niukewang.Base.Sub;

public class VerifySquenceOfBST
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int [] se={7,4,6,5};
		System.out.println(VerifySquenceOfBST(se));

	}
    public static  boolean VerifySquenceOfBST(int [] sequence){
    	if(sequence.length==0)
    		return false;
    	if(sequence.length==1)
    		return true;
    	return Sub(sequence,0,sequence.length-1);
    }
    public static boolean Sub(int []sequence,int start,int end){
    	if(start>=end)
    		return true;
    	int i=0;   	
    	//往前找到左子树的尽头
    	while(i<end){
    		if(sequence[i]>sequence[end])
    			break;
    		i++;
    	}
    	for(int j=i;j<end;j++){
    		if(sequence[j]<sequence[end])
    			return false;
    	}
    	while(i>start&&sequence[i-1]>sequence[end])
    		i--;
    	for(int j=start;j<i-1;j++)
    		if(sequence[j]>sequence[end])
    			return false;
    	return Sub(sequence, start, i-1)&&Sub(sequence, i, end-1);  			
    }
    

}
