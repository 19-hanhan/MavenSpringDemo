package hanhan3;

/**
 * @Author hanhan
 * @Date 2022/3/7 8:07
 */

public class MyDate {
    private int year;
    private int month;
    private LeapJudge lj;

    public MyDate(int year, int month, LeapJudge lj) {
        super();
        this.year = year;
        this.month = month;
        this.lj = lj;
    }

    int lastDayMonth() {
        int i = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                i = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                i = 30;
                break;
            case 2:
                i = lj.isLeap(year) ? 29 : 28;
                break;
            default:
                throw new IllegalArgumentException("month is out of range");
        }
        return i;
    }
}
