public class zadanie_2 {
    public static void main(String[] args) {
        int y = 0;
        int sumfib = 1;
        int z = 0;
        int sumchet = 0;
        System.out.println("Каждый новый член в последовательности Фибоначчи генерируется путем сложения двух предыдущих членов. Начиная с 1 и 2, первые 10 терминов будут: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... Рассматривая члены последовательности Фибоначчи, значения которых не превышают четырех миллионов, найдите сумму четных членов.");
        for (int i = 0; z < 4000000; i++) {
            z = y + sumfib;
            y = sumfib;
            sumfib = z;

            if (sumfib % 2 == 0) {
                sumchet += sumfib;
            }
            if (sumfib > 4000000)
                break;
            System.out.println(sumfib);
        }
        System.out.println("Сумма четных членов = "+sumchet);
    }
}
