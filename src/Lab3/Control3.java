package Lab3;

import java.util.Scanner;

public class Control3 {

    public static void main(String[] args) {
        //if-elae-if -> เป็นคำสั่งที่มีการทดสอบหลายเงื่อไข เงื่อนไขใดเป็นจริงจะทำอย่างที่คำสั่งนั้นเพียงคำสั่งเดียว
        //ในกรณีที่เงื่อนไขทั้งหมดเป็นจริง จะทำงานที่คำสั่ง else
        //โครงสร้างคำสั่ง if-else-if
        //if(เงื่อนไข 1) {
        //   คำสั่งเงื่อนไขที่ 1 เป็นจริง;
        // }else if  (เงื่อนไข 2) {
        //   คำสั่งเงื่อนไขที่ 2 เป็นจริง;
        //else if(เงื่อนไขที่ n) {
        //   คำสั่งเงื่อนไขที่ n เป็นจริง;
        //}else{
        //   คำสั่งเมื่อทุกเงื่อนไขเป็นเท็จทั้งหมด;
        // }


        // อายุมากกว่า 60 คือ แก่, อายุอยู่ระหว่าง 20-60 คือ วัยรุ่น, อายุต่ำกว่า 20 คือ เด็ก

        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you? :");
        int age = sc.nextInt();

        //test condition
        if (age<20) {
            System.out.println("You are young.");
        }else if (age<=60) {
            System.out.println("You are teenager.");
        }else {
            System.out.println("You are lod.");
        }




    }//main

}//class
