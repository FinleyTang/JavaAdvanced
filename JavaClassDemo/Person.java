
public class Person{

    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age; 
    }       

    /**
     * Returns the name of the person.
     *
     * @return the name of the person
     */
    public String getName(){
        return name;    
    }               

    /**
     * Retrieves the age of the person.
     *
     * @return the age of the person
     */
    public int getAge(){        
        return age;
    }               

    public void setName(String name){       
        this.name = name;
    }               

    public void setAge(int age){
        this.age = age;
    }               

    public String toString(){        
        return name + " " + age;
    }           

    public static void main(String[] args){
        Person person = new Person("Alice", 25);
        System.out.println(person);
    }
    
}