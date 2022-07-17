package hanhan3;

import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyDateTest {

    LeapJudge leapJudge = new LeapJudge() {
        @Override
        public boolean isLeap(int year) {
            return false;
        }
    };

    @ParameterizedTest
    @CsvSource({"2021, 2"})
    void lastDayMonth1(int year, int month) {
        assertEquals(28, new MyDate(year, month, leapJudge).lastDayMonth());
    }

    @ParameterizedTest
    @CsvSource({"2020, 2"})
    void lastDayMonth2(int year, int month) {
        leapJudge = new LeapJudge() {
            @Override
            public boolean isLeap(int year) {
                return true; // 修改Stub代码
            }
        };
        assertEquals(29, new MyDate(year, month, leapJudge).lastDayMonth());
    }

    @ParameterizedTest
    @CsvSource({"2022, 4"})
    void lastDayMonth3(int year, int month) {
        assertEquals(30, new MyDate(year, month, leapJudge).lastDayMonth());
    }

    @ParameterizedTest
    @CsvSource({"2022, 5"})
    void lastDayMonth4(int year, int month) {
        assertEquals(31, new MyDate(year, month, leapJudge).lastDayMonth());
    }

    @ParameterizedTest
    @CsvSource({"2022, 13"})
    void lastDayMonth5(int year, int month) {
        assertThrows(IllegalArgumentException.class, () -> new MyDate(year, month, leapJudge).lastDayMonth());
    }

}