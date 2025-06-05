import java.util.*;

class Company {
    String domain;

    public Company(String domain) {
        this.domain = domain.toLowerCase();
    }

    public String generateEmailId(String name, String emp) {
        return String.format("%s.%s@%s", name.toLowerCase(), emp.toLowerCase(), domain);
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String domainName = sc.nextLine().trim();
        Company company = new Company(domainName);

        int N = Integer.parseInt(sc.nextLine().trim());

        for (int ctr = 1; ctr <= N; ctr++) {
            String emp[] = sc.nextLine().trim().split("\\s+");
            System.out.println(company.generateEmailId(emp[0], emp[1]));
        }

        sc.close();
    }
}
/*
   There are N employees in a company. The name and designation of the N employees are passed as the input. The domain name of the company is also passed as the input. The program must generate an email ID for each employee based on the following conditions.

- The email ID must be formed by concatenating the employee name, the employee designation and the domain name of the company as given below.

employeename.designation@domainname - All the alphabets in the email ID must be in lower case.

Finally, the program must print the email ID of each employee as the output.

Your task is to define the class Company so that the program runs successfully.

Example Input/Output 1:

Input:

xyz.com

5

Babloo HR

Deepa SDE

Catherine HR

Mambo ProjectLead

Nancy SDE

Output:

babloo.hr@xyz.com

deepa.sde@xyz.com

catherine.hr@xyz.com

mambo.projectlead@xyz.com

nancy.sde@xyz.com

Explanation:

Here N5 and the domain name of the company is xyz.com.

After concatenating the employee name, the designation and the domain name, the email ID's of the 5 employees are given below.

babloo.hr@xyz.com

deepa.sde@xyz.com

catherine.hr@xyz.com

mambo.projectlead@xyz.com

nancy.sde@xyz.com
 */
