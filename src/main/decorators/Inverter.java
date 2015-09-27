package main.decorators;

import main.Decorator;
import main.Task;

/**
 * executes child and returns the opposite value
 *
 * Created by Yuchen Wang on 8/12/15.
 */
public class Inverter extends Decorator {
    public static final String TAG = "Inverter";

    private Inverter() {}

    public Inverter(Task child) {
        super(child);
    }

    @Override
    public boolean run() {
        return !child.run();
    }

    @Override
    public String toString() {
        return TAG;
    }
}
