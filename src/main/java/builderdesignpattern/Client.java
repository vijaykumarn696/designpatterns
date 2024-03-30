package builderdesignpattern;

public class Client {
    public static void main(String[] args) {
//        //Approach 1
//        Builder builder=new Builder();
//        builder.setAge(100);
//        builder.setName("vijay");
//        builder.setPhone("88888888888");
//        builder.setPsp(99);
//
//        Student student=new Student(builder);
//        System.out.println("Debug");

        //Approach 2
       Student student=Student.getBuilder()
               .setAge(27)
               .setName("vijay")
               .setPsp(99)
               .setPhone("999999999")
               .setUniName("SVU")
               .build();



    }



}
