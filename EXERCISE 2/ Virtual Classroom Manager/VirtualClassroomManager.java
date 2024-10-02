import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import java.util.Scanner;

public class VirtualClassroomManager {
    private Map<String, Classroom> classrooms;
    private static final Logger logger = Logger.getLogger(VirtualClassroomManager.class.getName());

    public VirtualClassroomManager() {
        classrooms = new HashMap<>();
    }

    public void addClassroom(String className) {
        if (classrooms.containsKey(className)) {
            logger.severe("Classroom " + className + " already exists.");
            return;
        }
        classrooms.put(className, new Classroom(className));
        logger.info("Classroom " + className + " has been created.");
    }

    public void addStudent(String studentId, String className) {
        if (!classrooms.containsKey(className)) {
            logger.severe("Classroom " + className + " does not exist.");
            return;
        }
        Student student = new Student(studentId);
        classrooms.get(className).addStudent(student);
    }

    public void scheduleAssignment(String className, String assignmentDetails) {
        if (!classrooms.containsKey(className)) {
            logger.severe("Classroom " + className + " does not exist.");
            return;
        }
        classrooms.get(className).scheduleAssignment(assignmentDetails);
    }

    public void submitAssignment(String studentId, String className, String assignmentDetails) {
        if (!classrooms.containsKey(className)) {
            logger.severe("Classroom " + className + " does not exist.");
            return;
        }
        Classroom classroom = classrooms.get(className);
        for (Assignment assignment : classroom.getAssignments()) {
            if (assignment.getDetails().equals(assignmentDetails)) {
                assignment.submit(studentId);
                return;
            }
        }
        logger.severe("Assignment " + assignmentDetails + " not found in " + className + ".");
    }

    public static void main(String[] args) {
        VirtualClassroomManager manager = new VirtualClassroomManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a command (add_classroom, add_student, schedule_assignment, submit_assignment, exit): ");
            String command = scanner.nextLine();
            if (command.equals("exit")) {
                break;
            }

            String[] parts = command.split(" ");
            String action = parts[0];

            switch (action) {
                case "add_classroom":
                    manager.addClassroom(parts[1]);
                    break;
                case "add_student":
                    if (parts.length != 3) {
                        System.out.println("Usage: add_student <student_id> <class_name>");
                        break;
                    }
                    manager.addStudent(parts[1], parts[2]);
                    break;
                case "schedule_assignment":
                    if (parts.length < 3) {
                        System.out.println("Usage: schedule_assignment <class_name> <assignment_details>");
                        break;
                    }
                    manager.scheduleAssignment(parts[1], String.join(" ", parts, 2, parts.length));
                    break;
                case "submit_assignment":
                    if (parts.length < 4) {
                        System.out.println("Usage: submit_assignment <student_id> <class_name> <assignment_details>");
                        break;
                    }
                    manager.submitAssignment(parts[1], parts[2], String.join(" ", parts, 3, parts.length));
                    break;
                default:
                    System.out.println("Unknown command.");
                    break;
            }
        }
        scanner.close();
    }
}
