package main.composites;

import main.Composite;
import main.Task;

import java.util.List;

/**
 * Created by Yuchen Wang on 8/12/15.
 */
public class Parallel extends Composite {
    public static final String TAG = "Composite";

    public Parallel() {
        super();
    }

    public Parallel(List<Task> children) {
        super(children);
    }

    @Override
    public boolean run() {
        for (Task task : children) {
            if (task.run())
                return false;
        }
        return true;
    }

    public int getChildrenCount() {
        return super.getChildrenCount();
    }

    @Override
    public String toString() {
        return TAG;
    }
}
