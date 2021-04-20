public class DisplayNumbers {
    public static void main(String[] args) {
        int number = 25;
        do {
            number = number / 2;
            System.out.println("Wynik Dzielenia =" + number);
        }
        while (number > 0);
    }
}
