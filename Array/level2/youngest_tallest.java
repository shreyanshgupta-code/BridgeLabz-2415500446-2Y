import java.util.Scanner;
public class youngest_tallest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] name={"Amar","Akbar","Anthony"};
        int [] age=new int[3];
        double [] height=new double[3];
        for(int i=0;i<3;i++){
            System.out.print("enter the age of "+name[i]+" :");
            age[i]=scanner.nextInt();
            System.out.print("enter the height of "+name[i]+" (in cm) :");
            height[i]=scanner.nextDouble();
        }
        int young=0;
        for(int i=0;i<3;i++){
            if(age[i]<age[young]){
                young=i;
            }
        }
        int tall=0;
        for(int i=0;i<3;i++){
            if(height[i]>height[tall]){
                tall=i;
            }
        }
        System.out.println("youngest friend is : "+name[young]);
        System.out.println("tallest friend is : "+name[tall]);
        scanner.close();
    }
}
