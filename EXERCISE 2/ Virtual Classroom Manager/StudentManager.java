public class StudentManager {
    private ClassroomManager classroomManager;

    public StudentManager(ClassroomManager classroomManager) {
        this.classroomManager = classroomManager;
    }

    public void addStudent(String studentId, String className) {
        Classroom classroom = classroomManager.getClassroom(className);
        if (classroom == null) {
            LoggerUtil.getLogger(StudentManager.class).severe("Classroom " + className + " does not exist.");
            return;
        }
        Student student = new Student(studentId);
        classroom.addStudent(student);
    }
}
