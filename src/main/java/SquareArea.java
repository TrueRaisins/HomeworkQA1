public class SquareArea {
    public static void main(String[] args) {

        int sideLength = 5;
        int squareArea = calculateSquareArea(sideLength);
        System.out.println(squareArea);
    }

    public static int calculateSquareArea(int side) {
        return side * side;
    }
}