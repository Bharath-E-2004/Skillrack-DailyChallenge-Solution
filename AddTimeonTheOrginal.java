import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String time[] = sc.next().split(":");
        long K = sc.nextInt();
        long Val = sc.nextInt();

        long hh = convertToLong(time[0]);
        long mm = convertToLong(time[1]);
        long ss = convertToLong(time[2]);

        printTheTime(hh, mm, ss, Val);
        printTheTime(hh, mm, ss, Val / K);
    }

    public static long convertToLong(String val) {
        return Long.parseLong(val);
    }

    public static void printTheTime(long hh, long mm, long ss, long val) {
        ss += val;
        mm += ss / 60;
        hh += mm / 60;

        ss %= 60;
        mm %= 60;
        hh %= 12;
        if (hh == 0) hh = 12; // to keep it in 12-hour format

        System.out.printf("%02d:%02d:%02d\n", hh, mm, ss);
    }
}
/*
  Add The Seconds On The Orginal Time on it.
*?
