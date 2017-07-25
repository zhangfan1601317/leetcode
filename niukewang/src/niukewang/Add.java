package niukewang;

public class Add
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
    public static int Add(int num1,int num2) {
        int sum,carry;
        do{
        	sum=num1^num2;
        	carry=(num1&num2)<<1;
        	num1=sum;
        	num2=carry;
        }
        while(num2!=0);
        return num1;
    }

}
