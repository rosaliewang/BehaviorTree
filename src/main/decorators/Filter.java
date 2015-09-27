package main.decorators;

import main.Decorator;
import main.Task;

/**
 * Executes the child only if some condition is met
 *
 * Created by Yuchen Wang on 8/12/15.
 */
public class Filter extends Decorator {
    public static final String TAG = "Filter";

    protected Task condition;

    private Filter() {}

    public Filter(Task child, Task condition) {
        super(child);
        this.condition = condition;
    }

    @Override
    public boolean run() {
        if (condition.run())
            return child.run();
        return false;
    }

    @Override
    public String toString() {
        return TAG;
    }
}
