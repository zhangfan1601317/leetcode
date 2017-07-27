package niukewang;

import java.util.Scanner;

public class makePalindrome
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String str=in.next();
			int [] num=new int ['z'-'a'+1];
			for(int i=0;i<str.length();i++){
				num[str.charAt(i)-'a']++;
			}
			int cnt=0;
			for(int i=0;i<num.length;i++){
				if((num[i]&1)==1)
					cnt++;
			}
			System.out.println(cnt);
		}
	}

}
