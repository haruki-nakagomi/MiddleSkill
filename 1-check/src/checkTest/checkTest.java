package checkTest;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class checkTest {
	//問7用
	private static final Logger LOGGER = Logger.getLogger(checkTest.class.getName());
	
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問1 リソースを開く(ファイル名)ショートカットキーは何ですか？
//		→ Ctrl + Shift + R
        
		//改行
		System.out.println("問２");
		//問2 リファクタリングをする時のショートカットキーは何ですか？
//		→ Ctrl + Alt + Shift + T
		
		//改行
		System.out.println("問３");
		//問3 デバッグを行う方法を簡潔に記載してください
//      ブレークポイントを設定し、デバック実行（虫のアイコンをクリック）すると設定したブレイクポイントまでソースコードが実行され
//      、変数の値が確認できる。
		//改行
		System.out.println("問４");
		//問4 eclipseのバージョン8と11の違いを簡潔に答えてください
//		Java11の新機能として、型推論が使えるようになった点・default処理やstaticの処理でprivateメソッドを活用できる点が追加され、
//　　　逆に「_」を変数名に使用できなくなったなどの違いがある。
		
		//改行
		System.out.println("問５");
		//問5　Road博物館の入場料金は、一人1000円であるが、10人以上のチームなら一人820円、20人以上の団体なら一人700円である。人数を入力し、入場料の合計を計算するプログラムを作成せよ。(if文で上記文章を作ってください)
		System.out.print("人数を入力してください = ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int charge = 0;

		if (num < 10) {
			charge = 1000 * num;
		} else if (num < 20) {
			charge = 820 * num;
		} else {
			charge = 700 * num;
		}

		System.out.println("入場料の合計は" + charge + "円です。");
		
		
		//改行
		System.out.println("問６");
		//問6　コメントアウトされている箇所にどう言った処理が行われているか記載してください
		Scanner scn = new Scanner(System.in);
		int[] score = new int[5];
		int i, sum;
		double ave;
		
		//for文のープを使って,5つの整数を入力し配列に格納している
		for (i = 0; i < score.length; i++) {
			System.out.print("得点を入力してください = ");
			score[i] = scn.nextInt();
			}


			//配列の５つの要素を合計して変数sumに代入している
			sum = 0;
			for (i = 0; i < score.length; i++) {
			sum += score[i];
			}
		
			//配列の５つの平均値を計算し、変数aveに代入している
			ave = sum / (double)score.length;
			//平均値を出力している
			System.out.println("平均値 = " + ave);
		
		//改行
		System.out.println("問７");
		//問7　ログ出力が行えるように下記コードを修正してください
		 try {
	            FileHandler fileHandler = new FileHandler("src/middleskill.log", true);
	            SimpleFormatter formatter = new SimpleFormatter();
	            fileHandler.setFormatter(formatter);
	            LOGGER.addHandler(fileHandler);
	            
	            String message = "Hello World!";
	            LOGGER.info("The message is: " + message);
	        } catch (IOException e) {
	            System.err.println("ログミス: " + e.getMessage());
	        }
		
		//改行
		System.out.println("問８");
		//問8　問題：
		//入力された文字列を整数に変換し、その結果を出力するプログラムを作成してください。ただし、以下の場合には例外を発生させてください。(Scannerメソッドを使用すること)
				//1.入力された文字列がnullの場合（NullPointerExceptionが発生する）
				//2.入力された文字列が空文字列の場合（Exceptionが発生する）
				//3.入力された文字列が整数に変換できない場合（NumberFormatExceptionが発生する）

		 Scanner scanner = new Scanner(System.in);
		 System.out.print("文字列を入力してください: ");
	        String str = scanner.nextLine();

	        if (str == null) {
	            throw new NullPointerException("入力された文字列がNULLです。");
	        } else if (str.isEmpty()) {
	            throw new RuntimeException("入力された文字列が空です。");
	        } else {
	        	
	            try {
	                int change = Integer.parseInt(str);
	                System.out.println("変換後の整数: " + change);
	                
	            } catch (NumberFormatException e) {
	                throw new NumberFormatException("入力された文字列を整数に変換できません。");
	            }
	       
	        }
	        
     	//改行
		System.out.println("問９");
		//問9 Java編終わった感想と改善点もしございましたらお願いします。
		//『自身の技術力が身についているかが実感できるいい機会でした。Javaカリキュラムが終了後も復習をし、更に技術を磨きたい。』
	}
}