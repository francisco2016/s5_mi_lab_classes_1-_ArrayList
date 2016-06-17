import java.util.ArrayList;
public class LabClasses
{
    private ArrayList<Student> student; 
    private int capacity;
    private String nameInstructor;

    public LabClasses( int capacity, String nameInstructor) {
        student = new ArrayList<Student>();
        this.capacity = capacity;
        this.nameInstructor = nameInstructor;
    }

    //Constructor para inicializar los atributos.
    public ArrayList<Student> getStudent() {
        return student;
    }

    public int getCapacity() {
        return capacity;
    }

    //serie de mt. para asignar valores a los atributos.
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setNameInstructor(String nameInstructor) {
        this.nameInstructor = nameInstructor;
    }

    //mt para matricular a los students.
    public void matricularStudent(Student stu){
        if(student.size() > capacity){
            System.out.println("Matrícula cubierta, vuelva el próximo curso.");
        }
        else{
            student.add(stu);
        }
    }

    /**
     * mt para mostrar la lista de los alumnos matriculados.
     */
    public void listaDeStudents(){
        if(student.size() != 0){
            System.out.println("Instructor: " +nameInstructor);
            System.out.println(" LISTA DE ALUMNOS:  ");
            System.out.println("  ");
        for(Student stu : student){
            stu.print();
        }
            System.out.println("  ");
        }

    }
}
















