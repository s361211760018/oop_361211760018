package Lab3;

import java.util.Scanner;

public class Loopfor {
    public static void main(String[] args) {

        //loop for : ใช้ในกรณีที่ทราบจำนวนการทำซ้ำที่ชัดเจน
        //โครงสร้าง for

        //for (ค่าเริ่มต้น; เงื่อนไข; ปรับปรุงค่าตัวนับ){
        //    คำสั่งเมื่อเงื่อนไขเป็นจริง;
        // }


        for (int i = 1; i <= 20; i++) {
            System.out.println("Hello.");
            if (i%2 ==0)
                System.out.println("RUTS");

        }

    }//main

}//class
