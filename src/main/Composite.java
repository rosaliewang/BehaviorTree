package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yuchen Wang on 8/12/15.
 */
public abstract class Composite extends Task {
    protected List<Task> children;

    public Composite() {
        this(new ArrayList<Task>());
    }

    public Composite(List<Task> children) {
        this.children = children;
    }

    public void addTask(Task task) {
        children.add(task);
    }

    public void removeTask(Task task) {
        if (children != null && !children.isEmpty()) {
            children.remove(task);
        }
    }

    public List<Task> getChildren() {
        return children;
    }

    public int getChildrenCount() {
        return children.size();
    }
}
