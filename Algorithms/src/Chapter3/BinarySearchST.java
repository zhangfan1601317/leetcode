package Chapter3;

import java.awt.RenderingHints.Key;

public class BinarySearchST<key extends Comparable<key>,Value>
{
	private Key[]keys;
	private Value [] vals;
	private int N;
	public BinarySearchST(int capacity){
		keys=(Key[])new Comparable[capacity];
		vals=(Value[])new Object[capacity];
	}
	public int size(){
		return N;
	}
	public Value get(Key key){
		
	}
	public int rank(Key key){
		int lo=0,hi=N-1;
		while(lo<=hi){
			int mid=lo+(hi-lo)/2;
			int cmp=key.
		}
	}
	
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}

}
