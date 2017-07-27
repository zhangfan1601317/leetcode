package niukewang;

import java.util.Scanner;

public class ceramictile
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
//		Scanner in=new Scanner(System.in);
//		while(in.hasNext()){
//			String string=in.next();
//			int max=0;
//			int i=0;
//			while(i<=string.length()-1){
//				int cur=minNum(string, i);
//				if(cur==1){
//					i++;
//				}else{
//					max+=cur/2;
//					i+=cur;
//				}
//			}
//			System.out.println(max);
//		}		
		getMinNum();
	}
	public static int minNum(String string,int start){
		int result=1;
		while(start<string.length()-1){
			if(string.charAt(start)==string.charAt(start+1)){
				result++;
				start++;
			}else{
				break;
			}
		}
		return result;
	}
	public static void getMinNum(){
		Scanner in=new Scanner(System.in);
		int count=0;
		while(in.hasNext()){
			String string=in.next();
			int len=string.length();			
			for(int i=1;i<len;i++){
				if(string.charAt(i)==string.charAt(i-1)){
					count++;
					i++;
				}
			}
			System.out.println(count);
		}
	}
}
