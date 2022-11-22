public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("Mathematics", "MAT101", "MAT");
        Course c2 = new Course("Physics", "PHY101", "PHY");
        Course c3 = new Course("Chemistry", "CHM101", "CHM");

        Teacher t1 = new Teacher("Charles McGill", "MAT", "555");
        Teacher t2 = new Teacher("Min Lee", "PHY", "666");
        Teacher t3 = new Teacher("Jennifer Brighton", "CHM", "777");

        c1.addTeacher(t1);
        c2.addTeacher(t2);
        c3.addTeacher(t3);

        Student s1 = new Student("Emirhan Taş", "1030510562", "2", c1, c2, c3);
        s1.addBulkExamNote(100, 50, 100, 50,100, 50);
        s1.isPass();

        Student s2 = new Student("Cristiano Ronaldo", "0000000007", "4", c1, c2, c3);
        s2.addBulkExamNote(75, 50, 95, 50, 50, 50);
        s2.isPass();

        Student s3 = new Student("Lionel Messi", "0000000010", "3", c1, c2, c3);
        s3.addBulkExamNote(100, 50, 90, 50, 50, 50);
        s3.isPass();
    }

}