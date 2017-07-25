package niukewang;

import java.util.ArrayList;
import java.util.Collections;

public class Permutation
{
	public static  void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String string="aa";
		System.out.println(Permutation(string));

	}
	public static  ArrayList<String> Permutation(String str) {
		ArrayList<String>list=new ArrayList<>();
		if(str==null||str.length()==0)
			return list;
		per(str.toCharArray(), 0, str.length(), list);
		Collections.sort(list);		
		return list;
		
    }
	public static  void per(char[]str,int start,int size,ArrayList<String>list){
		if(start==size)
			list.add(new String(str));
		else{
			for(int i=start;i<size;i++){
				if(i!=start&&str[i]==str[start])
					continue;
				else{
					swap(str,i,start);
					per(str, start+1, size, list);
					swap(str,start,i);
				}
			}
		}
	}
	public static  void swap(char[] str,int index1,int index2){
		if(index1!=index2){
			char temp=str[index1];
			str[index1]=str[index2];
			str[index2]=temp;
		}
	}
}
