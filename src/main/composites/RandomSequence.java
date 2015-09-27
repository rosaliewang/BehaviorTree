package main.composites;

import main.Task;

import java.util.Collections;
import java.util.List;

/**
 * Created by Yuchen Wang on 8/12/15.
 */
public class RandomSequence extends Sequence {
    public static final String TAG = "RandomSequence";

    public RandomSequence() {
        super();
    }

    public RandomSequence(List<Task> children) {
        super(children);
    }

    @Override
    public boolean run() {
        Collections.shuffle(children);
        for (Task task : children) {
            if (!task.run())
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
