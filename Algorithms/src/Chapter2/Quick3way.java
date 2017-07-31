package Chapter2;

import Chapter1.StdOut;

public class Quick3way
{
	public static void  sort(Comparable[] a){
		StdRandom.shuffle(a);//消除对输入的依赖
		sort(a, 0, a.length-1);
	}
	private static void sort(Comparable[] a,int lo,int hi){
		if(hi<=lo)return;
		int lt=lo,i=lo+1,gt=hi;
		Comparable v=a[lo];
		while(i<=gt){
			int cmp=a[i].compareTo(v);
			if(cmp<0) exch(a, lt++, i++);
			else if(cmp>0) exch(a, i, gt--);
			else i++;
		}
		sort(a, lo, lt-1);
		sort(a, gt+1, hi);
	}
	private static int partion(Comparable[] a,int lo,int hi){
		int i=lo,j=hi+1;
		Comparable v=a[lo];
		while(true){
			while(less(a[++i], v)) if(i==hi)break;
			while(less(v, a[--j])) if(j==lo)break;
			if(i>=j) break;
			exch(a, i, j);
		}
		exch(a, lo, j);
		return j;
	}
	private static boolean less(Comparable v,Comparable w){
		return v.compareTo(w)<0;
	}
	private static void exch(Comparable [] a,int i,int j){
		Comparable t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	private static void show(Comparable []a)
	{
		for(int i=0;i<a.length;i++){
			StdOut.print(a[i]+" ");
		}
		StdOut.println();
	}
	public static boolean isSorted(Comparable []a){
		for(int i=1;i<a.length;i++){
			if(less(a[i], a[i-1]))
				return false;			
		}
		return true;
	}
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String [] a={"S","O","R","T","E","X","A","M","P","L","E"};
		sort(a);
		assert isSorted(a);
		show(a);
	}
}
