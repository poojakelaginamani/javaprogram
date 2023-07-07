<<<<<<< HEAD

public class Runner{

  class Telivision{
    static String brand;
    boolean isHd;
    long price;
    float weight;
    String displayType;
    String color;
    int usbPorts;
    int warrenty;
    int screenSize;
}

     public Telivision(boolean isHd, long price, float weight, String displayType, String color, int usbPorts, int warrenty, int screenSize){
    
        this.isHd = isHd;
        this.price = price;
        this.weight = weight;
        this.displayType=displayType;
        this.color = color;
        this.usbPorts = usbPorts;
        this.warrenty = warrenty;
        this.screenSize = screenSize;
    }
    
    static{
        brand = "LG";
        System.out.println(brand);

    }
    public static void run(){
      System.out.println("static block");
    }
      public static void main(String[] args) {
        Telivision Telivision = new Telivision();
        Telivision tv1 = new Telivision(true, 1000000l, 8.2f, "QLED", "black", 2, 10, 36);
        System.out.println(tv1.warrenty);
        Telivision tv2 = new Telivision(true, 1200000l, 5.2f, "QLED", "white", 3, 5, 37);
        System.out.println(tv2.isHd);
        Telivision tv3 = new Telivision(true, 1250000l, 7.9f, "LCD", "black-white", 4, 8, 30);
        System.out.println(tv3.displayType);
        Telivision tv4 = new Telivision(false, 1565500l, 4.6f, "QLED", "white", 3, 5, 70);
        System.out.println(tv4.usbPorts);
        Telivision tv5 = new Telivision(true, 2000000l, 3.4f, "QLED", "black", 4, 15, 50);
        System.out.println(tv5.color);
        Telivision.run();
    }
}
    
    
=======

public class Runner{
 public static void main(String[] args) {
      
        Telivision tv1 = new Telivision(true, 1000000l, 8.2f, "QLED", "black", 2, 10);
        System.out.println(tv1.warrenty);

        Telivision tv2 = new Telivision(true, 1200000l, 5.2f, "QLED", "white", 3, 5);
        System.out.println(tv2.isHd);

        Telivision tv3 = new Telivision(true, 1250000l, 7.9f, "LCD", "black-white", 4, 8);
        System.out.println(tv3.displayType);

        Telivision tv4 = new Telivision(false, 1565500l, 4.6f, "QLED", "white", 3, 5);
        System.out.println(tv4.usbPorts);

        Telivision tv5 = new Telivision(true, 2000000l, 3.4f, "QLED", "black", 4, 15);
        System.out.println(tv5.color);
        Telivision.run();
    }
  }
  class Telivision{
    static String brand;
    boolean isHd;
    long price;
    float weight;
    String displayType;
    String color;
    int usbPorts;
    int warrenty;
    int screenSize;
    String operatingSystem;


    static{
        brand = "LG";
        System.out.println(brand);

    }

     public Telivision(boolean isHd, long price, float weight, String displayType, String color, int usbPorts, int warrenty){
    
        this.isHd = isHd;
        this.price = price;
        this.weight = weight;
        this.displayType=displayType;
        this.color = color;
        this.usbPorts = usbPorts;
        this.warrenty = warrenty;
        
    }
    
    static{
        brand = "LG";
        System.out.println(brand);

    }
    public static void run(){
      System.out.println("static block");
    }
      
}
    
    
>>>>>>> 118175eaae2fe93a15d508c5fdcabb5f92fdf01c
