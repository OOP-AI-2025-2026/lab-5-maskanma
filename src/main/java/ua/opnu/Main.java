package ua.opnu;

public class Main {
    public static void main(String[] args) {

        // --- Тестування TimeSpan ---
        TimeSpan t1 = new TimeSpan();
        TimeSpan t2 = new TimeSpan(90);
        TimeSpan t3 = new TimeSpan(1, 45);
        TimeSpan t4 = new TimeSpan(t3);

        t1.add(1, 30);
        t2.add(15);
        t3.add(t2);

        t4.subtract(1, 15);
        t4.subtract(30);
        t4.subtract(t1);

        System.out.println("Результати TimeSpan:");
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);
        System.out.println("t4 = " + t4);

        Person[] people = {
                new Person("Іваненко", "Іван", 40),
                new Student("Петренко", "Олег", 20, "ІП-23", "123456"),
                new Student("Сидоренко", "Марія", 19, "П-23", "654321"),
                new Lecturer("Коваленко", "Олена", 45, "Інформатики", 25000.0)
        };

        System.out.println("\nІнформація про людей:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
