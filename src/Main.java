public class Main {
    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Ivanov Ivan Ivanovich", 1, 91455);
        employee[1] = new Employee("Ivanov1 Ivan1 Ivanovich1", 2, 78455);
        employee[2] = new Employee("Ivanov2 Ivan2 Ivanovich2", 3, 95999);
        employee[3] = new Employee("Ivanov3 Ivan3 Ivanovich3", 1, 68445);
        employee[4] = new Employee("Ivanov4 Ivan4 Ivanovich4", 5, 101455);
        employee[5] = new Employee("Ivanov5 Ivan5 Ivanovich5", 4, 91578);
        employee[6] = new Employee("Ivanov6 Ivan6 Ivanovich6", 1, 85785);
        employee[7] = new Employee("Ivanov7 Ivan7 Ivanovich7", 2, 95234);
        employee[8] = new Employee("Ivanov8 Ivan8 Ivanovich8", 5, 113455);
        employee[9] = new Employee("Ivanov9 Ivan9 Ivanovich9", 4, 71415);
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i] + " ");
        }



    }
}