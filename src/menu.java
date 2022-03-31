import java.util.Scanner;

public class menu {




    public static void passMenu(){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext("1")  == true){
            calculation.calculation();
        }
//        if (sc.hasNext("2")  == true){
//            Threads.ThreadResult();
//            System.out.println("Вывожу результаты...");
//
//        }
        if (sc.hasNext("3")  == true){


        }

    }
    public static void showMenu(){
        System.out.println("   МЕНЮ");
        System.out.println("1. Возвести число в степень");
//        System.out.println("2. Показать результаты");
        System.out.println("3. Выход");

    }
    public static void menu(){
        showMenu();
        passMenu();
    }



}
