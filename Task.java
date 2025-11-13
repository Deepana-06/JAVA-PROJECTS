
public class Task {
    private String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public void markCompleted() {
        completed = true;
    }

    public void display() {
        System.out.println("- " + description + " [" + (completed ? "Done" : "Pending") + "]");
    }
}
