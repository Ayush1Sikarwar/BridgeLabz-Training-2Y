import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
    private final List<T> items = new ArrayList<>();
    public void add(T it) { items.add(it); }
    public List<T> all() { return items; }

    public static void showAll(List<? extends WarehouseItem> list) {
        for (WarehouseItem w : list) System.out.println(w.getName());
    }
}
