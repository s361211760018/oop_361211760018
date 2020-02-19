package Lab8_2;

public class PersonApp {

    public static void main(String[] args) {

        //create objects
        Person P1 = new Person("Jaruwan Panyajuti","1997");
        Person P2 = new Sheriff("Sudat krodsrimai","1998","Thungsong");
        Person P3 = new Police("Rattanawalee sakunnoo","1996","Nakhorn");

        P1.introduce();
        P2.introduce();
        P3.introduce();



    }
}
