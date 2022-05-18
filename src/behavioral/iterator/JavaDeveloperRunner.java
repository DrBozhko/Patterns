package behavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Gradle", "PostgreSQL", "MySQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Daniel Bozhko", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
