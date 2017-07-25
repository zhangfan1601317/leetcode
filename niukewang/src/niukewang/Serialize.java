package niukewang;

public class Serialize
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	String Serialize(TreeNode root) {
        if(root==null)
        	return "";
        StringBuffer sb=new StringBuffer();
        SubSerialize(root, sb);
        return sb.toString();
	}
	void SubSerialize(TreeNode root,StringBuffer sb){
		if(root==null){
			sb.append("#,");
			return;
		}
		sb.append(root.val);
		sb.append(',');
		SubSerialize(root.left, sb);
		SubSerialize(root.right, sb);
	}
	int index=-1;
	TreeNode Deserialize(String str) {
	    if(str.length()==0)
	    	return null;
	    String[] strs=str.split(",");
	    return SubDeserialize(strs);
	}
	TreeNode SubDeserialize(String[] strs){
		index++;
		if(!strs[index].equals("#")){
			TreeNode root=new TreeNode(0);
			root.val=Integer.parseInt(strs[index]);
			root.left=SubDeserialize(strs);
			root.right=SubDeserialize(strs);
			return root;
		}
		return null;
	}

}
