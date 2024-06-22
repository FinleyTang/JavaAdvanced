

public class TestCareer {
    public static void main(String[] args) {
        PolicMan policMan = new PolicMan();
        policMan.work();        
        policMan.study();
        policMan.play();
        policMan.eat();
        Doctor doctor = new Doctor();
        doctor.work();
        doctor.study();
        doctor.play();
        doctor.eat();

        Career career = new PolicMan();
        career.work();
        career.study();
        career.play();
        career.eat();
    }
} 