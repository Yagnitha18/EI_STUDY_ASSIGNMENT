public class VirtualClassroomManager {
    public static void main(String[] args) {
        ClassroomManager classroomManager = new ClassroomManager();
        CommandProcessor commandProcessor = new CommandProcessor(classroomManager);
        commandProcessor.processCommands();
    }
}
