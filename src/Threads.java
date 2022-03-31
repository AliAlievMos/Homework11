public class Threads {
public static final Object monitor = new Object();
    public static void ThreadCalcul(double a, double b) {
        new Thread(() -> {

            synchronized (monitor) {
                try {
                    ThreadMenu();
                    monitor.wait(5000);
//                    monitor.wait();



                } catch (InterruptedException e) {
                    System.out.println("Thread has been interrupted");
                }
                    double result = Math.pow(a, b);
                    System.out.println("ПОЛУЧЕН РЕЗУЛЬТАТ ВОЗВЕДЕНИЯ " + a + " В СТЕПЕНЬ " + b + " РАВЕН " + result);


            }
        }).start();
    }
    public static void ThreadResult(){
        new Thread (() -> {

            synchronized (monitor) {

//                monitor.notifyAll();
                ThreadMenu();

            }
        }).start();


    }
    public static void ThreadMenu() {
        new Thread(() -> {
            menu.menu();
        }).start();


    }

}
