public class Main {
    public static void main(String[] args) {

        //////////// Counter check #1
        System.out.println("Count of instances: " + Timer.counter);
        System.out.println();


        //////////// Instantiation check
        System.out.println("\t\tI. Instantiation check:");

        Timer timer1 = new Timer();
        System.out.println(timer1.getTime());

        Timer timer2 = new Timer(999, 999, 999);
        System.out.println(timer2.getTime());

        Timer timer3 = new Timer(6);
        System.out.println(timer3.getTime());

        Timer timer4 = new Timer(6, 45);
        System.out.println(timer4.getTime());

        Timer timer5 = new Timer(6, 45, 32);
        System.out.println(timer5.getTime());

        System.out.println();


        //////////// Modification check
        System.out.println("\t\tII. Modification check:");

        System.out.println("\t\t\ta) Old time:");
        System.out.println(timer5.getHour());
        System.out.println(timer5.getMinute());
        System.out.println(timer5.getSecond());
        System.out.println(timer5.getTime());

        System.out.println("\t\t\tb) New time #1:");
        timer5.setHour(14);
        timer5.setMinute(4);
        timer5.setSecond(77);
        System.out.println(timer5.getHour());
        System.out.println(timer5.getMinute());
        System.out.println(timer5.getSecond());
        System.out.println(timer5.getTime());
        timer5.setTime(28, 54, 17);
        System.out.println("\t\t\tc) New time #2:");
        System.out.println(timer5.getTime());

        System.out.println();


        //////////// Counter check #2
        System.out.println("Count of instances: " + Timer.counter);

    }
}