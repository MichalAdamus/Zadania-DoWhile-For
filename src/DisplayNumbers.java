public class DisplayNumbers {
    public static void main(String[] args) {
//        int [] number = {21,10,5,2,1,0};
//        int i =1;
//        do {
//            System.out.println("Reszta z Dzielenia =" + number[i]);
//            i++;
//        }
//        while (i < number.length && number[i] >=0);
//    }
//}
//        int a = 21 % 2;
//        int b = 10 % 2;
//        int c = 5 % 2;
//        int d = 2 % 2;
//        int e = 1 % 2;
//        System.out.print(a);
//        System.out.print(b);
//        System.out.print(c);
//        System.out.print(d);
//        System.out.print(e);
//    }
//}

        int number = 12;
        do {
            number = number %= 2;
            System.out.println("Reszta z Dzielenia =" + number);
        }
        while (number < 0);
    }
}

