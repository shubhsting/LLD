package DESIGN_PATTERNS.CREATIONAL_PATTERNS.PROTOTYPE;

class Student implements Prototype {
    String name;
    Integer rollNo;
    private String phoneNo;
    private String address;

    Student() {
    }

    Student(String name, Integer rollNo, String phoneNo, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    @Override
    public Prototype clone() {
        return new Student(name, rollNo,phoneNo, address);
    }
}