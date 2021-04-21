public class LettersCounter {
    public static void main(String[] args) {
        int literaA = 0;
        int litaeraa = 0;

        int[] tablicaLiter = {'A', 'a', 'A', 'A', 'a', 'A', 'a', 'A', 'A', 'a'};

        for (int i = 0; i < tablicaLiter.length; i++) {
            int litera = tablicaLiter[i];
            if (litera == 'A') {
                literaA++;
            }
            if (litera == 'a') {
                litaeraa++;
            }
        }
        System.out.println("Zliczone litery:");
        System.out.println("Litera A: " + literaA);
        System.out.println("Litera a: " + litaeraa);
    }
}

