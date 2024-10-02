import java.util.HashMap;
import java.util.Map;

public class ClassroomManager {
    private Map<String, Classroom> classrooms;

    public ClassroomManager() {
        classrooms = new HashMap<>();
    }

    public void addClassroom(String className) {
        if (classrooms.containsKey(className)) {
            LoggerUtil.getLogger(ClassroomManager.class).severe("Classroom " + className + " already exists.");
            return;
        }
        classrooms.put(className, new Classroom(className));
        LoggerUtil.getLogger(ClassroomManager.class).info("Classroom " + className + " has been created.");
    }

    public Classroom getClassroom(String className) {
        return classrooms.get(className);
    }
}
