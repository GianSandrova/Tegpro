package task2;

/**
 *
 * @author ASUS
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Shape obj1=new Shape("red",false);
       System.out.println(obj1);
       Circle obj2=new Circle();
       System.out.println(obj2);
       Rectangle obj3=new Rectangle(10,20);
       System.out.println(obj3);
       square obj4=new square(10,"red",false);
       System.out.println(obj4);
       obj4.setSide(15);
       System.out.println(obj4);
    }
    
}
