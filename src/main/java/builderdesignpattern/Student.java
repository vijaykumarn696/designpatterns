package builderdesignpattern;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String phone;
    private String uniName;

    public Student(Builder builder) {
        if (builder.getAge() > 100)
            throw new RuntimeException();
        this.age = builder.getAge();
        this.name = builder.getName();
        this.phone = builder.getPhone();
        this.psp = builder.getPsp();
        this.uniName = builder.getUniName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public static Builder getBuilder() {
        return new Builder();
    }


    //As Builder is a nested class of Student so it does not exist until Student object created
    static class Builder {
        private String name;
        private int age;
        private double psp;
        private String phone;
        private String uniName;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public String getUniName() {
            return uniName;
        }

        public Builder setUniName(String uniName) {
            this.uniName = uniName;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }
}
