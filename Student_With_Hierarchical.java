package Inhertance;

public class Student_With_Hierarchical {

    class Citizen {
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

    class Undergrad extends Citizen {
        String course;

        void getCourse(String course) {
            this.course = course;
        }

        void displayUndergradInfo() {
            displayDetails();
            System.out.println("Course: " + course);
        }
    }

    class Postgrad extends Citizen {
        String specialization;

        void getSpecialization(String specialization) {
            this.specialization = specialization;
        }

        void displayPostgradInfo() {
            displayDetails();
            System.out.println("Specialization: " + specialization);
        }
    }

    public static void main(String[] args) {
        Student_With_Hierarchical outer = new Student_With_Hierarchical();

        Undergrad ug = outer.new Undergrad();
        ug.getDetails("Charlie", "789 Pine St");
        ug.getCourse("Mechanical Engineering");
        ug.displayUndergradInfo();

        Postgrad pg = outer.new Postgrad();
        pg.getDetails("Diana", "321 Oak St");
        pg.getSpecialization("Robotics");
        pg.displayPostgradInfo();
    }
}
