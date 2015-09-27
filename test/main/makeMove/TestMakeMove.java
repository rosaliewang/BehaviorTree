package main.makeMove;

import main.Blackboard;
import main.Task;

/**
 * Created by Yuchen Wang on 8/12/15.
 */
public class TestMakeMove {
    public static void main(String[] args) {
        Blackboard<String, Integer> store = new Blackboard<>();
        EnemyBT1 bt1 = EnemyBT1.getInstance();
        Task head = bt1.getRoot();

        head.run();
    }
}
