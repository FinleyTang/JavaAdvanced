public interface Career {

    private String name;
    private int age;
    public void work();

    public void study();

    public void play();

    public void eat();


}

class PolicMan implements Career {

    @Override
    public void work() {
        System.out.println("I work as a police officer");
    }

    public void study() {
        System.out.println("I study at school");
    }

    public void play() {
        System.out.println("I play football");  
    }   

    public void eat() {
        System.out.println("I eat food");
    }
}


class Doctor implements Career {
    public void work() {
        System.out.println("I work as a doctor");
    }   

    public void study() {
        System.out.println("I study at school for five years");
    }   

    public void play() {
        System.out.println("I play football");
    }

    /**
     * A description of the entire Java function.
     *
     */
    public void eat() { 
        System.out.println("I eat food");
    }


}

  