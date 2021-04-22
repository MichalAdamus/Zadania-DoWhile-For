public class DecimalToBinary {
    public static void main(String[] args) {
        int number = 584;
        int numberSystem = 8; // Dozwolone wartości zmiennej numberSystem od 2 -10;

        int[] numbers = new int[number];
        int i = 0;
                do {
            int result = number / numberSystem;
            int modulo = number % numberSystem;
            numbers[i] = modulo;
            i++;
            number = result;

        }
        while (number > 0);

        int j = i - 1;
        while (j >= 0) {
            System.out.print(numbers[j]);
            j--;
        }
    }
}




