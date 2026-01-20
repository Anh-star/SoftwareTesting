import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {

    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    @Test
    @DisplayName("Kiểm tra đếm học sinh giỏi với các loại dữ liệu")
    public void testCountExcellentStudents() {
        List<Double> mixedScores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(2, analyzer.countExcellentStudents(mixedScores), "Nên trả về 2 học sinh giỏi (9.0 và 8.5)");

        List<Double> allValid = Arrays.asList(8.0, 9.5, 10.0);
        assertEquals(3, analyzer.countExcellentStudents(allValid));

        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));

        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(0.0, 10.0)));

        assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(-5.0, 15.0)));
    }

    @Test
    @DisplayName("Kiểm tra tính điểm trung bình hợp lệ")
    public void testCalculateValidAverage() {
        List<Double> mixedScores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(8.166, analyzer.calculateValidAverage(mixedScores), 0.01);

        List<Double> allValid = Arrays.asList(5.0, 6.0, 7.0);
        assertEquals(6.0, analyzer.calculateValidAverage(allValid), 0.001);

        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()));

        assertEquals(5.0, analyzer.calculateValidAverage(Arrays.asList(0.0, 10.0)));

        assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(-2.0, 12.0)));
    }
}