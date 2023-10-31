public class TriangleArea {
    public static void main(String[] args) {

        int sideA = 5;
        int sideB = 4;
        int sideC = 3;
        double triangleArea = Area(sideA, sideB, sideC);
        System.out.println(triangleArea);
    }

    public static double Area(int a, int b, int c) {

        // Используем формулу Герона для вычисления площади треугольника
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
}
