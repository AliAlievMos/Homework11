import java.util.Scanner;

public class calculation {
    public static void calculation() {
        try {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Введите число, которое хотите возвести в степень.");
            double a = Double.parseDouble(sc1.next());
            System.out.println("В какую сепень возвести это число?");
            double b = Double.parseDouble(sc1.next());
            System.out.println("Вычисление...");
            Threads.ThreadCalcul(a,b);



        } catch (Exception e){
            System.out.println("Не верный ввод!");
        }


    }
}
