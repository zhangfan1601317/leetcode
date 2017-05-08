
public class AddBinary67
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String a="1111";
		String b="1111";
		System.out.println(addBinary(a, b));

	}
	public static String addBinary(String a, String b) {
		String result="";
		int length=Math.max(a.length(), b.length());		
        int []sa=new int[a.length()];
        int []sb=new int[b.length()];       
        int []sc=new int[length];
        for(int i=0;i<a.length();i++)
        {
        	sa[i] = Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        for(int j=0;j<b.length();j++)
        {
        	sb[j]=Integer.parseInt( String.valueOf(b.charAt(j)));
        }
        int carry=0;
        int a_index=a.length()-1;
        int b_index=b.length()-1;
        for(int i=length-1;i>=0;i--)
        {
        	if(a_index>=0&&b_index>=0)  
        	{
        		sc[i]=sa[a_index]+sb[b_index]+carry; 
        		carry=0;
        	}
        	else if(a_index>=0&&b_index<0)
        	{
        		sc[i]=sa[a_index]+carry;
        		carry=0;
        	}
        	else if(a_index<0&&b_index>=0)
        	{
        		sc[i]=sb[b_index]+carry;
        		carry=0;
        	}
        	else 
        		break;
        	if(sc[i]==2)
        	{
        		sc[i]=0;
        		carry=1;
        	}
        	if(sc[i]==3)
        	{
        		sc[i]=1;
        		carry=1;
        	}
        	a_index--;
        	b_index--;
        }        
        if(carry==1)
        	result+=carry+"";
        for(int i=0;i<length;i++)
        {
        	result+=sc[i]+"";
        }
        return result;
    }
}
