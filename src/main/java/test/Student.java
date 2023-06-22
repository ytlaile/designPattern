package test;

public class Student implements Cloneable{   //注意需要实现Cloneable接口
    String name;

    public Student(String name){
        this.name = name;
    }
    public Student(){
    }

    public String getName() {
        return name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {   //这里我们改进一下，针对成员变量也进行拷贝
        Student student = (Student) super.clone();
        student.name = new String(name);
        return student;   //成员拷贝完成后，再返回
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        Student student0 = new Student("小明");
        Student student1 = (Student) student0.clone();
        System.out.println(student0.getName() == student1.getName());
    }
}
