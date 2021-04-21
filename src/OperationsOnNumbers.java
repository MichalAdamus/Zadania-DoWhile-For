public class OperationsOnNumbers {
    public static void main(String[] args) {
        // ===== SUMA =====

        int[] numbers = {3,4,5,6};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Wynik dodowania: " + sum);
    }
}

        // ===== ILOCZYN =====
//
//        int[] numbers = {5,5,5};
//        int sum = 1;
//        for (int j = 0; j < numbers.length;j++) {
//            sum *=numbers[j];
//        }
//        System.out.println("Wynik mnożenia: " + sum);
//    }
//}

        // ===== SORTOWANIE OD NAJMNIEJSZEJ =====

//        int[] numbers = {-1, 3, 4};
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + ",");
//        }
//        System.out.println();
//        for (int z = 0; z < numbers.length - 1; z++) {
//            for (int i = 0; i < numbers.length - 1; i++) {
//                if (numbers[i] > numbers[i + 1]) {
//                    int tmp = numbers[i];
//                    numbers[i] = numbers[i + 1];
//                    numbers[i + 1] = tmp;
//                }
//                for (int j = 0; j < numbers.length; j++) {
//                    System.out.print(numbers[j] + ",");
//                }
//                System.out.println();
//            }
//        }
//    }
//}
        // ===== MEDIANA =====

//        int[] numbers = {5,8,3,7,6};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + ",");
//        }
//        System.out.println();
//        for (int z = 0; z < numbers.length-1; z++) {
//            for (int i = 0; i < numbers.length-1; i++) {
//                if (numbers[i] > numbers[i + 1]) {
//                    int tmp = numbers[i];
//                    numbers[i] = numbers[i + 1];
//                    numbers[i + 1] = tmp;
//                }
//                for (int j = 0; j < numbers.length; j++) {
//                    System.out.print(numbers[j] + ",");
//                }
//                System.out.println();
//            }
//        }
//    }
//}
        // ===== MNAJMNIEJSZA I NAJWIEKSZA =====
//        int[] numbers = {-5, 45, 23, 14, 46, -3, 324, 56, 57, 43, 0, 435, 234, 45};
//        int max = numbers[0];
//        int min = numbers[0];
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > max)
//                max = numbers[i];
//        }
//        for (int j = 0; j < numbers.length; j++) {
//            if (numbers[j] < min)
//                min = numbers[j];
//        }
//        System.out.println("Największa Liczba w tabeli:" + max);
//        System.out.println("Najmniejsza Liczba w tabeli:" + min);
//    }
//}


