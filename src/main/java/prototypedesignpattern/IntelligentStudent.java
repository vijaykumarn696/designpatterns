package prototypedesignpattern;

public class IntelligentStudent extends Student{
    private int iq;
    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
    public IntelligentStudent(){};
    public IntelligentStudent(IntelligentStudent intelligentStudent)
    {
        super(intelligentStudent);
        this.iq=intelligentStudent.iq;
    }

    @Override
    public IntelligentStudent clone()
    {
//        IntelligentStudent copy=new IntelligentStudent();
//        copy.iq=this.iq;
//        return copy;
        return new IntelligentStudent(this);
    }


}
