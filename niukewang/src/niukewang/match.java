package niukewang;

public class match
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String aString="aa.a";
		String bString="ab*a";
		String cString="ab*ac*a";		
		System.out.println(match(aString.toCharArray(), bString.toCharArray()));
		System.out.println(match(aString.toCharArray(),cString.toCharArray()));		
	}
	public static  boolean match(char[] str, char[] pattern)
    {
        if(str==null||pattern==null)
        	return false;
        int strIndex=0;
        int patternIndex=0;
        return mathCore(str, strIndex, pattern, patternIndex);
    }
	public static  boolean mathCore(char []str,int strIndex,char[]pattern,int patternIndex){
		if(strIndex==str.length&&patternIndex==pattern.length){
			return true;
		}
		if(strIndex!=str.length&&patternIndex==pattern.length){
			return false;
		}
		if(patternIndex+1<pattern.length&&pattern[patternIndex+1]=='*'){
			if(strIndex!=str.length&&(pattern[patternIndex]==str[strIndex]||pattern[patternIndex]=='.'))
			return mathCore(str, strIndex, pattern, patternIndex+2)
					||mathCore(str, strIndex+1, pattern, patternIndex+2)
					||mathCore(str, strIndex+1, pattern, patternIndex);
			else
				return mathCore(str, strIndex, pattern, patternIndex+2);			
		}
		if((strIndex!=str.length&&(pattern[patternIndex]==str[strIndex]||pattern[patternIndex]=='.')))
			return mathCore(str, strIndex+1, pattern, patternIndex+1);
		return false;
	}
}
