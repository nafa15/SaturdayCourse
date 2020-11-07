package Practice3;

import java.util.Scanner;

public class ukl {
    public void main(String [] args) {

        MassIndex();

    }

    public static void MassIndex(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("First name: ");
        String First_name= scanner.next();

        System.out.println("Height");
        int h = scanner.nextInt();

        System.out.println("Your body mass index, Mr "+ First_name +" is " + h);
    scanner.close();

    }

}
