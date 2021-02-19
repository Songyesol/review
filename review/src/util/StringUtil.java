package util;

public class StringUtil {
	//1.String -> int
		public static int toInt(String s) { //Integer -> int
			//static으로 선언하면 따로 상속 없이 바로 불러와서 쓸 수 있음.
			if(s== null) return -1;
			return Integer.parseInt(s);
		}
		
	//2.int -> String
		public static String toStr(int i) {
			return Integer.toString(i);
		}
	//3. String -> 확장자	
		public static String getExt(String s) {
			String result = "";
			int indexNum = s.lastIndexOf("."); //자릿수를 숫자로 알려줌
			result= s.substring(indexNum+1);
		return result;
		}
/**
 * 		
 * @param pathname 경로명 "c:/img/item/p01.jpg"
 * @return 경로 c:/img/item
 */
		//경로에서 파일명만 추출 (null check)
		public static String getFileName(String pathname) {
			String result = "";
			if(pathname ==null) {
				return "-1";
			}
			int indexNum = pathname.lastIndexOf("/");
			result = pathname.substring(indexNum+1);
			return result;
		}
/**
 * 경로에서 파일명만 추출
 * @param pathname 경로명 "c:/img/item/p01.jpg"
 * @return 경로 c:/img/item
 * (null check)
 */
		public static String getPath(String pathname) {
			String result = "";
			if(pathname ==null) {
				return "-1";
			}
			int indexNum = pathname.lastIndexOf("/");
			result = pathname.substring(0,indexNum);
			return result;
		}
}
