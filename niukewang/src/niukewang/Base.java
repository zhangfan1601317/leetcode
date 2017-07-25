package niukewang;

public class Base
{
	private String baseName = "base";
    public Base()
    {
        callName();
    }
 
    public void callName()
    {
        System. out. println(baseName);
    }
 
    static class Sub extends Base
    {
        private String baseName = "sub";
        public void callName()
        {
            System. out. println (baseName) ;
        }
    }
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		// Base b = new Sub();
		 //System.out.println(b);
	}

}
