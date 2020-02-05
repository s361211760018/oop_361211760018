package Lab8;

public class PersonApp {
    public static void main(String[] args) {
        //create object
        Student std1 = new Student("361211760018","Jaruwan","STD018",
                "information Technology");
        Person p1 = new Person("361211760016","Air");

        System.out.println(std1.getName());
        System.out.println(p1.getName());

    }
}
