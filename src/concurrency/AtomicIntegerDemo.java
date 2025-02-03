package concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/*
  1. get()
  2. set(newValue)
  3. getAndSet(newValue)
  4. CompareAndSet(expectedValue, newValue)

  Numeric classes only
1.) incrementAndGet() --> pre-increment (++x)
2.) getAndIncrement() --> post-increment (x++)
3.) decrementAndGet() --> pre-decrement (--x)
4.) getAndDecrement() --> post-increment (x--)
 */
public class AtomicIntegerDemo {
    private static AtomicInteger atomiCount = new AtomicInteger(0);
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        for(int i=0;i<=10;i++){
            es.submit(()->System.out.println(atomiCount.incrementAndGet() + ""));
        }
        es.shutdown();
    }
}
