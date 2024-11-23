class Course {
    private String ID;
    private String description;
    private int duration;
    private double fees;

    public Course(String ID, String description, int duration, double fees) {
        this.ID = ID;
        this.description = description;
        this.duration = duration;
        this.fees = fees;
    }

    public void GetData() {
        System.out.println("Course ID: " + ID);
        System.out.println("Description: " + description);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fees: $" + fees);
        System.out.println();
    }

    public static void main(String[] args) {
        Course[] courses = new Course[5];

        courses[0] = new Course("C101", "Java Programming", 10, 500.0);
        courses[1] = new Course("C102", "Web Development", 8, 400.0);
        courses[2] = new Course("C103", "Data Science", 12, 800.0);
        courses[3] = new Course("C104", "Machine Learning", 15, 900.0);
        courses[4] = new Course("C105", "Cyber Security", 10, 600.0);

        for (Course course : courses) {
            course.GetData();
        }
    }
}
