package main.decorators;

import main.Decorator;

/**
 * Used to guard some resource that can only be used once
 *
 * Created by Yuchen Wang on 8/12/15.
 */
public class Semaphore extends Decorator {
    public static final String TAG = "Semaphore";

    @Override
    public boolean run() {
        return false;
    }

    @Override
    public String toString() {
        return TAG;
    }
}
