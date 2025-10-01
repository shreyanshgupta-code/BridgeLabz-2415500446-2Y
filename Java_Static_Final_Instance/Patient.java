public class Patient {
    private static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;

    private final int patientID;

    private String name;
    private int age;
    private String ailment;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + p.patientID);
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Ailment: " + p.ailment);
            System.out.println("");
        } else {
            System.out.println("Not a Patient object!");
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient(101, "Alice", 30, "Fever");
        Patient p2 = new Patient(102, "Bob", 45, "Fracture");

        p1.displayDetails(p1);
        p2.displayDetails(p2);

        String notPatient = "Hello";
        p1.displayDetails(notPatient);

        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
    }
}

