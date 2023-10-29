import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Last Name: ");

        String lastName = scanner.nextLine();

        System.out.println("Enter Your First Name: ");

        String firstName = scanner.nextLine();

        System.out.println("Enter Your Middle Name: ");

        String middleName = scanner.nextLine();

        System.out.println("Enter your Birthyear (ex. 2023):");

        int birthYear = scanner.nextInt();

        System.out.println("Enter your BirthMonth (ex. 1-12): ");
        
        int birthMonth = scanner.nextInt();

        System.out.println("Enter your Birthday(ex 1-31:) ");

        int birthDay = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter Your Gender (M/F): ");

        char gender = scanner.nextLine().charAt(0);

        System.out.println("Enter your height (in centimeters): ");
        double height = scanner.nextDouble();

        System.out.println("Enter your weight (in kilograms): ");
        double weight = scanner.nextDouble();

        scanner.close();

        System.out.println();

        LocalDate birthday = LocalDate.of(birthYear, birthMonth, birthDay);
        Person thPerson = new Person(lastName, firstName, middleName, birthday , gender, height, weight);
        System.out.println("Your Information");
        System.out.println("Last Name: " + thPerson.getLastName());
        System.out.println("First Name: "+ thPerson.getFirstName());
        System.out.println("Middle Name: "+ thPerson.getMiddleName());
        System.out.println("Birthday: "+ thPerson.getBirthDate());
        System.out.println("Gender: " + thPerson.getGender());
        System.out.println("Height: "+ thPerson.getHeight() + "cm");
        System.out.println("Weight: "+ thPerson.getWeight() + "kg");
    }
}
