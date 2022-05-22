package ConstrOverloading;

public class Student {
    int id;
    String name;
    int age;
    Student(int i,String n){
    id = i;
    name = n;
    }
    Student(int i,String n,int a){
    id = i;
    name = n;
    age = a;
    }
    void display()
    {
    	System.out.println(id+" "+name+" "+age);
    }
	public static void main(String[] args) {
		Student s1 = new Student(802,"Naziya",21);
		Student s2 = new Student(810,"Javeriya",22);
		s1.display();
		s2.display();
	    }

}
