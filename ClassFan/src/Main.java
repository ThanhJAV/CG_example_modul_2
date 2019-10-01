import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassFan classFan = new ClassFan(10 , true , 10 , "Yellow" );
        ClassFan classFan1 = new ClassFan(5,false,5,"Blue");
        System.out.println(classFan.toString());
        System.out.println(classFan1.toString());
    }
}
