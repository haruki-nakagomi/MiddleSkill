
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
		
		boolean isOverTeenage; // boolean型の変数を宣言
        int yourAge = 18; // あなたは18歳
 
        isOverTeenage = (yourAge >= 19); // 【条件式】
 
        System.out.println(isOverTeenage);;
		
	}
}
