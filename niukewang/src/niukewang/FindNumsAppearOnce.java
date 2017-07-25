package niukewang;

public class FindNumsAppearOnce
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array==null||array.length<2){
        	return ;
        }
        int resultOR=0;
        for(int i=0;i<array.length;i++){
        	resultOR^=array[i];
        }
        int index1=FirstBitIs1(resultOR);
        for(int i=0;i<array.length;i++){
        	if(isBit(array[i],index1))
        		num1[0]^=array[i];
        	else
        		num2[0]^=array[i];
        }
        
    }
    public static int FirstBitIs1(int num){
    	int indexBit=0;
    	while((num&1)==0&&(indexBit<32)){
    		num=num>>1;
    	    indexBit++;
    	}
    	return indexBit;
    }
    public static  boolean isBit(int num,int indexBit){
    	num=num>>indexBit;
        return(num&1)==1;
    }

}
