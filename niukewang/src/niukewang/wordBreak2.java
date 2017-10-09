package niukewang;

import java.util.ArrayList;
import java.util.Set;

public class wordBreak2
{
	public ArrayList<String> wordBreak(String s, Set<String> dict){
		ArrayList<String>lists=new ArrayList<>();
		ArrayList<String>strings=new ArrayList<>();
		int len=s.length();
		dfs(s, len, dict, lists, strings);
		return lists;
		
	}
	public void  dfs(String s,int len,Set<String>dict,ArrayList<String>lists,ArrayList<String>strings)
	{
		if(len<=0){
			int size=strings.size()-1;
			StringBuffer sb=new StringBuffer();
			for(;size>=0;size--){
				sb.append(strings.get(size));
				if(size!=0)
					sb.append(" ");
			}
			lists.add(sb.toString());
		}
		for(int k=len-1;k>=0;k--){
			if(dict.contains(s.substring(k, len))){
				strings.add(s.substring(k, len));
				dfs(s, k, dict, lists, strings);
				strings.remove(strings.size()-1);
			}
		}
	}
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}

}
