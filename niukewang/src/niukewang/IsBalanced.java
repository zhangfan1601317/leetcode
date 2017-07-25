package niukewang;

public class IsBalanced
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		TreeNode root=new TreeNode(0);
		int depth=0;
		//return IsBalancedTree(root, depth);
		//System.out.println(IsBalancedTree(root, depth));

	}
	public static boolean IsBalanced (TreeNode root){
		 if(root==null)
			 return true;
		 int left=TreeDepth(root.left);
		 int right=TreeDepth(root.right);
		 int dif=left-right;
		 if(dif<-1||dif>1)
			 return false;
		 return IsBalanced(root.left)&&IsBalanced(root.right);		 
	 }
	public static  int TreeDepth(TreeNode root) {
        if(root==null){
        	return 0;
        }
        int left=TreeDepth(root.left);
        int right=TreeDepth(root.right);
        return left>right?(left+1):(right+1);	        
    }
	//这个鬼知道为啥不行呢？
	 boolean IsBalancedTree(TreeNode root,int depth){
		 if(root==null)
		 {
			 return  true;
		 }
		 int left=0,right=0;
		 if(IsBalancedTree(root.left, left)&&IsBalancedTree(root.right, right)){
			 int dif=left-right;
			 if(dif<-1||dif>1)
			 {
				 return false;				
			 }
			 depth=(left>right?left:right)+1;
			    return true;
		 }
		 return false;
	 }

}
