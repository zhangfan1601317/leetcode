package niukewang;

public class minCut
{

	public  static int minCut(String s) {
		if(s==null||s.length()==0||s.length()==1)
			return 0;
		int [][]map=new int[s.length()][s.length()];
		int [] cut=new int [s.length()+1];
		for(int i=s.length()-1;i>=0;i--){
			cut[i]=s.length()-i;
			for(int j=i;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j))
				{
					if(j-i<2||map[i+1][j-1]==1){
						map[i][j]=1;
						cut[i]=Math.min(cut[i], cut[j+1]+1);
					}
				}			
			}
		}
		return cut[0]-1;
    }
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String string="ccaacabacb";
		System.out.println(minCut(string));

	}

}
