import java.rmi.dgc.Lease;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {

//		Scanner in=new Scanner(System.in);
//		int num=in.nextInt();
//		in.close();
//		String s=intToRoman(num);
//		System.out.println(s);
		
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		in.close();
		System.out.println(s.length());
		int num=RomanToInt(s);
		System.out.println(num);
		
	}
	public static String intToRoman(int num) {
        int[] base = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] str = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX",
                "V", "IV", "I" };
        String roman = "";
        int i = 0;
        //Ì°ÐÄËã·¨
        while (num != 0) {
            if (num >= base[i]) {
                num -= base[i];
                roman += str[i];
            } else
                i++;
        }
        return roman;
    }
	public static int RomanToInt(String s)
	{
		if(s.length()==0||s==null)
			return 0;	
		int result=0;
		for(int i=0;i<s.length();i++)
		{
			switch (s.charAt(i)) {
			case 'M':
				result+=1000;				
				break;
			case 'D':
				result+=500;				
				break;
			case 'C':{
				if(i<s.length()-1){
					if(s.charAt(i+1)=='M'){
						result+=900;
					    i++;
					}						
					else if(s.charAt(i+1)=='D'){
						result+=400;
						i++;
					}						
					else
						result+=100;
					break;
				}
				else{
					result+=100;
					break;
				}
			}				
			case 'L':
				result+=50;
				break;
			case 'X':{
				if(i<s.length()-1){
					if(s.charAt(i+1)=='C'){
						result+=90;	
						i++;
					}											
					else if(s.charAt(i+1)=='L'){
						result+=40;
						i++;
					}						
					else
						result+=10;
					break;
				}
				else{
					result+=10;
					break;
				}
			}
			case 'V':
				result+=5;
				break;
			case 'I':{
				if(i<s.length()-1){
					if(s.charAt(i+1)=='X'){
						result+=9;
						i++;
					}						
					else if(s.charAt(i+1)=='V'){
						result+=4;
						i++;
					}						
					else
						result+=1;
					break;
				}
				else{
					result+=1;
					break;
				}
					
			}
			default:
				break;
			}
		}
		return result;
	}

}
