package learning;
public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int grade;
    private double gpa;

    public Student(int id, String name, int grade, double gpa) {
        this.id   = id;
        this.name    = name;
        this.grade   = grade;
        this.gpa = gpa;
    }

    public int getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public double getGPA() {
        return gpa;
    }

    public boolean equals(Student other) {
        return this.getID() == other.getID();
    }

    public int compareTo(Student other) {
        if(this.equals(other)) {
            return 0;
        } else if (getID() > other.getID()) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return getID() + " " + getName() + " " + getGrade() + " " + getGPA();
    }



}