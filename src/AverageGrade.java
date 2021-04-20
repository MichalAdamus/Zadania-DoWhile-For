public class AverageGrade {
    public static void main(String[] args) {
        // ===== Pierwszy przykład =====
//        int[] numbers = {1, 3, 5, 4, 5};
//        double sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//        sum /= numbers.length;
//        System.out.println(sum);

        // ==== Drugi przykład ====
        
        int[] numbers1 = {3,4,4,4,4,3,3,5};
        double sum = 0;
        for (int j = 0; j < numbers1.length; j++) {
            sum += numbers1[j];
        }
        sum /= numbers1.length;
        System.out.println(sum);
    }
}

