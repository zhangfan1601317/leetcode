package niukewang;

import java.awt.Robot;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Print
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	public static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		
		ArrayList<ArrayList<Integer>> listAll=new ArrayList<ArrayList<Integer>>();
		if(pRoot==null)
			return listAll;
		Stack<TreeNode>s1=new Stack<>();
		s1.add(pRoot);
		Stack<TreeNode>s2=new Stack<>();
		while(!s1.isEmpty()||!s2.isEmpty()){
			if(!s1.isEmpty()){
				ArrayList<Integer>list=new ArrayList<>();
				while(!s1.isEmpty()){
					TreeNode pNode=s1.pop();
					list.add(pNode.val);
					if(pNode.left!=null){
						s2.add(pNode.left);
					}
					if(pNode.right!=null){
						s2.add(pNode.right);
					}
				}
				listAll.add(list);
			}
			else{
				ArrayList<Integer>list2=new ArrayList<>();
				while(!s2.isEmpty()){
					TreeNode pNode=s2.pop();
					if(pNode.right!=null){
						s1.add(pNode.right);
					}
					if(pNode.left!=null){
						s1.add(pNode.left);
					}
					list2.add(pNode.val);
				}
				listAll.add(list2);
			}
		}
		return listAll;
			
		
    }
    public static ArrayList<ArrayList<Integer> > Print2(TreeNode pRoot) {		
		ArrayList<ArrayList<Integer>> listAll=new ArrayList<ArrayList<Integer>>();
		if(pRoot==null)
			return listAll;
		Queue<TreeNode>s1=new LinkedList<TreeNode>();
		s1.add(pRoot);
		Queue<TreeNode>s2=new LinkedList<TreeNode>();
		while(!s1.isEmpty()||!s2.isEmpty()){
			if(!s1.isEmpty()){
				ArrayList<Integer>list=new ArrayList<>();
				while(!s1.isEmpty()){
					TreeNode pNode=s1.poll();
					list.add(pNode.val);
					if(pNode.left!=null){
						s2.add(pNode.left);
					}
					if(pNode.right!=null){
						s2.add(pNode.right);
					}
				}
				listAll.add(list);
			}
			else{
				ArrayList<Integer>list2=new ArrayList<>();
				while(!s2.isEmpty()){
					TreeNode pNode=s2.poll();
					if(pNode.left!=null){
						s1.add(pNode.left);
					}
					if(pNode.right!=null){
						s1.add(pNode.right);
					}
					list2.add(pNode.val);
				}
				listAll.add(list2);
			}
		}
		return listAll;
			
		
    }
    public static ArrayList<ArrayList<Integer> > Print3(TreeNode pRoot) {	
    	ArrayList<ArrayList<Integer>>listAll=new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer>list1=new ArrayList<>();
    	if(pRoot==null)
    		return listAll;
    	LinkedList<TreeNode>list=new LinkedList<>();
    	int current=1;
    	int next=0;
    	TreeNode pNode;
    	list.add(pRoot);
    	while(list.size()>0){
    		pNode=list.remove(0);
    		current--;
    		list1.add(pNode.val);
    		if(pNode.left!=null){
    			list.add(pNode.left);
    			next++;
    		}
    		if(pNode.right!=null){
    			list.add(pNode.right);
    			next++;
    		}
    		if(current==0){
    			listAll.add(new ArrayList<Integer>(list1));
    			list1.clear();
    			current=next;
    			next=0;
    		}
    	}
    	return listAll;
    }
}
