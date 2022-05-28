public class Main<list> {

    public static void main(String[] args) {

        Employee[] list = new Employee[10];
        list[0] = new Employee("Ivanov Ivan Ivanovich", 1, 91455);
        list[1] = new Employee("Ivanov1 Ivan1 Ivanovich1", 2, 78455);
        list[2] = new Employee("Ivanov2 Ivan2 Ivanovich2", 3, 95999);
        list[3] = new Employee("Ivanov3 Ivan3 Ivanovich3", 1, 68445);
        list[4] = new Employee("Ivanov4 Ivan4 Ivanovich4", 5, 101455);
        list[5] = new Employee("Ivanov5 Ivan5 Ivanovich5", 4, 91578);
        list[6] = new Employee("Ivanov6 Ivan6 Ivanovich6", 1, 85785);
        list[7] = new Employee("Ivanov7 Ivan7 Ivanovich7", 2, 95234);
        list[8] = new Employee("Ivanov8 Ivan8 Ivanovich8", 5, 113455);
        list[9] = new Employee("Ivanov9 Ivan9 Ivanovich9", 4, 61415);
        for (Employee i : list) {
            System.out.println(i + " ");
            System.out.println();
        }
        salarySum(list);
        minSalary(list);
        maxSalary(list);

    }

    public static void salarySum(Employee[] list) {
        int sum = 0;
        double average = 0;
        if (list.length > 0) {
            for (int i = 0; i < list.length; i++) {
                sum += list[i].getSalary();
            }
            average = sum/ list.length;
        }

        System.out.println("Сумма затрат на зарплаты за месяц " +sum);
        System.out.println("Средняя сумма трат за месяц " + average);
    }

    public static void maxSalary(Employee[] list) {
        int maxSalary = 50000;
        String name = null;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() > maxSalary) {
                maxSalary = list[i].getSalary();
                name = list[i].getName();

            }
        }

        System.out.println("Максимальная зарплата у сотрудника " + name +" составляет " + maxSalary);
    }

    public static void minSalary(Employee[] list) {
        int minSalary = 150000;
        String name = null;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() < minSalary) {
                minSalary = list[i].getSalary();
                name= list[i].getName();
            }
            }
        System.out.println("Минимальная зарплата у сотрудника " + name + " составляет " + minSalary);
        }
    }

