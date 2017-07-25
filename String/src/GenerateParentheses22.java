import java.util.ArrayList;
import java.util.Scanner;

public class GenerateParentheses22
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		System.out.println(generateParenthesis(n));

	}
	public static ArrayList <String> generateParenthesis(int n) {
        ArrayList<String>list=new ArrayList<>();
        String res=new String();
        if(n<=0)
        	return list;
        dfs(list,res,n,n);
        return list;
    }
	public static void dfs(ArrayList<String> list,String res,int left,int right){
		if(left>right)
			return;
		if(left==0&&right==0){
			list.add(new String(res));
			return;
		}
		if(left>0)
			dfs(list, res+'(', left-1, right);
		if(right>0)
			dfs(list, res+')', left, right-1);
	}
}
