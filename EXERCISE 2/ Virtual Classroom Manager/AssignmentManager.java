public class AssignmentManager {
    private ClassroomManager classroomManager;

    public AssignmentManager(ClassroomManager classroomManager) {
        this.classroomManager = classroomManager;
    }

    public void scheduleAssignment(String className, String assignmentDetails) {
        Classroom classroom = classroomManager.getClassroom(className);
        if (classroom == null) {
            LoggerUtil.getLogger(AssignmentManager.class).severe("Classroom " + className + " does not exist.");
            return;
        }
        classroom.scheduleAssignment(assignmentDetails);
    }

    public void submitAssignment(String studentId, String className, String assignmentDetails) {
        Classroom classroom = classroomManager.getClassroom(className);
        if (classroom == null) {
            LoggerUtil.getLogger(AssignmentManager.class).severe("Classroom " + className + " does not exist.");
            return;
        }
        for (Assignment assignment : classroom.getAssignments()) {
            if (assignment.getDetails().equals(assignmentDetails)) {
                assignment.submit(studentId);
                return;
            }
        }
        LoggerUtil.getLogger(AssignmentManager.class).severe("Assignment " + assignmentDetails + " not found in " + className + ".");
    }
}
