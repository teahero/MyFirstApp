import java.util.Scanner;
public class MyFirstApp {
    public static void main(String[] args) {
        System.out.println("Привет мир!");
        System.out.println("Meow!");
        Scanner console = new Scanner(System.in, "cp866");
        System.out.print("Введите свое имя:");
        System.out.println(console.nextLine());
    }
}