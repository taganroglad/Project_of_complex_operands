import java.util.ArrayList;
import java.util.List;

public class category {
    private String name;
    private List<stuff> stuffList;

    public category(String name) {
        this.name = name;
        this.stuffList = new ArrayList<>();
    }

    public void addstuff(stuff stuff) {
        stuffList.add(stuff);
    }

    @Override
    public String toString() {
        return "category{name='" + name + "', stuffList=" + stuffList + '}';
    }
}
