package niukewang;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class GetMedian
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	LinkedList<Integer>list=new LinkedList<>();
	public void Insert(Integer num) {
	    if(list.size()==0||num<list.getFirst()){
	    	list.addFirst(num);
	    }	    
	    else{
	    	boolean insertFlag=false;
	    	for(Integer e:list){
	    		if(num<e){
	    			int index=list.indexOf(e);
	    			list.add(index,num);
	    			insertFlag=true;
	    			break;
	    		}
	    	}
	    	if(!insertFlag){
	    		list.addLast(num);
	    	}
	    }
    }

    public Double GetMedian() {
        if(list.size()==0)
        	return null;
        if(list.size()%2==0){
        	int i=list.size()/2;
        	double res=Double.valueOf(list.get(i-1)+list.get(i))/2;
        	return res;
        }
        list.get(0);
        double res=Double.valueOf(list.get(list.size()+1)/2-1);
        return res;
    }

}
