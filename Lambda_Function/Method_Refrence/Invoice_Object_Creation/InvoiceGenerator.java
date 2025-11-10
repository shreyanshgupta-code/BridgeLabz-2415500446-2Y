package Method_Refrence.Invoice_Object_Creation;

import java.util.*;
import java.util.stream.Collectors;

public class InvoiceGenerator {
    public static void main(String[] args) {

        List<String> transactionIds = Arrays.asList("TXN1001","TXN1002","TXN1003","TXN1004");
        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)     
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}

