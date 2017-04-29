import javax.naming.spi.DirStateFactory.Result;

public class FindKPairswithSmallestSums373 {

	public static void main(String[] args) {
		System.out.println("排序前：");
		int num1[]=new int[]{1,1,2};
		int num2[]=new int[]{1,2,3};
		//int k=2;
		int sum[]=new int[9];
		int result[]=new int[9];
		System.out.println("相加得：");
		int k=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{		
				sum[k]=num1[i]+num2[j];
				//result[k]=sum[k];
//					if(m<k)
				{
					System.out.println(sum[k]);
					System.out.println(num1[i]+" "+num2[j]);
				}		
				k++;
			}
		}
		for(int m=0;m<9;m++)
		{
			System.out.println(sum[m]);
		}
		//排序从小到大
		System.out.println("排序后：");
		int temp = 0;
        for (int i = 8; i > 0; --i)
        {
            for (int j = 0; j < i; ++j)
            {
                if (sum[j + 1] < sum[j])
                {
                    temp = sum[j];
                    sum[j] = sum[j + 1];
                    sum[j + 1] = temp;
                }
            }
        }
        int s=0;
        for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{		
				result[s]=num1[i]+num2[j];	
				s++;
			}
		}
		for(int m=0;m<9;m++)
		{
			if(m<2)
			{										
				if(result[m]==sum[m])	
				{
					System.out.println("result is:");
					System.out.println(result[m]);
				}
			}			
		}		
	}
}
