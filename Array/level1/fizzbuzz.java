import java.util.Scanner;
public class fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.print("enter the number : ");
        number=scanner.nextInt();
        if (number <= 0) {
        System.out.println("Please enter a positive integer.");
        return;
        }
        String [] fizzbuzz=new String[number];
        for(int i=1;i<=number;i++){
            if(i%3==0 && i%5==0){
                fizzbuzz[i-1]="fizzbuzz";
            }
            else if(i%3==0){
                fizzbuzz[i-1]="fizz";
            }
            else if(i%5==0){
                fizzbuzz[i-1]="buzz";
            }
            else{
                fizzbuzz[i-1]=String.valueOf(i);
            }
        }
        for(int i=1;i<=number;i++){
            System.out.println(fizzbuzz[i-1]);
        }
    scanner.close();
    }
}
