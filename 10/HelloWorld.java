import java.util.Scanner;

public class HelloWorld {
    public static void sayHello() {
        System.out.println("Hello");
    }
    
    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }
    
    public static void sayHello(String name, String day) {
        System.out.println("Hello " + name + "!");
        System.out.println("Today is " + day);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        sayHello();
        sayHello("Ani");
        sayHello("Budi", "Monday");
        
        String name = "Arif";
        
        System.out.print("Siapa namamu? ");
        String nama = in.nextLine();
        sayHello(nama);
        
        System.out.println(name);
    }
}
