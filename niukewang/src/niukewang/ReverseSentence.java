package niukewang;

public class ReverseSentence
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String string="student. a am I";
		System.out.println(ReverseSentence(string));

	}
    public static  String ReverseSentence(String str) {
    	if(str.trim().equals(""))
    		return str;
    	String[] s=str.split(" ");
    	StringBuffer sb=new StringBuffer();
    	for(int i=s.length-1;i>=0;i--){
    		sb.append(s[i]);
    		if(i>0){
    			sb.append(" ");
    		}
    	}
        return sb.toString();
    }

}
