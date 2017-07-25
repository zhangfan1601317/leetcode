package niukewang;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindPath
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		TreeNode root=new TreeNode(0);
		int target=0;
		System.out.println(FindPath(root,target));
		

	}
    public static   ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
    	 ArrayList<ArrayList<Integer>> listALL=new ArrayList<ArrayList<Integer>>();
         ArrayList<Integer>list=new ArrayList<>();
        if(root==null)
        	return null;
        list.add(root.val);
        target-=root.val;
        if(target==0&&root.left==null&&root.right==null)
        	listALL.add(new ArrayList<Integer>(list));
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size()-1);
        return listALL;
    }
    public static   ArrayList<ArrayList<Integer>> FindPath1(TreeNode root,int target){
    	ArrayList<ArrayList<Integer>>listAll=new ArrayList<ArrayList<Integer>>();
    	if(root==null||root.val>target)
    		return listAll;
    	ArrayList<Integer>list=new ArrayList<>();
    	findpath(root, target, listAll, list);
    	return listAll;
    	
    }
    private static void findpath(TreeNode root,int target,ArrayList<ArrayList<Integer>> listAll,  ArrayList<Integer> list){
    	if(root==null||root.val>target)
    		list.clear();
    	else if(root.val==target){
    		if(root.left==null&&root.right==null)
    		{
    			list.add(root.val);
    			listAll.add(list);
    		}
    		else
    			list.clear();
    	}
    	else {
			list.add(root.val);
			ArrayList<Integer> list2=new ArrayList<>();
			list2.addAll(list);
			target-=root.val;
			findpath(root.left, target, listAll, list);
			findpath(root.right, target, listAll, list2);
		}
    }
}
