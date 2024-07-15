import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public abstract class Main {
    public static void main(String[] args) {
        Employee fullName = new Employee("Иван", "Иванович", "Иванов", 1, 124000);
        System.out.println(fullName);
        int id = 1;
        System.out.println(id);

        Employee fullName1 = new Employee("Петр", "Петрович", "Петров", 2, 109000);
        System.out.println(fullName);
        int id1 = 2;
        System.out.println(id1);

        Employee fullName2 = new Employee("Иван", "петрович", "Семенов", 4, 320000);
        System.out.println(fullName2);
        int id2 = 3;
        System.out.println(id2);

        Employee fullName3 = new Employee("Семен", "Дмитриевич", "Петров", 5, 90000);
        System.out.println(fullName3);
        int id3 = 4;
        System.out.println(id3);

        int[] array = {124000, 109000, 320000,90000};
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задание 2");
        int[ ] payTwo = array;
        int maxPay = payTwo[0];
        for(int i = 0; i < payTwo.length; i++) {
            if (payTwo[i] > maxPay) {
                maxPay = payTwo[i];
            }
        }
        int minPay = payTwo[0];
        for(int i = 0; i < payTwo.length; i++) {
            if (minPay > payTwo[i]) {
                minPay = payTwo[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPay + " рублей. Максимальная сумма трат за неделю составила " + maxPay + " рублей");

        int[] coll = {124000, 109000, 320000,90000};

        var average = Arrays.stream(coll)
                .average()
                .getAsDouble();

        System.out.println("Сумма трат за месяц составила " + average + " рублей");
    }
}

