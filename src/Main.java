import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);

        System.out.println("--- Student Analyzer Run ---");
        System.out.println("Input Scores: " + scores);

        int excellentCount = analyzer.countExcellentStudents(scores);
        System.out.println("Excellent students (>= 8.0): " + excellentCount);

        double validAverage = analyzer.calculateValidAverage(scores);
        System.out.println("Valid Average: " + validAverage);

    }
}