package DESIGN_PATTERNS.CREATIONAL_PATTERNS.BUILDER;

public class Student {
    private String firstName;
    private String lastName;
    private Integer age;
    private String phoneNumber;
    private String address;

    private Student(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private Integer age;
        private String phoneNumber;
        private String address;

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder withPhoneNumber(String phoneNo) {
            this.phoneNumber = phoneNo;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
