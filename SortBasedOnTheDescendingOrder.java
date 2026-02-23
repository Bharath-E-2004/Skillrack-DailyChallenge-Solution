import java.util.*;

class Employee {
    String name;
    String inTime;
    String outTime;
    int workSeconds;

    Employee(String name, String inTime, String outTime) {
        this.name = name;
        this.inTime = inTime;
        this.outTime = outTime;
        this.workSeconds = totalSeconds(outTime) - totalSeconds(inTime);
    }

    static int totalSeconds(String time) {
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int min = Integer.parseInt(parts[1]);
        return hour * 3600 + min * 60;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String inTime = sc.next();
            String outTime = sc.next();
            list.add(new Employee(name, inTime, outTime));
        }

        Collections.sort(list, (e1, e2) -> {

            // 1️⃣ Descending working time
            if (e1.workSeconds != e2.workSeconds)
                return e2.workSeconds - e1.workSeconds;

            // 2️⃣ Ascending in-time
            int inCompare = Employee.totalSeconds(e1.inTime) -
                            Employee.totalSeconds(e2.inTime);
            if (inCompare != 0)
                return inCompare;

            // 3️⃣ Ascending name
            return e1.name.compareTo(e2.name);
        });

        for (Employee e : list) {
            System.out.println(e.name);
        }
    }
}
/*
The program must accept the name, in-time and out-time (in 24-hr format HH:MM) of N employees as the input. The program must print the names of the employees in descending order based on their working time. If two or more employees have the same working time then those employees must be printed in chronological order based on their in-time. If two or more employees have the same working time and the same in-time then those employees must be printed in sorted order based on their names.

Boundary Condition(s):

1 <= N <=50

1 <= Length of each employee's name <= 10

Input Format:

The first line contains N.

The next N lines, each contains the name, in-time and out-time of an employee separated by a space.

Output Format:

The first N lines contain the names of the N employees based on the given conditions.

Example Input/Output 1:

Input

7

Rajesh 08:45 16:45

Catherine 09:15 17:45

Deepa 08:00 18:00

Pravin 09:00 17:30

Jhanvi 08:45 16:45

Hector 09:00 18:00

Mambo 09:00 17:00

Output:

Deepa

Hector

Pravin

Catherine

Jhanvi Rajesh

Mambo
*/
