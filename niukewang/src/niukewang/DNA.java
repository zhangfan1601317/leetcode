package niukewang;

import java.util.Scanner;

public class DNA
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String input=in.next();
			int max=0;
			int cnt=0;
			for(int i=0;i<input.length();i++){
				if(input.charAt(i)=='A'||input.charAt(i)=='C'||input.charAt(i)=='G'||input.charAt(i)=='T'){
					cnt++;
				}
				else{
					cnt=0;
				}
				if(cnt>max)
					max=cnt;
			}
			System.out.println(max);
		}
	}

}
