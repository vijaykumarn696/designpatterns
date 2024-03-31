package prototypedesignpattern;

public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private double psp;
    private double avgBatchPsp;
    private String batch;
    private int nameCounter=0;

    public Student(){};
    public Student(Student student)
    {
        this.name=student.name;
        this.age=student.age;
        this.psp=student.psp;
        this.batch=student.batch;
        this.avgBatchPsp=student.avgBatchPsp;

    }
    @Override
    public Student clone() {
//        Student copy=new Student();
//        copy.name=this.name;
//        copy.age=this.age;
//        copy.psp=this.psp;
//        copy.avgBatchPsp=this.avgBatchPsp;
//        copy.batch=this.batch;
//        return  copy;
        return new Student(this);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.nameCounter++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

}
