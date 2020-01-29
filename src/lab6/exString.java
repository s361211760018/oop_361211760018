package lab6;

public class exString {
    //String เป็นข้อมูลชนิดข้อความ แต่ในภาาาจาวา String เป็นคลาส
    //ดังนั้นการประกาศตัวแปรชนิด String (เป็นการประกาศ object ของคลาส)
    //จึงสามารถเรียกใช้เมธอดต่างๆ ที่อยู่ในคลาส String ได้
    public static void main(String[] args) {
        String msg = "Hello, Saiyai !!!";

        // length() ใช้ในการนับจำนวนตัวอักษรในข้อความส่งค่ากลับมาเป็นจำนวนเต็ม (int)
        int len = msg.length();
        System.out.println(len);

        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());
        System.out.println(msg.charAt(5)); // แสดงตัวอีกษรตำแหน่งที่ 5 ของข้อความ

        //concatenating String คือ ต่อข้อความ
        //1. ใช้เครื่องหมาย+
        String msg2 = "RUTS";
        String msgCon = msg + msg2;
        System.out.println(msgCon);
        //2. ใช้ concat()
        String msgCon2 = msg.concat(msg2);
        System.out.println(msgCon2);


        //compare Stringคือการเปนีบยเทียบข้อความ 2 ข้อความ
        String m1 = "Saiyai RUTS";
        String m2 = "Saiyai ";

        //1. ใช้เครื่องหมาย== เหมือนกันเป็น true ต่างกันเป็น false
        if (m1 == m2) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(m1==m2? "Yes":"No");

        //2. equal() การทำงานเหมือนกับการใช้เครื่องหมาย ==
        System.out.println(m1.equals(m2)? "Yes":"No");
        if (m1.equals(m2)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(m1.equals(m2)? "Yes":"No");

        //3. compareTo() ้าข้อความเหทิอนกัน 0ม ข้อความทางซ้ายมากกว่า 1, ข้อความทางขวามากกว่าเป็น -1

        //String m1 = "Saiyai RUTS";
        //String m2 = "Saiyai RUTs";
        int x = m1.compareTo(m2);
        System.out.println(x);




    }//main
}//class

