public class Teacher {
    String name;
    String branch;
    String mpNo;
    Teacher(String name, String branch, String mpNo) {
        this.name = name;
        this.branch = branch;
        this.mpNo = mpNo;
    }
    void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Branch: " + this.branch);
        System.out.println("Mobile phone number: " + this.mpNo);
    }
}
