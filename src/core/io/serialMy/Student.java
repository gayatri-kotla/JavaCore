package core.io.serialMy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    int id;
    String name;
    String city;
    List<Student> list = new ArrayList<>();
    public Student(int id,String name,String city){
        this.id=id;
        this.name=name;
        this.city=city;
    }
public Student(){

}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void addStudent(Student s){
        list.add(s);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public void readStudent(int id){
        Iterator<Student> itr = list.iterator();
        while(itr.hasNext()){
            Student s  = itr.next();
            if(s.id==id){
                System.out.println(s);
            }
        }
    }
    public void updateStudent(Student ns,int id){
        Iterator<Student> itr = list.iterator();
        while(itr.hasNext()){
            Student os = itr.next();
            if(os.id==id){
                os.setName(ns.getName());
                os.setCity(ns.getCity());
            }
        }
    }
    public void deleteStudent(int id){
        Iterator<Student> itr = list.iterator();
        while(itr.hasNext()){
            Student s = itr.next();
            if(s.id==id){
                list.remove(id);
            }
        }
    }
    public void display(){
        Iterator<Student> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student(1,"somu","kadapa");
        Student s2 = new Student(2,"keerthi","chennai");
        s.addStudent(s1);
        s.addStudent(s2);
        s.display();


    }
}
