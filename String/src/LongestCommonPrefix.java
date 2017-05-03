import javax.swing.plaf.basic.BasicSliderUI.ScrollListener;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String strs[]=new String[]{"c","c"};
		System.out.println(longestCommonPrefix1(strs));
	}
	public static String longestCommonPrefix(String[] strs) {
		 if(strs==null||strs.length==0)
			 return "";
		 if(strs.length==1)
			 return strs[0];
		 for(int i=0;i<strs.length;i++)
		 {
			 if(strs[i].length()==0||strs[i]==null)
				 return"";
		 }		 
		 int length=strs[0].length();
		 int shortest=0;
		 for(int i=1;i<strs.length;i++)
		 {
			 if(strs[i].length()<length){
				 length=strs[i].length();
				 shortest=i;
			 }
		 }
		 for(int i=0;i<length;i++)
		 {
			 char x=strs[shortest].charAt(i);
			 {
				 for(int j=0;j<strs.length;j++)
				 {
					 if(strs[j].charAt(0)!=strs[shortest].charAt(0))
						 return "";
					 if(strs[j].charAt(i)!=x)
						 return strs[shortest].substring(0, i);
				 }
			 }
		 }
		 return strs[shortest];		
    }
	public static String longestCommonPrefix1(String[] strs){
		if(strs==null||strs.length==0)
			return "";
		String pre=strs[0];
		int i=1;
		while(i<strs.length)
		{
			while(strs[i].indexOf(pre)!=0)
			{
				pre=pre.substring(0, pre.length()-1);
			}
			i++;
		}
		return pre;
	}
}