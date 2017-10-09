package niukewang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

//Definition for undirected graph.
  class UndirectedGraphNode {
      int label;
      ArrayList<UndirectedGraphNode> neighbors;
      UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
  };

public class cloneGraph
{

	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		if(node==null)
        	return node;
		
		HashMap<UndirectedGraphNode, UndirectedGraphNode>map=new HashMap<>();
        LinkedList<UndirectedGraphNode> list=new LinkedList<>();
        UndirectedGraphNode copy=new UndirectedGraphNode(node.label);
        map.put(node, copy);
        list.add(node);
        
        while(!list.isEmpty()){
        	UndirectedGraphNode curnode=list.poll();
        	for(UndirectedGraphNode neigh:curnode.neighbors){
        		if(!map.containsKey(neigh)){
        			list.add(neigh);
        			UndirectedGraphNode newneigh=new UndirectedGraphNode(neigh.label);
        			map.put(neigh, newneigh);
        		}
        		map.get(curnode).neighbors.add(map.get(neigh));
        	}
        }
        return copy;
    }
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}

}
