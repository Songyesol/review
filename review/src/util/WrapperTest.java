package util;

import java.util.Date;

public class WrapperTest {

	public static void main(String[] args) {
//		int result = StringUtil.toInt("1234");
//		System.out.println(result);
//		String result = StringUtil.toStr(1234);
//		System.out.println(result);		
		//파일명에서 확장자만 추출
//		String result = StringUtil.getExt("a.b.jpg");
//		System.out.println(result);
		
//		Date result = DateUtil.toDate("2021-02-18");
//		System.out.println(result);
//		
//		String str = DateUtil.toStr(new Date());
//		System.out.println(str);
		
		String str1 = DateUtil.toStr(new Date(), "DD");
		System.out.println(str1);
		
		//파일명만 추출
		String filename = StringUtil.getFileName("c:/img/item/p01.jpg");
		System.out.println(filename);
		
		//경로명만 추출
		filename =StringUtil.getPath("c:/img/item/p01.jpg");
		System.out.println(filename);
		
		//날짜계산
	}

}
