import java.util.Scanner;
public class handshake {
    static void hand(){
        Scanner scanner=new Scanner(System.in);
        int student,handshake;
        System.out.print("number of student : ");
        student=scanner.nextInt();
        System.out.print("total number of handshake : ");
        handshake=(student*(student-1))/2;
        System.out.print(handshake);
        scanner.close(); 
    }
    public static void main(String[] args) {
        hand();
    }
}
