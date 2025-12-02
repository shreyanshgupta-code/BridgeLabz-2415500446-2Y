package students;
import java.util.Scanner;

public class Menu implements IMenu {
	public void showmenu() {
		IStudent s=new Student();
		Scanner sc=new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Students Database Menu");
			System.out.println("1. Insert a Student");
			System.out.println("2. Insert Multiple Students");
			System.out.println("3. Update a Student");
			System.out.println("4. Update Multiple Students");
			System.out.println("5. Delete a Student");
			System.out.println("6. Delete Multiple Students");
			System.out.println("7. Show Students");
			System.out.println("8. Exit");
			System.out.print("Enter your choice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1: s.insertstudent();
			System.out.println("-----------------------------------------------------------------------------------------");
			break;
			case 2: s.insertmultiplestudent();
			System.out.println("-----------------------------------------------------------------------------------------");
			break;
			case 3: s.updatestudent();
			System.out.println("-----------------------------------------------------------------------------------------");
			break;
			case 4: s.updatemultiplestudent();
			System.out.println("-----------------------------------------------------------------------------------------");
			break;
			case 5: s.deletestudent();
			System.out.println("-----------------------------------------------------------------------------------------");
			break;
			case 6: s.deletemultiplestudent();
			System.out.println("-----------------------------------------------------------------------------------------");
			break;
			case 7: s.showstudent();
			System.out.println("-----------------------------------------------------------------------------------------");
			break;
			case 8: s.exit();
			System.out.println("-----------------------------------------------------------------------------------------");
			}
		}while(choice!=8);
		sc.close();
    }
}
