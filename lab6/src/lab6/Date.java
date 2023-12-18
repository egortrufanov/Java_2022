package lab6;

public class Date {
    private int day = 1;
    private int month = 1;
    private int year = 1970;

    public int getDay() {
        return day;
    }
    public void setDay(int day) throws Exception {
        if (day > 31) throw new Exception(String.format("Дня %s не существует", day));
        else if (day == 31 && (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11)) {
            throw new Exception(String.format("Дня %s не существует в месяце %s", day, this.month));
        } else if (this.month == 2 && (day > 29 || day > 28 && (this.year % 4 != 0))) {
            throw new Exception(String.format("Дня %s не существует в месяце %s в году %s", day, this.month, this.year));
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) throws Exception {
        if (month > 12) throw new Exception(String.format("Месяца %s не существует", month));
        this.month = month;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String displayMonth(int month) throws Exception {
        return switch (month) {
            case 1 -> "Январь";
            case 2 -> "Февраль";
            case 3 -> "Март";
            case 4 -> "Апрель";
            case 5 -> "Май";
            case 6 -> "Июнь";
            case 7 -> "Июль";
            case 8 -> "Август";
            case 9 -> "Сентябрь";
            case 10 -> "Октябрь";
            case 11 -> "Ноябрь";
            case 12 -> "Декабрь";
            default -> throw new Exception(String.format("Месяца %s не существует", month));
        };
    }
}
