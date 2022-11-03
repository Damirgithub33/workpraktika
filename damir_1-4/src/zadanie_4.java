public class zadanie_4 {
    public static void main(String[] args) {
        System.out.println("В первой задаче вывести результат для делителей 3 и 5, 4 и 7");
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 4 == 0 && i % 7 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Результат = " + sum);
    }
}
