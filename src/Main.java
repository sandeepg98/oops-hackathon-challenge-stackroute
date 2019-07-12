import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Default settings for the Printer ! When the printer will be switched on.
        int printerTone=55;
        int printerPages=0;
        boolean printerDuplex=false;
        Printer printer=new Printer(printerTone,printerPages,printerDuplex);

        //Read the datas from the user to print the documents

        int userTone=72;
        int userPagesToPrint=700;
        printer.setToner(72);

        if(printer.isDuplex()) {
            if (userPagesToPrint % 2 == 0) {
                printer.print(userPagesToPrint / 2);
                printer.duplexAlter();
                printer.print(userPagesToPrint / 2);

            } else {
                printer.print((userPagesToPrint / 2) + 1);
                printer.duplexAlter();
                printer.print(userPagesToPrint / 2);

            }
        }
        else
        {
            System.out.println("This printer is not a duplex");
            printer.print(userPagesToPrint);
        }

    }
}
