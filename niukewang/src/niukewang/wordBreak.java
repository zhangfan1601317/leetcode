package niukewang;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class wordBreak
{
	public static  ArrayList<String> wordBreak(String s, Set<String> dict) {
        ArrayList<String>list=new ArrayList<>();
        if(s==null||s.length()==0)
        	return list;
        judge(s, dict, 0, "", list);
        return list;
       
    }
	public  static void judge(String s,Set<String>dict,int start,String term,ArrayList<String> res){
		if(start>s.length()){
			res.add(term);
			return ;
		}			
		StringBuffer sb=new StringBuffer();
		while(start<s.length()){
			sb.append(s.charAt(start));
			if(dict.contains(sb.toString())){
	            String newterm=term.length()>0?(term+" "+sb.toString()):(sb.toString());
				judge(s, dict, start+1, newterm, res);
			}
			start++;
		}
	}
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		 String s ="catsanddog";
		 Set<String> dict=new HashSet<String>();
		 dict.add("cat");
		 dict.add("cats");
		 dict.add("and");
		 dict.add("sand");
		 dict.add("dog");
		 ArrayList<String>result=wordBreak(s, dict);
		 System.out.println(result);

	}

}
