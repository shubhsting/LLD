package DESIGN_PATTERNS.CREATIONAL_PATTERNS.BUILDER;

public class Main {

    public static void main(String[] args) {
        Student student = Student.builder()
                .withAddress("Village Satheri")
                .withAge(10)
                .withFirstName("Shubham")
                .withLastName("Singh")
                .withPhoneNumber("123456789888")
                .build();
        System.out.println(student.getFirstName());

        Student student2 = Student.builder()
                .withAddress("Village Satheri")
                .withAge(10)
                .withFirstName("Shubham")
                .withLastName("Singh")
                .withPhoneNumber("123456789888")
                .build();
                
        System.out.println(student2.getFirstName());
    }
}
