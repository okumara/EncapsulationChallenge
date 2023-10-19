public class Main {

    public static void main(String[] args) {
        Printer myPrinter= new Printer(50, true);
        myPrinter.addToner(75);
        myPrinter.printPages(75);

        System.out.println(myPrinter);

    }
}