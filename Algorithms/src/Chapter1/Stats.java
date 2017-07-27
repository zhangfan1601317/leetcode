package Chapter1;

import java.util.Queue;

public class Stats
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		Bag<Double>numbers=new Bag<>();
		while(!StdIn.isEmpty()){
			numbers.add(StdIn.readDouble());
			int N=numbers.size();
			double sum=0.0;
			for(double x:numbers){
				sum+=x;
			}
			double mean=sum/N;
			sum=0.0;
			for(double x:numbers)
				sum+=(x-mean)*(x-mean);
			double std=Math.sqrt(sum/(N-1));
			StdOut.printf("Mean:%.2f\n",mean);
			StdOut.printf("Std dev:%.2f\n", std);			
		}
	}
	public static int[] readInts(String name){
		In in=new In(name);
		Chapter1.Queue<Integer>queue=new Chapter1.Queue<>();
		while(!in.isEmpty()){
			queue.enqueue(in.readInt());
		}
		int N=queue.size();
		int [] a=new int[N];
		for(int i=0;i<N;i++){
			a[i]=queue.dequeue();
		}
		return a;
	}
}
