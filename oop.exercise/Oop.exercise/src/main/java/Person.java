public class Person {
    private String Name;
    private int age;

    public Person(String name,int age){
        this.Name=name;
        this.age=age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  void  display(){
        System.out.println("name:"+Name+"Age:"+age);
    }
    public  void Adult(){
        if(age>=18)
            System.out.println(Name+"is an adult");
        else{
            System.out.println(Name+"is not  an adult");
        }
    }
}
