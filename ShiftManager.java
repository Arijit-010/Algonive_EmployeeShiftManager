import java.util.ArrayList;
import java.util.Scanner;

public class ShiftManager {

    static ArrayList<Employee> employees = new ArrayList<>();
    static ArrayList<Shift> shifts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample users
        employees.add(new Employee(1, "Admin", "admin"));
        employees.add(new Employee(2, "Arijit", "employee"));

        System.out.println("=== Employee Shift Manager ===");
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee currentUser = null;
        for (Employee e : employees) {
            if (e.id == id) {
                currentUser = e;
                break;
            }
        }

        if (currentUser == null) {
            System.out.println("Invalid user!");
            return;
        }

        if (currentUser.role.equals("admin")) {
            System.out.println("Welcome Admin");
            System.out.print("Enter Employee ID for shift: ");
            int empId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Date (DD-MM-YYYY): ");
            String date = sc.nextLine();
            System.out.print("Enter Start Time: ");
            String start = sc.nextLine();
            System.out.print("Enter End Time: ");
            String end = sc.nextLine();

            shifts.add(new Shift(empId, date, start, end));
            System.out.println("Shift added successfully!");

        } else {
            System.out.println("Welcome " + currentUser.name);
            System.out.println("Your Shifts:");
            for (Shift s : shifts) {
                if (s.empId == currentUser.id) {
                    s.displayShift();
                }
            }
        }
    }
}
