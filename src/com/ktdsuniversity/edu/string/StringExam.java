package com.ktdsuniversity.edu.string;

public class StringExam {
	
	/**
	 * 파라미터에서 파일의 이름만 추출해서 반환
	 * @param filePath
	 */
	public static String extractFileName(String filePath) {
		
		return filePath.substring(filePath.lastIndexOf("\\") + 1);
	}
	
	public static void printSubStringExtractFileNameResult() {
		//                            1          2
		//                 01 234567890123 4567890 12345678    ==> 첫 번째 나오는 \의 index는 안 샌다
		String filePath = "C:\\dev_program\\images\\pen.png";
		String fileName = extractFileName(filePath);
		System.out.println(fileName);
		
		filePath = "C:\\dev_program\\uploadedImages\\mouse.png";
		fileName = extractFileName(filePath);
		System.out.println(fileName);
		
		filePath = "C:\\programs\\mouse.png";
		fileName = extractFileName(filePath);
		System.out.println(fileName);
	}
	
	public static void printSubStringDateTimeResult() {
		//                           1
		//                 0123456789012345678
		String datetime = "2023-05-02 14:56:13";
		
		// datetime에서 연도만 추출
		String year = datetime.substring(0, 4);
		System.out.println(year); // 2023
		
		// datetime에서 월만 추출
		String month  = datetime.substring(5, 7);
		System.out.println(month);
		
		// datetime에서 일만 추출
		
		// datetime에서 시만 추출
		
		// datetime에서 분만 추출
		String seconds = datetime.substring(17);
		System.out.println(seconds + "초");
		
		// datetime에서 초만 추출
		
	}
	
	public static void printEndsWithResult() {
		
		String fileName = "pencil.gif";
		
		// fileName이 .gif로 끝나는가?
		boolean isGifFile = fileName.endsWith(".gif");
		System.out.println(isGifFile); // true
		
		isGifFile = fileName.endsWith(".GIF");
		System.out.println(isGifFile); // false
		
		isGifFile = fileName.endsWith(".gif") || fileName.endsWith(".GIF");
		System.out.println(isGifFile); // true
		
		// fileName의 값을 대(소)문자로 변경 후 .GIF 혹은 gif로 검사
		fileName.toLowerCase().endsWith(".gif");
		System.out.println(isGifFile); // true
	}
	
	public static void printSplitResult() {
		
		String phoneNumber = "+82-10-1234-5678";
		
		/**
		 * +82 : 국가번호
		 * 010 : ??
		 * 1234 : 개통시 기지국 번호
		 * 5678 : 개인 번호
		 */
		
		// "-" 문자를 기준으로 자르기
		String[] splittedPhoneNumber = phoneNumber.split("-");
		System.out.println(splittedPhoneNumber[0]);
		System.out.println(splittedPhoneNumber[1]);
		System.out.println(splittedPhoneNumber[2]);
		System.out.println(splittedPhoneNumber[3]);
	}
	
	public static void printReplaceAllResult() {
		String phoneNumber = "010-1234-1234";
		
		// phoneNumber에서 숫자가 아닌 모든 것들을 제거
		// 01012341234
		/*
		 * [^0-9] : 숫자가 아닌글자
		 * ^이 그룹 지정자 내부에 있을 때 !(not)의 역할
		 */
		String dirtyPhoneNumber = phoneNumber.replaceAll("[^0-9]", "");
		System.out.println(dirtyPhoneNumber);
	}
	
	public static void printReplaceResult() {
		String title = "<script>alert('alert! 내가 해킹할거야!')</script>";
		
		// < , >를 title에서 제거 (Sanitazing)
		String dirtyTitle = title.replace("<", "");
		dirtyTitle = dirtyTitle.replace(">", "");
		
		System.out.println(dirtyTitle);
	}
	
	public static void printIsAlphabetFormatResult() {
		String cordName = "Jang Min Chang";
		
		// 영문자 특히 영 대문자로만 구성이 되어있는가?
		boolean isAlphabet = cordName.matches("^[A-Za-z ]+$");
		System.out.println(isAlphabet);
	}
	
	public static void printIsHangeulFormatResult() {
		String age = "마흔";
		// ㄱ ~ ㅎ
		// ㅏ ~ ㅣ
		// ㄱ ~ ㅎ
		// 가힣
		boolean isHangeul = age.matches("^[가-힣]+$");
		System.out.println(isHangeul);
		
		if(isHangeul) {
			System.out.println("한글 나이는 " + age + "입니다");
		}else {
			System.out.println(age + "는 한글 형태가 아닙니다");
		}
	}
	
	public static void printIsNumberFormatResult() {
		
		String age = "마흔";
		
		/*
		 * ^[0-9]+$ : 숫자로 시작해서 숫자로 끝나는 형태 ==> 문자가 숫자로만 이루어져 있는가
		 * 
		 * ^ : ~으로 시작한다
		 * [] : Group 지정자. 내부에 지정된 문자 중 한 글자
		 * [0-9] : 숫자 그룹 지정자. 0부터 9까지의 모든 숫자 중 한 글자
		 * + : 앞에 지정된 문자 혹은 그룹이 1글자 이상 반복된다
		 * [0-9]+ : 숫자가 하나 이상 반복된다
		 * $ : ~으로 끝난다
		 */
		
		// age에 할당된 값이 숫자로만 구성이 되어있는지 검증
		boolean isNumber = age.matches("^[0-9]+$");
		System.out.println(isNumber);
		
		if(isNumber) {
			// age 문자열을 숫자로 변경을 해보자
			int numAge = Integer.parseInt(age);
			System.out.println(numAge);
			System.out.println(numAge * 2);
		}else {
			System.out.println(age + "는 숫자 형태가 아닙니다");
		}
		
	}
	
	public static void printLastIndexOfResult() {
		/*
		 * \ (Back slash) : Escape Code
		 * 
		 * \\ : 원(통화기호) 표시
		 * \" : 쌍 따옴표
		 * \' : 홑 따옴표
		 * \r : 개행 후 커서를 가장 앞으로 이동
		 * \n : 줄 개행
		 * \t : Tab
		 */
		
		// "안녕하세요, 제 이름은 "장민창" 입니다."
		String hello = "안녕하세요, 제 이름은 \"장민창\" 입니다.";
		System.out.println(hello);
		
		//                            1          2
		//                 01 234567890123 4567890 12345678    ==> 첫 번째 나오는 \의 index는 안 샌다
		String filePath = "C:\\dev_program\\images\\pen.png";
		
		// filePath에서 pen.png가 시작되는 위치를 알고 싶다
		int lastIndexOfBackSlash = filePath.lastIndexOf("\\");
		System.out.println(lastIndexOfBackSlash);
	}
	
	
	public static void printJoinResult() {
		String phone = String.join("-", "010", "1234", "1234");
		System.out.println(phone);
	}
	
	public static void printIsNullOrEmptyResult() {
		
		/*
		 * String instance.trim();
		 * Exam>
		 * 		String abc = "  a b c  ";
		 * 		abc.length(); ==> 9
		 * 		abc.trim(); ==> "a b c";
		 * 		abc.trim().length(); ==> 5
		 * 
		 * 		String abc = "     ";
		 * 		abc.length(); ==> 5
		 * 		abc.trim(); ==> ""
		 * 		abc.trim().length(); ==> 0
		 */
		
		String str = "";
		// boolean isEmpty = str == null || str.trim().length() == 0;
		boolean isEmpty = str.trim().length() == 0;
		System.out.println(isEmpty); // true
		
		String str2 = "   ";
		// isEmpty = str2 == null || str2.trim().length() == 0;
		isEmpty = str2.trim().length() == 0;
		System.out.println(isEmpty); // true
		
		String str3 = "   aa aaa   ";
		// isEmpty = str3 == null || str3.trim().length() == 0;
		isEmpty = str3.trim().length() == 0;
		System.out.println(isEmpty); // false
		
		String str4 = null;
		isEmpty = str4 == null || str4.trim().length() == 0;
		// isEmpty = str4.trim().length() == 0;
		System.out.println(isEmpty); // true
	}
	
	public static void printIsEmptyResult() {
		String str = "    "; // 4
		boolean isEmpty = str.isEmpty();
		System.out.println(isEmpty); // false
		
		String str2 = ""; // 0
		isEmpty = str2.isEmpty();
		System.out.println(isEmpty); // true
		
		String str3 = "a"; // 1
		isEmpty = str3.isEmpty();
		System.out.println(isEmpty); // false
	}
	
	public static void printIsBlankResultOnJava11() {
		String str = "    ";
		boolean isBlank = str.isBlank();
		System.out.println(isBlank);
		
		String str2 = ""; // blank string이라고 불린다
		isBlank = str2.isBlank();
		System.out.println(isBlank);
		
		String str3 = "a";
		// String str3 = null;
		isBlank = str3.isBlank();
		System.out.println(isBlank);
	}
	
	public static void printIndexOfResult() {
		//                 0123456789
		String fileName = "score.xlsx";
		int dotIndex = fileName.indexOf('.'); // 5
		System.out.println(dotIndex);
		
		int smallXIndex = fileName.indexOf("x"); // 6
		System.out.println(smallXIndex);
		
		int bigXIndex = fileName.indexOf("X"); // -1
		System.out.println(bigXIndex);
		
		int extentionNameIndex = fileName.indexOf(".xlsx"); // 5
		System.out.println(extentionNameIndex);
	}
	
	public static void printFormatResult() {
		/*
		 * %s : String 할당
		 * %d : Decimal 할당
		 * %f : floating point number 할당
		 * %.2f : 부동소수점들을 소수점 이하 두 자리만 표현
		 * %.4f : 부동소수점들을 소수점 이하 네 자리만 표현
		 */
		String format = "%s 에서 교육하는 %s %d 교육입니다."; // %s: 문자열을 받는 기호, %d: 숫자 정수만 받는 기호
		String formattedString = String.format(format, "ktds university", "java", 22);
		System.out.println(formattedString);
	}

	public static void printStartsWithResult() {
		
		String address = "https://edu.ktdsuniversity.com";
		
		boolean isSecureProtocol = address.startsWith("https://");
		System.out.println(isSecureProtocol);
		
		boolean isNonSecureProtocol = address.startsWith("http://");
		System.out.println(isNonSecureProtocol);
	}
	public static void printContainsResult() {
		
		String address = "서울특별시 서초구 효령로 176";
		boolean isSeocho = address.contains("서초");
		System.out.println(isSeocho);
		
		boolean isGangnam = address.contains("강남");
		System.out.println(isGangnam);
	}
	
	public static void main(String[] args) {
		
		printContainsResult();
		printStartsWithResult();
		printFormatResult();
		printIndexOfResult();
		printIsBlankResultOnJava11();
		printIsEmptyResult();
		printIsNullOrEmptyResult();
		printJoinResult();
		printLastIndexOfResult();
		printIsNumberFormatResult();
		printIsHangeulFormatResult();
		printIsAlphabetFormatResult();
		printReplaceResult();
		printReplaceAllResult();
		printSplitResult();
		printEndsWithResult();
		printSubStringDateTimeResult();
		printSubStringExtractFileNameResult();
	}
}
