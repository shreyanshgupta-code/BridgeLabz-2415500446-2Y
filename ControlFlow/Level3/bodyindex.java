import java.util.Scanner;
public class bodyindex {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double weight,height;
        System.out.print("enter weight in (kg) :");
        weight=scanner.nextDouble();
        System.out.print("enter height in (cm) :");
        height=scanner.nextDouble();
        double heightmeter=height/100;
        double BMI=weight/(heightmeter*heightmeter);
        if(BMI<=18.4){
            System.out.print("underweight");
        }
        else if(BMI>=18.5 && BMI<=24.9){
            System.out.print("normal");
        }
        else if(BMI>=25 && BMI<=39.9){
            System.out.print("overweight");
        }
        else{
            System.out.print("obese");
        }
        scanner.close();
    }
}
