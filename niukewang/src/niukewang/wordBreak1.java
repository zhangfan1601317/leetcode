package niukewang;

import java.util.Set;

public class wordBreak1
{
	public boolean wordBreak(String s, Set<String> dict) {
		if(s==null||s.length()==0)
			return true;
		boolean res[]=new boolean[s.length()+1];
		res[0]=true;
		for(int i=0;i<s.length();i++){
			StringBuilder str=new StringBuilder(s.substring(0, i+1));
			for(int j=0;j<=i;j++){
				if(res[j]&&dict.contains(str.toString())){
					res[i+1]=true;
					break;
				}
				str.deleteCharAt(0);
			}
			
		}
		return res[s.length()];
    }
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}

}
