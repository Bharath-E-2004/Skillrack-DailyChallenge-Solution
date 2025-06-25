import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] date = new Scanner(System.in).nextLine().split("-");
        List<String> month = new ArrayList<>(Arrays.asList(
            "Saveetha", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        ));

        int mon = 0;
        for (String str : month) {
            if (str.startsWith(date[1])) {
                break;
            }
            mon++;
        }

        int year = Integer.parseInt(date[2]);

        if (mon == 1) {
            // Previous month is December of previous year, next month is February
            System.out.printf("%s %d %d days\n%s %d %d days\n",
                month.get(12), year - 1, getMonth(12, year - 1),
                month.get(mon + 1), year, getMonth(mon + 1, year)
            );
        } else if (mon == 12) {
            // Previous month is November, next month is January of next year
            System.out.printf("%s %d %d days\n%s %d %d days\n",
                month.get(mon - 1), year, getMonth(mon - 1, year),
                month.get(1), year + 1, getMonth(1, year + 1)
            );
        } else {
            // Normal case: previous and next months in same year
            System.out.printf("%s %d %d days\n%s %d %d days\n",
                month.get(mon - 1), year, getMonth(mon - 1, year),
                month.get(mon + 1), year, getMonth(mon + 1, year)
            );
        }
    }

    public static int getMonth(int mon, int year) {
        switch (mon) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                    return 29;
                }
                return 28;
            default:
                return 0; // Invalid month
        }
    }
}
/*
   Example Input/Output 1:

Input:

20-Jan-2020

Output:

December 2019-31 days

February 2020-29 days

Explanation:

Here the given date is 20-Jan-2020.

The previous month of Jan-2020 is December 2019 which contains 31 days.

The next month of Jan-2020 is February 2020 which contains 29 days.

Example Input/Output 2:

Input: 05-Aug-2021

Output:

July 2021-31 days

September 2021 - 30 days

Example Input/Output 3:

Input: 26-Dec-2004

Output:

November 2004-30 days

January 2005-31 days
*/
