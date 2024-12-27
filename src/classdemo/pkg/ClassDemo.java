package classdemo.pkg;

public class ClassDemo {
    public static  void  main(String[] args){
        Person p = new Person("rose",18);
        System.out.println(p.getAge());
        System.out.println(p.getName());

        Person pp  = new Person();
        System.out.println(pp.getName());
    }
}

class Person {
    private String name = "jack";
    private int age;

    public  Person() {
        // pass
    }

    public Person(String name,int age) {
            this.name = name;
            this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
