package com.codecool.singleton;

public class SingletonRunner {
    public static void run() {
        //SingletonNonThreadSafe singletonNonThreadSafe = SingletonNonThreadSafe.getInstance("FOO");
        //SingletonNonThreadSafe anotherSingleton = SingletonNonThreadSafe.getInstance("BAR");

        // If you see the same value, then singleton was reused
        //System.out.println(singletonNonThreadSafe.value);
        //System.out.println(anotherSingleton.value);

        // Thread test - zależnie od uruchomienia i race conditioningu, zostanie utworzona 1 lub 2 instancje
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonNonThreadSafe singleton = SingletonNonThreadSafe.getInstance("Non TS: FOO");
            SingletonThreadSafe singletonThreadSafe = SingletonThreadSafe.getInstance("TS: FOO");
            System.out.println(singleton.value);
            System.out.println(singletonThreadSafe.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonNonThreadSafe singleton = SingletonNonThreadSafe.getInstance("Non TS: BAR");
            SingletonThreadSafe singletonThreadSafe = SingletonThreadSafe.getInstance("TS: BAR");
            System.out.println(singleton.value);
            System.out.println(singletonThreadSafe.value);
        }
    }
}
