public class Main {
    public static void main(String[] args) {
        System.out.println("Если мы перечислим все натуральные числа ниже 10, кратные 3 или 5, то получим 3, 5, 6 и 9. Сумма этих кратных равна 23. Найдите сумму всех чисел, кратных 3 или 5, меньших 1000");
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                //System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Найдите сумму всех чисел, кратных 3 или 5, меньших 1000 = " + sum);
    }
}