
public class test1 {
	public static void main(String[] args) {
		
//		1.数字の5と9の変数を定義し、足した数字を出力しなさい。
		int i = 5;
		int in = 9;
		
		System.out.println(i+in);
		
		
//		2.64ビット整数の「1111111111」を定義し2倍した値を出力しなさい。
		
		long num = 1111111111;
		num = num *2;
		System.out.println(num);
		
		
		
//		3.boolean型の変数の値に不正な文字列比較を入れてfalseを出力してください。	
		
		String msg1 = "Hello";
	    String msg2 = new String(msg1);

	    System.out.println(msg1 == msg2); 
		
		
		
	}
}
