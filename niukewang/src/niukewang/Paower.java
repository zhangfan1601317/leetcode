package niukewang;

import java.util.Scanner;

public class Paower
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		Scanner in =new Scanner(System.in);
		double base=in.nextDouble();
		int exponent=in.nextInt();
		in.close();
		System.out.println(Power(base, exponent));

	}
	public static  double Power(double base, int exponent) {
        boolean g_InvalidInput=false;
        if(equal(base, 0)&&exponent<0){
        	g_InvalidInput=true;
        	return 0;
        }
        int absExponent=Math.abs(exponent);
        double result=PowerLongExponent(base, absExponent);
        if(exponent<0)
        	result=1.0/result;
        return result;
    }
	public static double PowerLongExponent(double base,int exponent){
		if(exponent==0)
			return 1;
		if(exponent==1)
			return base;
		double result=PowerLongExponent(base, exponent>>1);
		result*=result;
		if((exponent&1)==1)
			result*=base;
		return result;
	}
    public static boolean equal(double num1,double num2){
    	if(Math.abs(num1-num2)<Math.pow(10, -7))
    		return true;
    	else
    		return false;
    }
}
