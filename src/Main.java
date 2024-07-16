import java.util.Arrays;

    public abstract class Main {
        private static final Employee[] employees = {
                new Employee("Иван", "Иванович", "Иванов", 1, 124000),
                new Employee("Петр", "Петрович", "Петров", 2, 109000),
                new Employee("Иван", "Петрович", "Семенов", 4, 320000),
                new Employee("Иван", "Петрович", "Михайлов", 4, 320000),
                new Employee("Семен", "Дмитриевич", "Петров", 5, 150000)
        };

        public static void main(String[] args) {
            double sumSalary = 0;
            for (int i = 0; i <= employees.length - 1; i++) {
                sumSalary += employees[i].getSalary();
            }
            System.out.println("Сумма трат за месяц составила " + sumSalary + " рублей");


            double minSalary = employees[0].getSalary();
            for (int i = 0; i < employees.length - 1; i++) {
                if (employees[i].getSalary() != 0 && employees[i].getSalary() < minSalary) {
                    minSalary = employees[i].getSalary();
                    System.out.println("Сотрудник с минимальной зарплатой " + minSalary + " рублей");}
            }

            double maxSalary = employees[0].getSalary();
            for (int i = 0; i < employees.length - 1; i++) {
                if (employees[i].getSalary() > maxSalary) {
                    maxSalary = employees[i].getSalary();
                    System.out.println("Минимальная зарплата за месяц составила " + maxSalary + " рублей");}
            }

            double middleSalary = sumSalary / employees.length;
            System.out.println("Cреднее значение зарплат сотрудников: " + middleSalary + " рублей");

            System.out.println("Список сотрудников:");
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i].getFirstName() + " " + employees[i].getSecondName() + " " + employees[i].getThirdName());
            }
        }

    }
