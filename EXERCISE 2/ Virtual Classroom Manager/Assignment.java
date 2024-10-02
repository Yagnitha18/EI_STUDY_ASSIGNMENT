import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Assignment {
    private String details;
    private Map<String, String> submissions;
    private static final Logger logger = Logger.getLogger(Assignment.class.getName());

    public Assignment(String details) {
        this.details = details;
        this.submissions = new HashMap<>();
    }

    public void submit(String studentId) {
        if (submissions.containsKey(studentId)) {
            logger.warning("Student " + studentId + " has already submitted this assignment.");
        } else {
            submissions.put(studentId, "Submitted");
            logger.info("Assignment submitted by Student " + studentId + ".");
        }
    }

    public String getDetails() {
        return details;
    }
}
