package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Sum implements Callable<Integer>
{
    int val;
    Sum(int v)
    {
        val = v;
    }
    public Integer call()
    {
        int sum = 0;
        for(int i=1; i<=val; i++)
        {
            sum+=i;
        }
        return sum;
    }
}
class Cube implements Callable<Integer>
{
    int val;
    Cube(int v)
    {
        val = v;
    }
    public Integer call()
    {
        return val * val * val;
    }
}
public class ConcurrencyDemo4
{
    public static void main(String[] args) throws Exception
    {
        Runtime rt = Runtime.getRuntime();
        int processors = rt.availableProcessors();
        System.out.println("Total number of processors : "+processors);
        ExecutorService es = Executors.newFixedThreadPool(processors);
        Future<Integer> f1 = es.submit(new Sum(10));
        Future<Integer> f2 = es.submit(new Cube(5));
        Future<Integer> f3 = es.submit(new Sum(6));
        System.out.println("Result : "+f1.get());
        System.out.println("Result : "+f2.get());
        System.out.println("Result : "+f3.get());
    }

}
