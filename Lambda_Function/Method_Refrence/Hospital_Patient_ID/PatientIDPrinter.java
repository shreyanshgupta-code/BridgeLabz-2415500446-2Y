package Method_Refrence.Hospital_Patient_ID;

import java.util.*;

public class PatientIDPrinter {
    public static void main(String[] args) {

        List<Patient> patients = Arrays.asList(
            new Patient("P101"),
            new Patient("P102"),
            new Patient("P103"),
            new Patient("P104")
        );

    
        patients.stream()
                .map(Patient::getId)   
                .forEach(System.out::println);  
    }
}

