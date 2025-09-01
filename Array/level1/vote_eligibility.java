import java.util.Scanner;
public class vote_eligibility{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size;
        System.out.print("enter the size: ");
        size=scanner.nextInt();
        int [] age=new int [size];
        for(int i=0;i<age.length;i++){
            age[i]=scanner.nextInt();
        }
        for(int i=0;i<age.length;i++){
            if(age[i]<0){
                System.out.println("invalid age");
            }
            else{
                if(age[i]>=18){
                System.out.println("The student with age "+age[i]+" can vote");
            }
            else{
                System.out.println("The student with age "+age[i]+" cannot vote");
            }
            }
        }
        scanner.close();
    }
}