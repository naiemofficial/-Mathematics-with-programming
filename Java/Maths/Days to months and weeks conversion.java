import java.util.Scanner;
class days2MonthsWeeks {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int days = input.nextInt();

        int months = days/30;
        int m_days = days%30;

        int weeks = days / 7;
        int w_days = days%7;

        System.out.println(months + " month(s) and " + m_days + " day(s)");
        System.out.println("or,\n" + weeks + " week(s) and " + w_days + " day(s)");
    }
}