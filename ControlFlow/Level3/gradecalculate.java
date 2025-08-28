import java.util.Scanner;
public class gradecalculate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int physicsmarks,chemistrymarks,mathsmarks;
        System.out.print("enter physics marks: ");
        physicsmarks=scanner.nextInt();
        System.out.print("enter chemistry marks: ");
        chemistrymarks=scanner.nextInt();
        System.out.print("enter maths marks: ");
        mathsmarks=scanner.nextInt();
        double average=(physicsmarks+chemistrymarks+mathsmarks)/3;
        String grade="",remark="";
        if(average>=80 && average<=100){
            grade= "A";
            remark="(Level 4, above agency-normalized standard)";
        }
        else if(average>=70 && average<=79){
            grade= "B";
            remark="(Level 3, at agency-normalized standard)";
        }
        else if(average>=60 && average<=69){
            grade= "C";
            remark="(Level 2, below,but approaching agency-normalized standard)";
        }
        else if(average>=50 && average<=59){
            grade= "D";
            remark="(Level 1, well below agency-normalized standard)";
        }
        else if(average>=40 && average<=49){
            grade= "E";
            remark="(Level 1-, too below agency-normalized standard)";
        }
        else if(average>=0 && average<=39){
            grade= "R";
            remark="(Remedial standard)";
        }
        System.out.println("Average : "+average);
        System.out.println("Grade : "+grade);
        System.out.println("Remark : "+remark);
        scanner.close();
    }
}
