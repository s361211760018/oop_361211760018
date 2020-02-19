package Lab8_2;

public class Police extends Person{
    private String worCunTry;


    public Police(String name, String dateOfBirth, String worCunTry) {
        super(name, dateOfBirth);
        this.worCunTry = worCunTry;

    }
    public void introduce() {
        super.introduce();
        System.out.println("I work at " + this.worCunTry);
    }
    //getter and setter

    public String getWorCunTry() {
        return worCunTry;
    }

    public void setWorCunTry(String worCunTry) {
        this.worCunTry = worCunTry;
    }
    //toString

    @Override
    public String toString() {
        return "Police{" +
                "worCunTry='" + worCunTry + '\'' +
                "} " + super.toString();
    }
}
