import java.util.Scanner;

public class ShelterCiapkowoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;
        ShelterCiapkowoRepo shelterCiapkowoRepo = new ShelterCiapkowoRepo();

        do {
            System.out.println("------ Animal Shelter Ciapkowo ------");
            System.out.println("1 - add a cat: ");
            System.out.println("2 - add a dog: ");
            System.out.println("3 - displayAll: ");
            System.out.println("0 - stop");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Color: ");
                    String color = scanner.nextLine();

                    System.out.println("Goes outside (yes/no): ");
                    String goesOutside = scanner.nextLine();

                    Cat cat = new Cat(name, age, color, goesOutside);
                    shelterCiapkowoRepo.add(cat);

                    break;
                case 2:
                    System.out.print("Name: ");
                    name = scanner.nextLine();

                    System.out.print("Age: ");
                    age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Color: ");
                    color = scanner.nextLine();

                    System.out.println("Size (big/medium/small): ");
                    String isBigMediumSmall = scanner.nextLine();

                    Dog dog = new Dog(name, age, color, isBigMediumSmall);
                    shelterCiapkowoRepo.add(dog);

                    break;
                case 3:
                    shelterCiapkowoRepo.displayAll();
                    break;
            }
        } while (option != 0);
    }
}
