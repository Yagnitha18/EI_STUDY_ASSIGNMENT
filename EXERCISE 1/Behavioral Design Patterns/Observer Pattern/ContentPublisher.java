import java.util.ArrayList;
import java.util.List;

public class ContentPublisher implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String content;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(content);
        }
    }

    public void uploadContent(String content) {
        this.content = content;
        notifyObservers();
    }
}
