import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) throws ParseException {
		String shinyaBirthday = "1998/03/19";
		String minamiBirthday = "2000/02/14";
		String furuyamaBirthday = "1998/09/12";
		//改行
		System.out.println("問１");
		//問題1:現在の時刻を出力してください
		Date date = new Date();
        System.out.println(date);
		//改行
        
		System.out.println("問２");
		//問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		Date shinya = format.parse(shinyaBirthday);
		Date minami = format.parse(minamiBirthday);

		String earlierBirthday = (shinya.before(minami)) ? shinyaBirthday : minamiBirthday;
		System.out.println(earlierBirthday);
		//改行
		
		System.out.println("問３");
		//問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd");
		Date furuyamaDate = format2.parse(furuyamaBirthday);
		
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(furuyamaDate);
		    cal.add(Calendar.YEAR, 5);
		    cal.add(Calendar.MONTH, 2);
		  
		    Date addDate = cal.getTime();
			String addBirthday = format2.format(addDate);
			System.out.println(addBirthday);
	}
}


