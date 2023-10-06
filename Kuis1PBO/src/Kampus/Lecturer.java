package Kampus;

class Lecturer extends Person {
    private String lecturerId;

    public Lecturer(String name, int age, String lecturerId) {
        super(name, age);
        this.lecturerId = lecturerId;
    }

    public String getLectureId() {
        return lecturerId;
    }

    public void setLectureId(String lecturerId) {
        this.lecturerId = lecturerId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Lecture ID: " + lecturerId);
    }
}
