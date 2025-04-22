package Inhertance;

class Human {
    String name;
    String address;

    void getDetails(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

class Pupil extends Human {
    String course;

    void getCourse(String course) {
        this.course = course;
    }

    void displayStudentInfo() {
        displayDetails();
        System.out.println("Course: " + course);
    }
}

class Postgraduate extends Pupil {
    String researchTopic;

    void getResearchTopic(String topic) {
        this.researchTopic = topic;
    }

    void displayGraduateInfo() {
        displayStudentInfo();
        System.out.println("Research Topic: " + researchTopic);
    }
}

public class Student_With_Multilevel {
    public static void main(String[] args) {
        Postgraduate grad = new Postgraduate();
        grad.getDetails("Bob", "456 Elm St");
        grad.getCourse("Data Science");
        grad.getResearchTopic("Artificial Intelligence");
        grad.displayGraduateInfo();
    }
}  


