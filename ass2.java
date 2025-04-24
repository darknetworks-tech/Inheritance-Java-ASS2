// Single Inheritance

public class ass2  {
    public static void main(String [] args){

        // Single Inheritance
        person Person1 = new person("John","Parker");

        Person1.showName();


        // Multi - Level Inheritance
        student Student1 = new student("Samuel","Oparah",4.49);

        Student1.showGpa();

        Student1.showName();


        // Hierarchical Inheritance

        employee Employee1 = new employee("Sammy","Oparah",20000);

        Employee1.showName();


    }

}

