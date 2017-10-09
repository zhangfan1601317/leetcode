package niukewang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Point{
	public int x;
	public int y;
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}
public class NumericKeypad
{
//	private static final int [][]boost=new int[][]{
//		{0},
//		{0,1,2,3,4,5,6,7,8,9},
//		{0,2,3,5,6,8,9},
//		{3,6,9},
//		{0,4,5,6,7,8,9},
//		{0,5,6,8,9},
//		{6,9},
//		{0,7,8,9},
//		{0,8,9},
//		{9}
//	};
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根		
		Scanner in=new Scanner(System.in);		
		int T=in.nextInt();
		List<String>list=new ArrayList<String>();
		for(;T-->0;){
			int [] indexNum=stringToIntArray(in.nextLine());
			for(int i=0;i<indexNum.length-1;i++){
				while(!reach(indexNum[i], indexNum[i+1])){
					if(--indexNum[i+1]<0)
						indexNum[i--]--;
					for(int j=i+2;j<indexNum.length;j++){
						indexNum[j]=9;
					}
					if(i==-1)
						i=0;
				}
				list.add(intArrayToString(indexNum));
			}
			in.close();
			for(String string:list)
				System.out.println(string);
		}
		
	}
	public static String intArrayToString(int [] numArray)
	{
	StringBuilder ret = new StringBuilder();
	for (int i = 0; i < numArray.length; i++) {
	ret.append(numArray[i]);
	}
	return ret.toString();
	}
	public static Point locate(int digit){
		int x=0,y=0;
		digit=digit>0?--digit:10;
		x=digit/3;
		y=digit%3;
		return new Point(x, y);
	}
	public static boolean reach(int x,int y){
		Point xPoint=locate(x);
		Point yPoint=locate(y);
	    return xPoint.x<=yPoint.x&&xPoint.y<=yPoint.y;	
	}
	public static int[]stringToIntArray(String numString){
		int []ret=new int[numString.length()];
		for(int i=0;i<numString.length();i++){
			ret[i]=Integer.parseInt(numString.toCharArray()[i]+"");
		}
		return ret;
	}
}
