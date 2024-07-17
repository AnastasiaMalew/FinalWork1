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
            printEmployees();
            printSumSalary();
            printMinSalary();
            printMaxSalary();
            printMiddleSalary();
            printNameEmployers();
        }

        private static void printEmployees() {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }

        private static void printSumSalary() {
            double sumSalary = 0;
            for (int i = 0; i <= employees.length - 1; i++) {
                sumSalary += employees[i].getSalary();
            }
            System.out.println("Сумма трат за месяц составила " + sumSalary + " рублей");
        }

        private static void printMinSalary() {
            double minSalary = employees[0].getSalary();
            for (int i = 0; i < employees.length - 1; i++) {
                if (employees[i].getSalary() != 0 && employees[i].getSalary() < minSalary) {
                    minSalary = employees[i].getSalary();
                    System.out.println("Минимальная зарплата " + minSalary + " рублей");
                }
            }
        }

        private static void printMaxSalary() {
            double maxSalary = employees[0].getSalary();
            for (int i = 0; i < employees.length - 1; i++) {
                if (employees[i].getSalary() > maxSalary) {
                    maxSalary = employees[i].getSalary();
                    System.out.println("Vаксимальная зарплата " + maxSalary + " рублей");
                }
            }
        }

        private static void printMiddleSalary() {
            double sumSalary = 0;
            for (int i = 0; i <= employees.length - 1; i++) {
                sumSalary += employees[i].getSalary();
            }double middleSalary = sumSalary / employees.length;
                System.out.println("Cреднее значение зарплат сотрудников: " + middleSalary + " рублей");
            }


        private static void printNameEmployers() {
            System.out.println("Список сотрудников:");
            for (int a = 0; a < employees.length; a++) {
                System.out.println(employees[a].getFirstName() + " " + employees[a].getSecondName() + " " + employees[a].getThirdName());
            }
        }
    }


