package Lambda_Expression.Notification_Filtering;

import java.util.*;
import java.util.function.Predicate;

public class NotificationFilter {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Patient heart rate abnormal", 1),
            new Alert("Info", "Patient scheduled for X-ray", 3),
            new Alert("Warning", "Medicine stock low", 2),
            new Alert("Critical", "Oxygen saturation low", 1)
        );

        Predicate<Alert> criticalFilter = alert -> alert.type.equals("Critical");

        Predicate<Alert> highPriorityFilter = alert -> alert.priority == 1;

        Predicate<Alert> nonInfoFilter = alert -> !alert.type.equals("Info");

        System.out.println("\n--- Critical Alerts ---");
        alerts.stream().filter(criticalFilter).forEach(System.out::println);

        System.out.println("\n--- High Priority Alerts ---");
        alerts.stream().filter(highPriorityFilter).forEach(System.out::println);

        System.out.println("\n--- Non-Info Alerts ---");
        alerts.stream().filter(nonInfoFilter).forEach(System.out::println);
    }
}

