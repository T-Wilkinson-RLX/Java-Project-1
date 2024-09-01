
public class Demo {
    
    public static void main(String a[]) 
    {
      
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.cost = 200;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.cost = 150;
        Mobile.name = "SmartPhone";

        Mobile.name = "FlipPhone";

        obj1.show();
        obj2.show();

        Human man = new Human();
        man.setAge(22);
        man.setName("Millie");

        System.out.println("My name is " + man.getName() + " and my age is " + man.getAge());
    }
}
