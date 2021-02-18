public class Deadline extends Task {

    protected String by;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    @Override
    public String toString() {
        return super.toString() + "(by: " + by + ")";
    }
    @Override
    public String getStatusIcon() {
        return "[D]"+ super.getStatusIcon();
    }

    public String getBy() {
        return by;
    }
}
