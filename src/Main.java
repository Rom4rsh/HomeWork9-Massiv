public class Main {
    public static void main(String[] args) {


        //Задача 1
        System.out.println("Задача 1");

        int[] salary = {15, 18, 20, 22, 25};
        int sum = 0;
        for (int i : salary) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        //Задача 2
        System.out.println("Задача 2");

        int minSum = salary[0];
        int maxSum = -1;
        for (int current : salary) {
            if (current > maxSum) {
                maxSum = current;
            } else if (current < minSum) {
                minSum = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSum + " рублей. Максимальная сумма трат за неделю составила " + maxSum + " рублей");


        // Задача 3
        System.out.println("Задача 3");

        int[] spendings = {100, 55, 288, 78, 145};
        double avg;
        int summ = 0;
        for (int i : spendings) {
            summ += i;
        }
        avg = (double) summ / spendings.length;
        System.out.println("Средняя сумма трат за месяц составила " + avg + " рублей");


        // Задача 4
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--)
            System.out.print(reverseFullName[i]);


    }


}