import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        addStudent(persons, "Kim", new String[]{"Java 1.0"});
        addStudent(persons, "Henrik", new String[]{});

        addTeacher(persons, "Tine", new String[]{"Java 1.0"});
        addTeacher(persons, "Stine", new String[]{});

        for (Person person : persons) {
            boolean result = person.addCourse("Java 1.0");
            if (!result) {
                if (person instanceof Student) {
                    System.out.println(person.getName() + " har allerede bestået dette kursus ");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan ikke undervise i dette fag ");
                }
            }
        }
    }

      private static void addStudent (ArrayList<Person> persons, String name, String[] passefdCoursesArray){
    ArrayList<String> passedCourses = new ArrayList<>();
    for (String course : passedCoursesArray){
        passedCourses.add(course);
    }
    Student student = new Student(name, passedCourses);
    persons.add(student);

    }

    private static void addTeacher(ArrayList<Person> persons, String name, String[] canTeachArray) {
        ArrayList<String> canTeach = new ArrayList<>();
        for (String course : canTeachArray) {
            canTeach.add(course);
        }
        Teacher teacher = new Teacher(name, canTeach);
        persons.add(teacher);

    }
}