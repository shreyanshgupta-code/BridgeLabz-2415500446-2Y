import java.util.Scanner;
public class spring_season {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int month,day;
        System.out.print("enter month: ");
        month=scanner.nextInt();
        System.out.print("enter day: ");
        day=scanner.nextInt();
        if(month==3 && day>=20 && day<=31){
            System.out.print("its a spring season");
        }
        else if(month==4 && day>=1 && day<=30){
            System.out.print("its a spring season");
        }
        else if(month==5 && day>=1 && day<=31){
            System.out.print("its a spring season");
        }
        else if(month==6 && day>=1 && day<=20){
            System.out.print("its a spring season");
        }
        else{
            System.out.print("not a spring season");
        }
        scanner.close();
    }
}