package Lab3;

import java.util.Scanner;

public class LoopDoWhile {
    public static void main(String[] args) {
        //do-while-> เช่นงานเช่นเดียวกับ while แต่จะทำคำสั่งในลูปก่อน 1 ครั้งเสมอจึงทดสอบเงื่อนไข
        //ดังนั้นจะหมายความว่า ไม่ว่าเงื่อนไขจะเป็นจริงหรือเท็จ คำสั่งในลุปจะถูกจะทำงานแล้วอย่างงน้อย 1 ครั้ง


        //do{
        //      คำสั่งเมื่อเงื่อนไขเป็นจริง;
        // }while(เงื่อนไข);


        Scanner sc = new Scanner(System.in);
        int x = 1;
        do {
            System.out.println("enter an number: ");
            x = sc.nextInt();


        }while (x!=0);

        System.out.println("Good bye.");
    }
}
