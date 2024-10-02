import java.util.Scanner;

public class CommandProcessor {
    private ClassroomManager classroomManager;
    private StudentManager studentManager;
    private AssignmentManager assignmentManager;

    public CommandProcessor(ClassroomManager classroomManager) {
        this.classroomManager = classroomManager;
        this.studentManager = new StudentManager(classroomManager);
        this.assignmentManager = new AssignmentManager(classroomManager);
    }

    public void processCommands() {
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
                    classroomManager.addClassroom(parts[1]);
                    break;
                case "add_student":
                    if (parts.length != 3) {
                        System.out.println("Usage: add_student <student_id> <class_name>");
                        break;
                    }
                    studentManager.addStudent(parts[1], parts[2]);
                    break;
                case "schedule_assignment":
                    if (parts.length < 3) {
                        System.out.println("Usage: schedule_assignment <class_name> <assignment_details>");
                        break;
                    }
                    assignmentManager.scheduleAssignment(parts[1], String.join(" ", parts, 2, parts.length));
                    break;
                case "submit_assignment":
                    if (parts.length < 4) {
                        System.out.println("Usage: submit_assignment <student_id> <class_name> <assignment_details>");
                        break;
                    }
                    assignmentManager.submitAssignment(parts[1], parts[2], String.join(" ", parts, 3, parts.length));
                    break;
                default:
                    System.out.println("Unknown command.");
                    break;
            }
        }
        scanner.close();
    }
}
