package org.github.nba.player.api;

import java.util.HashMap;
import java.util.*;
import java.util.concurrent.*;
import java.util.Collections.*;

public class PlayerApi extends Thread {

    static private Map map = Collections.synchronizedMap(new HashMap<String, Number>());

    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        ThreadThree t3 = new ThreadThree();
        t1.start();
        t2.start();
        t3.start();
        System.out.println(map);
    }

    static class ThreadOne extends Thread {
        public void run() {
            map.put("Thread One", 1);
        }
    }

    static class ThreadTwo extends Thread {
        public void run() {
            map.put("Thread Two", 2);
        }
    }

    static class ThreadThree extends Thread {
        public void run() {
            map.put("Thread Three", 3);
        }
    }
}


