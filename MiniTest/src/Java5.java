import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Java5 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("[달력 출력 프로그램]");
            System.out.print("달력의 년도를 입력해주세요.(yyyy)");
            int year = sc.nextInt();
            System.out.print("달력의 월을 입력해주세요.(mm)");
            int month = sc.nextInt();

            LocalDate date = LocalDate.of(year, month, 1);
            LocalDate last = date.minusMonths(1);
            LocalDate next = date.plusMonths(1);

            printCalendar(last);
            printCalendar(date);
            printCalendar(next);

            sc.close();
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
    }

    public static void printCalendar(LocalDate date) {
        int end = date.lengthOfMonth();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfNum = dayOfWeek.getValue();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu년 MMM");
        System.out.println("[" + formatter.format(date) + "]");
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        if (dayOfNum != 7) {
            for (int i = 0; i < dayOfNum; i++) {
                System.out.print("\t");
            }
        }

        for (int i = 1; i <= end; i++) {
            System.out.printf("%02d\t", i);
            if ((i + dayOfNum) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}