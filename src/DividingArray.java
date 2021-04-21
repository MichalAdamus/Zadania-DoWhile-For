public class DividingArray {
    public static void main(String[] args) {

        // ===== Liczby podzielne przez 5 =====

        int[] tabela = {10,15,20,77,66,25,50,100,77,88,99};
        for (int i = 0; i < tabela.length; i++) {
            if ((tabela[i] % 5) == 0) {
                System.out.println("Liczby podzielne przez 5: " + tabela[i]);
            }
            else {
                System.out.println("Liczby nie podzielne przez 5: " + tabela[i]);
            }
        }
    }
}
