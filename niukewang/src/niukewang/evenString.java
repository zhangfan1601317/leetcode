package niukewang;

import java.util.Scanner;

import javax.jws.Oneway;

public class evenString
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String str=in.next();
			int len=str.length()-2;
			while(len>=0){
				int mid=len/2;
				if(str.substring(0,mid).equals(str.substring(mid,len)))
					break;
				else{				
					len-=2;
				}
					
			}	
			System.out.println(len);
		}
	}

}
