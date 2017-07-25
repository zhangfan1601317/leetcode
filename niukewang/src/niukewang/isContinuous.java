package niukewang;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.text.Position.Bias;

public class isContinuous
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int [] num={3,5,6,8,0};
		System.out.println(isContinuous(num));

	}
	public static  boolean isContinuous(int [] numbers) {
        if(numbers==null||numbers.length<1){
        	return false;
        }
        Arrays.sort(numbers);
        int ZeroNum=0;
        int GapNum=0;
        for(int i=0;i<numbers.length;i++){
        	if(numbers[i]==0)
        		ZeroNum++;
        }
        int small=ZeroNum;
        int big=small+1;
        while(big<numbers.length){
        	if(numbers[small]==numbers[big])
        		return false;
        	GapNum+=numbers[big]-numbers[small]-1;
        	small=big;
        	big++;
        }
        return GapNum>ZeroNum?false:true;
    }

}
