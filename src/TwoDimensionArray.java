public class TwoDimensionArray {
    public static void main(String[] args) {
        int[][] numbers = {{1, 5, 7, 6, 4}, {3, 4, 6, 7}, {44, 56, 777, 666}, {1, 2, 3,}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}