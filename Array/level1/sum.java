import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double [] elements=new double[10];
        double number;
        int i=0;
        double sum=0;
        while(true){
            if(i==10){
                break;
            }
        System.out.print("enter the number : ");
        number=scanner.nextDouble();
        if(number<=0){
            break;
        }
        elements[i]=number;
        i++;
        }
    for(i=0;i<elements.length;i++){
        sum+=elements[i];
    }
    System.out.print("sum of all the numbers is : "+sum);
    scanner.close();
}
}