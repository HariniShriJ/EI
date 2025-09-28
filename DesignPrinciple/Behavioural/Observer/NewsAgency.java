import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();
    public void subscribe(Subscriber s) { subscribers.add(s); }
    public void unsubscribe(Subscriber s) { subscribers.remove(s); }
    public void publish(News news) {
        System.out.println("[Agency] Publishing: " + news.getHeadline());
        for (Subscriber s : new ArrayList<>(subscribers)) {
            s.update(news);
        }
    }
}
