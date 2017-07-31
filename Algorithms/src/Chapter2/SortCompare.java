package Chapter2;

import java.util.Scanner;

public class SortCompare
{

	public static double time(String alg, Comparable []a){
		Stopwatch timer=new Stopwatch();
		if(alg.equals("Insertion"))
		    Insertion.sort(a);
		if(alg.equals("Selection"))
			Selection.sort(a);
		if(alg.equals("Shell"))
			Shell.sort(a);
		if(alg.equals("Merge"))
			Merge.sort(a);
		if(alg.equals("MergeBU"))
			MergeBU.sort(a);
		return timer.elapsedTime();
	}
	public static double timeRandomInput(String alg,int N,int T){
		double total=0.0;
		Double [] a=new Double[N];
		for(int t=0;t<T;t++){
			for(int i=0;i<N;i++)
				a[i]=StdRandom.uniform();
			total+=time(alg, a);
		}
		return total;
	}
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String alg1="Insertion";
		String alg2="Selection";
		int N=Integer.parseInt("100");
		int T=Integer.parseInt("10");
		double t1=timeRandomInput(alg1, N, T);
		double t2=timeRandomInput(alg2, N, T);
		StdOut.printf("for %d random double\n  %s is", N,alg1);
		StdOut.printf(" %.1f time faster than %s\n",t2/t1, alg2);
	}

}
