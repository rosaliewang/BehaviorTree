package main;

/**
 * main.Task:
 *  Actions    - extends main.Task
 *  Conditions - extends main.Task
 *  composites - use
 *      main.main.composites.Selector,
 *      main.main.composites.Sequence or
 *      main.main.composites.Parallel
 *
 * Created by Yuchen Wang on 8/12/15.
 */
public abstract class Task {
    public abstract boolean run();
}
