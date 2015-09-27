package main;

/**
 * {@code Decorator}
 * In the context of BTs, a decorator is like a composite but with a
 * single child
 *
 * Created by Yuchen Wang on 8/12/15.
 */
public abstract class Decorator extends Task {
    protected Task child;

    public Decorator() {}

    public Decorator(Task task) {
        child = task;
    }

    public void addTask(Task task) {
        child = task;
    }

    public Task getChild() {
        return child;
    }

    public int getChildCount() {
        return child == null ? 0 : 1;
    }
}
