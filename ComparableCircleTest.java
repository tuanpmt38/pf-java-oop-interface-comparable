import java.util.Arrays;
public class ComparableCircleTest {
    public static void main(String[] args) {
        CompareCircle[] circles = new CompareCircle[3];
        circles[0] = new CompareCircle(3.6);
        circles[1] = new CompareCircle();
        circles[2] = new CompareCircle("green",false,3.5);

        System.out.println("Pre-sorted:");
        for (CompareCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (CompareCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
