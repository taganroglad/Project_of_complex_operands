import java.util.ArrayList;
import java.util.List;

public class basket {
    private List<stuff> stuffList;

    public basket() {
        this.stuffList = new ArrayList<>();
    }

    public void addToBasket(stuff stuff) {
        stuffList.add(stuff);
    }

    public void removeFromBasket(stuff stuff) {
        stuffList.remove(stuff);
    }

    @Override
    public String toString() {
        return "basket{stuffList=" + stuffList + '}';
    }
}
