package Chapter2;

import java.util.Scanner;

import Chapter1.In;
import Chapter1.StdIn;
import Chapter1.StdOut;

public class Example
{
	//选择排序
	public static void  sort(Comparable[] a)
	{
		int N=a.length;
		for(int i=0;i<N;i++){//每次循环找到最小的左边的不动，只改变右边的
			int min=i;
			for(int j=i+1;j<N;j++)
				if(less(a[j], a[min]))//a[j]<a[min]交换
					min=j;
			exch(a, i, min);
		}
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