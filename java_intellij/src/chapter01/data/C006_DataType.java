package chapter01.data;

public class C006_DataType {

    public static void main(String[] args) {
		/*
		[데이터 타입]
	 	1. 기본형 데이터타입
		  	- 정수형
		  		byte(1), short(2), int(4), long(8)
		  		char(2) 	// 정수형 & 문자형
		  	- 실수형
		  		float(4), double(8)
		  	- 논리형
		  		boolean(1) 	// true or false

		2. 참조형 데이터타입
			- 기본형 데이터타입이 아닌 "객체"
				class, enum, array, ...
		*/
        // 기본형 데이터타입
        byte 	a = 127;
        short 	b = 12345;
        int 	c = 1234567890;
        long 	d = 12345678900L;	// L or l
        char 	e = 'A';
        float 	f = 3.14F;			// F or f
        double 	g = 3.14;
        boolean h = true;			// true or false

        // 동적으로 데이터타입 변경
        var v1 = 'B';
        var v2 = 123;

        // 문자열 데이터타입
        String s = "안녕하세요";
        String n = null;

        // 문자형 타입의 정수화
        char alpha = 'A';
        System.out.println(alpha);

        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int) ch1);

        // 정수형 타입의 문자화
        int ch2 = 67;
        System.out.println(ch2);
        System.out.println((char) ch2);
    }

}
