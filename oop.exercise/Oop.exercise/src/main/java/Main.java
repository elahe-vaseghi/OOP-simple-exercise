public class Main {
    public static  void  main(String[]args){
        Person person=new Person("elahe ",19);

        person.display();
        person.Adult();

        person.setName("mehdi ");
        person.setAge(15);

        person.display();
        person.Adult();

    }
}
