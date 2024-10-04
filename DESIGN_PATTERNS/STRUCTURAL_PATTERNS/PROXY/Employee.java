package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.PROXY;

public class Employee {
    String name;
    int age;
    String address;

    private Employee(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static Builder builder() {
        return new Builder();
    }

    static class Builder {
        String name;
        int age;
        String address;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
