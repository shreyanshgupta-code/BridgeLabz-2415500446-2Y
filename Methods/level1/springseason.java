import java.util.Scanner;
public class springseason {
    static boolean season(int month,int day){
        if(month==3 && (day>=20 && day<=31)) {
            return true;
        }
        else if((month>3 && month<6) && (day>=1 && day<=31)){
            return true;
        }
        else if(month==6 && (day>=1 && day<=20)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int day,month;
        System.out.print("enter month : ");
        month=scanner.nextInt();
        System.out.print("enter day : ");
        day=scanner.nextInt();
        if(month==3 && (day>=20 && day<=31)){
            System.out.print("its a spring season");
        }
        else if((month>3 && month<6) && (day>=1 && day<=31)){
            System.out.print("its a spring season");
        }
        else if(month==6 && (day>=1 && day<=20)){
            System.out.print("its a spring season");
        }
        else{
            System.out.print("its not a spring season");
        }
        scanner.close();
    }
}

