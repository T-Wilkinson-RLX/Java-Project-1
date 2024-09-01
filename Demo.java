
class Mobile{

    String brand;
    int cost;
    static String name;

    public void show(){

        System.out.println(brand + " : " + cost + " : " + name);
    }

}


public class Demo {
    
    public static void main(String a[]) 
    {
      
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.cost = 200;
        obj1.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.cost = 150;
        obj2.name = "SmartPhone";

        obj1.show();
        obj2.show();

    }
}
