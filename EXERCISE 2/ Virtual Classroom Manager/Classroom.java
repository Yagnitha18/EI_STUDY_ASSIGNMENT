import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Classroom {
    private String name;
    private List<Student> students;
    private List<Assignment> assignments;
    private static final Logger logger = Logger.getLogger(Classroom.class.getName());

    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        logger.info("Student " + student.getId() + " has been enrolled in " + name + ".");
    }

    public Assignment scheduleAssignment(String assignmentDetails) {
        Assignment assignment = new Assignment(assignmentDetails);
        assignments.add(assignment);
        logger.info("Assignment for " + name + " has been scheduled.");
        return assignment;
    }

    public List<Student> listStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }
}
