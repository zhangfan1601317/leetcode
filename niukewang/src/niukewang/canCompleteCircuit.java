package niukewang;

public class canCompleteCircuit
{

    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas==null||gas.length==0||gas.length!=cost.length)
        	return -1;
        int sum=0;
        int start=0;
        int total=0;
        for(int i=0;i<gas.length;i++){
        	total+=(gas[i]-cost[i]);
        	if(sum<0){
        		sum=gas[i]-cost[i];
        		start=i;
        	}
        	else{
        		sum+=(gas[i]-cost[i]);
        	}
        }
        if(total<0)
        	return -1;
        else
        	return start;
    }
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}

}
