package lab7;

public class MobileStore {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        mobile1.setmobileID("1001");
        mobile1.setbrand("Wiko");
        mobile1.setgeneration("Sunny 4 Plus");
        mobile1.setprice(2090);
        mobile1.setsystem("Android 4.4");

        System.out.println(mobile1.getmobileID());
        System.out.println(mobile1.getbrand());
        System.out.println(mobile1.getgeneration());
        System.out.println(mobile1.getprice());
        System.out.println(mobile1.getsystem());

        Mobile mobile2 = new Mobile("2202","Apple","iphone 11 Pro",35900,"ios 13");
        System.out.println(mobile2.getmobileID());
        System.out.println(mobile2.getbrand());
        System.out.println(mobile2.getgeneration());
        System.out.println(mobile2.getprice());
        System.out.println(mobile2.getsystem());


    }

}
