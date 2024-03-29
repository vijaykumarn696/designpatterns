package builderdesignpattern;

public class Builder {
    private  String name;
    private int age;
    private  double psp;
    private  String phone;
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
        return  this;
    }

    public double getPsp() {
        return psp;
    }

    public Builder setPsp(double psp) {
        this.psp = psp;
        return  this;
    }

    public String getPhone() {
        return phone;
    }

    public Builder setPhone(String phone) {
        this.phone = phone;
        return  this;
    }

    public String getUniName() {
        return uniName;
    }

    public Builder setUniName(String uniName) {
        this.uniName = uniName;
        return  this;
    }

//    public Student build()
//    {
//        return new Student(this);
//    }
}
