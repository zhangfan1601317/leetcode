
public class RansomNote383 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		boolean result = cansonstruct("a", "b");
		System.out.println(result);

	}

	static boolean cansonstruct(String ransomNote,String magazine) 
	{
		StringBuilder magzine=new StringBuilder(magazine);
		for(int i=0;i<ransomNote.length();i++)
		{
			int index=magzine.indexOf(ransomNote.charAt(i)+"");
			if(index>=0)
			{				
				magzine.deleteCharAt(index);
			}
			else 
			{
				return false;
			}
		}
		return true;
	}

	static boolean cansonstruct1(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length())
			return false;
		else {
			int a[] = new int[26];
			int b[] = new int[26];
			for (int i = 0; i < ransomNote.length(); i++)
				a[ransomNote.charAt(i) - 'a']++;
			for (int i = 0; i < magazine.length(); i++)
				b[magazine.charAt(i) - 'a']++;
			for (int i = 0; i < a.length; i++) {
				if (a[i] > b[i])
					return false;
			}
			return true;
		}
	}
}
