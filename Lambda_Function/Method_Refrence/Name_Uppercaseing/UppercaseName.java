package Method_Refrence.Name_Uppercaseing;

import java.util.*;

public class UppercaseName {
    public static void main(String[] args) {

        List<String> employees = Arrays.asList( "Amit","Sneha", "Rohan","Priya" );
        employees.stream()
                 .map(String::toUpperCase)  
                 .forEach(System.out::println); 

    }
}

