package com.attunity.my_spring;

/**
 * @author Evgeny Borisov
 */
public class BenchmarkCleaner implements Cleaner {

    @InjectByType
    private CleanerImpl cleaner;

    @Override
    public void clean(){
        long start = System.nanoTime();
        cleaner.clean();
        long end = System.nanoTime();
        System.out.println(end-start);
    }
}
