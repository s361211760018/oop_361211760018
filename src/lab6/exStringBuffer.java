package lab6;

import java.util.StringTokenizer;

public class exStringBuffer {
    public static void main(String[] args) {

        //StringBuffer เป็นคลาส ที่มีเมธอดต่างๆ
        //ที่มารถปรับปรุงแก้ไขข้อมูลเป็น String ได้มากกว่าลาส String ทั่วไป

        StringBuffer strBuf = new StringBuffer("Hello");
        System.out.println(strBuf);
        //append() ใช้สำหรับต่อ String
        strBuf.append("Saiyai");
        System.out.println(strBuf);
        System.out.println(strBuf.reverse());
        strBuf.delete(0,6);
        System.out.println(strBuf);

        //StringTokenixer
        String s = "Last Sunday’s season premiere of “Game of Thrones” was watched by 16.1 million " +
                "viewers across all platforms, including cable, online streaming and on-demand viewing.";
        //word counting
        StringTokenizer tokenizer = new StringTokenizer(s);
        int countWord = tokenizer.countTokens();
        System.out.println("Word count from message: "+countWord);

        //word cutting
        while (tokenizer.hasMoreElements()){
            System.out.println(tokenizer.nextElement());
        }


    }//main
}//class
