import java.util.Scanner;
public class youngest_tallest{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        double heightAmar = scanner.nextDouble();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        double heightAkbar = scanner.nextDouble();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = scanner.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        double heightAnthony = scanner.nextDouble();
        if(ageAmar<ageAnthony && ageAmar<ageAkbar){
            System.out.print("Amar is youngest friend");
        }
        else if(ageAkbar<ageAmar && ageAkbar<ageAnthony){
            System.out.print("Akbar is youngest friend");
        }
        else if(ageAnthony<ageAkbar && ageAnthony<ageAmar){
            System.out.print("Anthony is youngest friend");
        }
        if(heightAmar>heightAkbar && heightAmar>heightAnthony){
            System.out.println("Amar is tallest friend");
        }
        else if(heightAkbar>heightAmar && heightAkbar>heightAnthony){
            System.out.println("Akbar is tallest friend");
        }
        else if(heightAnthony>heightAkbar && heightAnthony>heightAmar){
            System.out.println("Anthony is tallest friend");
        }
        scanner.close();
    }
}