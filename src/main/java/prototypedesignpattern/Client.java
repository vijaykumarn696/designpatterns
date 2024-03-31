package prototypedesignpattern;

public class Client {

    public static void main(String[] args) {
    StudentRegistry studentRegistry=new StudentRegistry();
    fillStudentRegistry(studentRegistry);
    Student vijay=studentRegistry.get("apr22prototype").clone();
    vijay.setName("Vijay");
    vijay.setAge(27);
    vijay.setPsp(99);

    Student kumar=studentRegistry.get("sep22prototype").clone();
    kumar.setName("Kumar");
    kumar.setPsp(97);
    kumar.setAge(29);

        Student siva=studentRegistry.get("apr22prototype").clone();
        siva.setName("Siva");
        siva.setPsp(91);
        siva.setAge(31);
        Student raj=studentRegistry.get("sep22prototype").clone();
        raj.setName("raj");
        raj.setPsp(93);
        raj.setAge(26);

        Student st=new Student();
        st.setName("VijayaKumar");
        st.setAge(27);
        st.setPsp(99);
        st.setBatch("Apr 22");
        st.setAvgBatchPsp(91);


        Student copy=st.clone();

        Student intelligentStudent=new IntelligentStudent();
        intelligentStudent.setName("KumarN");
        intelligentStudent.setBatch("Sep 22");
        intelligentStudent.setAvgBatchPsp(93);

        Student intelligentcopy=intelligentStudent.clone();


        System.out.println("Debug");

    }
    public static void fillStudentRegistry(StudentRegistry studentRegistry)
    {

        Student apr22prototype=new Student();

        apr22prototype.setBatch("Apr 22");
        apr22prototype.setAvgBatchPsp(99);
        studentRegistry.add("apr22prototype",apr22prototype);

        IntelligentStudent sep22prototype=new IntelligentStudent();
        sep22prototype.setBatch("Sep 22");
        sep22prototype.setAvgBatchPsp(99.5);
        sep22prototype.setIq(180);
        studentRegistry.add("sep22prototype",sep22prototype);



    }


}
