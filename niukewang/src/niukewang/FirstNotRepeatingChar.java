package niukewang;

public class FirstNotRepeatingChar
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String test="fghhfnsdl";
		System.out.println(FirstNotRepeatingChar(test));

	}
	public static  int FirstNotRepeatingChar(String str) {
        char [] strChar=str.toCharArray();
        int [] hash=new int['z'-'A'+1];
        System.out.println(hash.length);
        for(char i:strChar){
        	hash[(int)(i-'A')]++;
        }
        for(int i=0;i<strChar.length;i++){
        	if(hash[(int)(strChar[i]-'A')]==1)
        		return i;        	
        }
        return -1;
        	
        
        
    }

}
