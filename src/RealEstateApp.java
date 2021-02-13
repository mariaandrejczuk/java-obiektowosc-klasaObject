import java.util.Scanner;

public class RealEstateApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;

        do {
            System.out.println("-------- Real Estate App --------");
            System.out.println("1 - add real estate");
            System.out.println("2 - display all");
            System.out.println("0 - stop");

            option = scanner.nextInt();
            scanner.nextLine(); // \n

            switch(option){  //obsługa przypadków:
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }

        } while (option != 0);
    }
}
