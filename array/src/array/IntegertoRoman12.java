import java.util.Scanner;

public class IntegertoRoman12 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in=new Scanner(System.in);
		int number=in.nextInt();
		in.close();
		int[] base = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] str = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX",
                "V", "IV", "I" };
        String roman = "";
        int i = 0;
        //贪心算法
        while (number != 0) {
            if (number >= base[i]) {
                number -= base[i];
                roman += str[i];
            } else
                i++;
        }
        System.out.println(roman);
	}
}
