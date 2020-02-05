package lab7;

public class Mobile {

    private String mobileID;
    private String brand;
    private String generation;
    private  int price;
    private String system;

    public  Mobile(){}
    //2. constructor ที่สร้างขึ้นมาใหม่
    public Mobile(String mobileID,String brand,String generation,int price,String system) {
        this.mobileID = mobileID;
        this.brand = brand;
        this.generation = generation;
        this.price = price;
        this.system = system;
    }
    public void Android9Go(){
        System.out.println("Mobile Android 9 Go");
    }
    public  void  ios13(){
        System.out.println("Mobile ios 13");
    }
    public void Android4(){
        System.out.println("Mobile Android 4.4");
    }

    public String getmobileID(){
        return this.mobileID;
    }
    public void setmobileID (String mobileID){
        this.mobileID = mobileID;
    }

    public String getbrand(){
        return this.brand;
    }
    public void setbrand (String brand){
        this.brand = brand;
    }

    public String getgeneration(){
        return this.generation;
    }
    public void setgeneration (String generation){
        this.generation = generation;
    }

    public int getprice(){
        return this.price;
    }
    public void setprice (int price){
        this.price = price;
    }

    public String getsystem(){
        return this.system;
    }
    public void setsystem(String system) {
        this.system = system;
    }

}