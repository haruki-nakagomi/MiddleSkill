import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test1 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問題1:配列"numa"の要素を全要素を出力しなさい。※i++など利用しないfor文で記述すること
		int[] numa = {1, 2, 3, 4, 5};
		// 配列の全要素出力
        for (int numadata: numa){
            System.out.println(numadata);
        }
		
		//改行
		System.out.println("問２");
		
		//問題2:配列"numb"の要素を逆順に出力してください。
		int[] numb = {1, 2, 3, 4, 5};
		for (int i = numb.length - 1; i >= 0 ; i--) {
            System.out.println(numb[i]);
        }
		//改行
		System.out.println("問３");
		
		//問題3:配列"numc"の中で偶数の要素だけを合計した値を出力してください。
		int[] numc = {1, 2, 3, 4, 5};
		int sums[] = {0, 0}; 
	    for (int i : numc) {
	        sums[i % 2] += i;
	    }
	    
	    System.out.println(sums[0]);
	  
		
		//改行
		System.out.println("問４");
		
		//問題4:この配列"numd"をコピーした配列名"new_numd"を作り"new_numd"の中身を出力してください。
		int[] numd = {1, 3, 5, 7, 9};
		int new_numd[] = numd.clone();
		// 配列の全要素出力
        for (int new_numddata: new_numd){
            System.out.println(new_numddata);
        }
		
		//改行
		System.out.println("問５");
		
		//問題5:この配列"nume"を昇順に並び替えて出力しなさい。
		int[] nume = {6, 2, 8, 1, 9};
		Arrays.sort(nume);
	    System.out.println(Arrays.toString(nume));
		
		//改行
		System.out.println("問６");
		
		//問題6:配列"numf"に要素を1つ(10)追加した配列"new_numf"を作成し出力しなさい。
		int[] numf = {1, 3, 5, 7, 9};
		int new_numf[] = new int[6];
		System.arraycopy(numf, 0, new_numf, 0, 5);

		new_numf[5] = 10;
		
		// 配列の全要素出力
        for (int new_numfdata: new_numf){
            System.out.println(new_numfdata);
        }

		
		//改行
		System.out.println("問７");
		
		//問題7:Map"car"に「キー："honda"　バリュー"ホンダ",キー："toyota"　バリュー："トヨタ",キー："subaru"　バリュー："スバル"」の要素を追加してください
		Map<String, String> car = new HashMap<>();
		 
		car.put("honda", "ホンダ");
		car.put("toyota", "トヨタ");
		car.put("subaru", "スバル");
		
		
		//改行
		System.out.println("問８");
		
		//問題8:Map"car"の「キー："toyota"」のバリューを出力してください。
		System.out.println(car.get("toyota"));
		
		//改行
		System.out.println("問９");
		
		//問題9:Map"car"のキーとバリューを全て出力してください。※for文で行うこと
		for (Map.Entry<String, String> ent : car.entrySet()) {
			System.out.println(ent.getKey() + ":" + ent.getValue());
		}
		//改行
		System.out.println("問１０");
		
		//問題10:Map"car"のキーとバリューを全て出力してください。※forEach文で行うこと
		car.forEach((key, value) -> System.out.println(key + ":" + value));
		
	}
}
