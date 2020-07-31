package application.utils;
import java.util.Scanner;

public class Input {
    private static  Scanner sc = new Scanner(System.in);

    public static int getInt() {
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            sc.nextLine();
            return a;
        }
        System.out.println(sc.next() + " - " + "Это не целое число.Повторите ввод");
        return getInt();
    }

    public static int getInt(String message) {
        System.out.println(message);
        return getInt();
    }

    public static String getString() {
        return sc.nextLine();
    }

    public static String getString(String message) {
        System.out.println(message);
        return getString();
    }
    public static Double getDouble(){
        return sc.nextDouble();
    }

    public static Double getDouble(String message){
        System.out.println(sc.nextDouble() + " - "+ " Это не дробное число. Повторите ввод");
        return getDouble();
    }

    public static Boolean getBoolean(){
        return  sc.nextBoolean();
    }

    public static Boolean getBoolean(String message){
        System.out.println(sc.nextBoolean() + " - "+ " Не соответствует параметрам true/false. Повторите ввод");
        return getBoolean();
    }
}
