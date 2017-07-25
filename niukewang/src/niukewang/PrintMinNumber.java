package niukewang;

import java.util.Arrays;
import java.util.Comparator;

public class PrintMinNumber
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int [] num={3,32,321};
		System.out.println(PrintMinNumber(num));

	}
	public static  String PrintMinNumber(int [] numbers) {
		if(numbers==null||numbers.length==0)
			return "";
		String [] str=new String[numbers.length];
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length;i++){
			str[i]=String.valueOf(numbers[i]);
		}
		Arrays.sort(str,new Comparator<String>()
		{
			public int compare(String s1,String s2){
				String add1=s1+s2;
				String add2=s2+s1;
				return add1.compareTo(add2);
			}
		});
		for(int i=0;i<str.length;i++){
			sb.append(str[i]);
		}
		return sb.toString();
    }

}
