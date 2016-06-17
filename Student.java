
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
     private String name;
    private int ID;
    private int credits;

    public Student(String name, int ID, int credits) {
        this.name = name;
        this.ID = ID;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int getCredits() {
        return credits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
   
    /**
     *     //mt para imprimir los datos de los students
     */
    public void print(){
        System.out.println("Nombre: " +name+ " id: " +ID+ " Creditos: " +credits);
        System.out.println("--                  --");
    }
    
}



















