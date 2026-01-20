import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Khởi tạo đối tượng analyzer
        StudentAnalyzer analyzer = new StudentAnalyzer();

        // 2. Chuẩn bị dữ liệu đầu vào (bao gồm cả điểm hợp lệ và không hợp lệ)
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);

        System.out.println("--- Student Analyzer Run ---");
        System.out.println("Input Scores: " + scores);

        // 3. Gọi hàm đếm học sinh giỏi
        int excellentCount = analyzer.countExcellentStudents(scores);
        System.out.println("Excellent students (>= 8.0): " + excellentCount);

        // 4. Gọi hàm tính điểm trung bình
        double validAverage = analyzer.calculateValidAverage(scores);
        System.out.println("Valid Average: " + validAverage);
        
        System.out.println("-----------------------------");
    }
}