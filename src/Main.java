import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Саша");
        Student student2 = new Student("Маша");
        Student student3 = new Student("Паша");
        Student student4 = new Student("Даша");

        Student[] students = {student1, student2};
        Student[] students1 = {student3, null, student4};

        Group group = new Group(120, "JV-F22", students);
        Group group1 = new Group(122, "CS-F22", students1);

        Group[] groups = {group1, group};


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить студента");
            System.out.println("2. Поиск по названию группы");
            System.out.println("3. Просмотр всех групп и их учеников");
            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    group.addStudent();
                    break;
                case 2:
                    Group.searchGroupByName(groups);
                    break;
                case 3:
                    Group.printGroups(groups);
                    break;
                default:
                    break;
            }
        }
    }
}