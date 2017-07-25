package niukewang;

import java.util.ArrayList;

public class printMatrix
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int [][]matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println(printMatrix(matrix));

	}
	public static  ArrayList<Integer> printMatrix(int [][] matrix) {
	    ArrayList<Integer>list =new ArrayList<>();   
		if(matrix==null)
	    	   return null;
		int row=matrix.length;
		int col=matrix[0].length;
		if(row<=0||col<=0)
			return null;
		int start=0;
		while(col>start*2&&row>start*2){
			list.addAll(printMatrixInCircle(matrix, row, col, start));
			start++;
		}
		return list;
    }
	public static ArrayList<Integer> printMatrixInCircle(int[][] matrix,int row,int col,int start){
		ArrayList<Integer>list=new ArrayList<>();
		int endx=col-1-start;
		int endy=row-1-start;
		//from left to right
		for(int i=start;i<=endx;i++){
			int num=matrix[start][i];
			list.add(num);
		}
		//from up to down
		if(start<endy)
		{
			for(int i=start+1;i<=endy;i++){
				int num=matrix[i][endx];
				list.add(num);
			}
		}
		//from right to left
		if(start<endx&&start<endy){
			for(int i=endx-1;i>=start;i--){
				int num=matrix[endy][i];
				list.add(num);
			}
		}
		//from down to up
		if(start<endx&&start<endy-1){
			for(int i=endy-1;i>=start+1;i--){
				int num=matrix[i][start];
				list.add(num);
			}
		}
		return list;
	}

}
