import java.lang.reflect.Method;
import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        listMethods(ASMD.class);
        System.out.println(Math.sqrt(9));
        scan.close();
    }

    public static void listMethods(Class<?> clazz) {
        System.out.println("Methods in " + clazz.getName() + ":");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(" - " + method.getName());
        }
        System.out.println(); // For better readability
    }
}
