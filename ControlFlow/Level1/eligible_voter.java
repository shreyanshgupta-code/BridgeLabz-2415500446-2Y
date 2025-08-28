import java.util.Scanner;
public class eligible_voter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int age;
        System.out.print("enter the age: ");
        age=scanner.nextInt();
        if(age>=18){
            System.out.print("The person's age is "+age+" and can vote");
        }
        else{
            System.out.print("The person's age is "+age+" and cannot vote");
        }
        scanner.close();
    }
}
