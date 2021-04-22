public class DisplayNumbers {
    public static void main(String[] args) {

        int number = 25;
        do {
            int result = number / 2;
            int modulo = number % 2;
//            System.out.println(number + " / 2 = " + result + " reszta " + modulo );
            System.out.print(modulo);
            number = result;
        }
        while (number > 0);
    }
}

