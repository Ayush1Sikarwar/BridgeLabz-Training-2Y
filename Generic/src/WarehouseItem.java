public abstract class WarehouseItem {
    private final String name;
    public WarehouseItem(String name) { this.name = name; }
    public String getName1() { return name; }
	protected abstract String getName();
}
