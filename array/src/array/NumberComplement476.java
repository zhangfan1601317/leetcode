import java.util.Scanner;

public class NumberComplement476 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();		
		int y=0;
		int length=0;
		in.close();
		if(x>=0&&x<Math.pow(2,32))
		{
			int z=x;
			while(z!=0)
			{
				length++;
				z=z/2;
			}
			System.out.println(length);
			int [] a=new int[length];
			int [] b=new int[length];
			for(int i=0;i<length;i++)
			{
				a[i]=x%2;
				x=x/2;
				b[i]=(1-a[i]);
			}
			for(int j=0;j<length;j++)
			{
				System.out.print("a is :"+a[j]);
				System.out.println();
				System.out.print("b is :"+b[j]);
				System.out.println();
			}
			for(int i=0;i<length;i++)
			{
				y+=b[i]*Math.pow(2, i);
			}
			System.out.println(y);
		}
		else 
		{
			System.out.println("error");
		}

	}

}
