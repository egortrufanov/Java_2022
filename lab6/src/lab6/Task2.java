package lab6;

public class Task2 {

    public static void main(String[] args) {
        Date date = new Date();
        try {
            date.setYear(2022);
            date.setMonth(4);
            date.setDay(15);
            System.out.println(date.displayMonth(date.getMonth()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
