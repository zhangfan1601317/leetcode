package array;
import java.util.ArrayList;
public class PlusOne66 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []digits=new int[]{9,9,9};
		int []temp=new int[digits.length];		
		int carry=1;
		int flag=0;
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=digits.length-1;i>=0;i--)
		{
			temp[i]=(digits[i]+carry)%10;
			carry=(digits[i]+carry)/10;
			if(carry==0)
			{
				flag=i;
				break;
			}				
		}
		if(carry==1)
		{
			list.add(1);
		}
		for(int i=0;i<digits.length;i++)
		{	
			if(i<flag)
			list.add(digits[i]);
			else
			list.add(temp[i]);
		}
		int[] plusOne = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            plusOne[i] = list.get(i);
            System.out.print(plusOne[i]+" ");
        }		
	}
}
