import java.util.Arrays;
import java.util.Scanner;

public class Group {
    private Integer id;
    private String name;
    private Student[] students;


    public Group() {
    }

    public Group(String name) {
        this.name = name;
    }

    public Group(Integer id, String name, Student[] students) {
        this.id = id;
        this.name = name;
        this.students = students;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {

        this.students = students;
    }

    public boolean addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя студента, которого хотите добавить в группу: ");
        String name = sc.nextLine();
        Student student = new Student(name);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println("В группу добавлен новый студент- " + student.getName());
                return true;
            }
        }
        System.out.println("В группе нет места");
        return false;
    }

    public static boolean searchGroupByName(Group[] groups) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название группы, которую хотите найти: ");
        String name = sc.nextLine();
        Group group = new Group(name);
        for (int i = 0; i < groups.length; i++) {
            if ((groups[i]).getName().equals(group.getName())) {
                System.out.println("Список студентов " + groups[i].getName() + ": \n" + (Arrays.toString(groups[i].getStudents())));
                return true;
            }
        }
        System.out.println("Группы с таким названием нет");
        return false;
    }


    public static void printGroups(Group[] groups) {
        for (int i = 0; i < groups.length; i++) {
            System.out.println("ID группы: " + (groups[i].getId()) + "\n" + "Название группы: " + (groups[i].getName()) + "\n" + "Cписок студентов: " + (Arrays.toString(groups[i].getStudents())));
            System.out.println("-----");
            System.out.println();
            }
    }
}