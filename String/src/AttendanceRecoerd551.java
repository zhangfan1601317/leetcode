
public class AttendanceRecoerd551
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String student="PPALLL";
		System.out.println(checkRecord(student));

	}
	public static  boolean checkRecord(String s) {
        int countA=0;
		for(int i=0;i<s.length();i++)
        {
        	if(s.charAt(i)=='A')
        		countA++;
        	if(countA>1)
        		return false;
        	if(s.contains("LLL"))
        		return false;       		
        }
		return true;
    }
}
