package JavaBridgeAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class BikeRacingAssignment {

    public static void main(String[] args) throws InterruptedException {
 
        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch finishSignal = new CountDownLatch(10);

        List<Biker> raceResults = Collections.synchronizedList(new ArrayList<>());

        Biker biker1 = new Biker(1000, startSignal, finishSignal, "Biker 1", raceResults);
        Biker biker2 = new Biker(2000, startSignal, finishSignal, "Biker 2", raceResults);
        Biker biker3 = new Biker(3000, startSignal, finishSignal, "Biker 3", raceResults);
        Biker biker4 = new Biker(4000, startSignal, finishSignal, "Biker 4", raceResults);
        Biker biker5 = new Biker(5000, startSignal, finishSignal, "Biker 5", raceResults);
        Biker biker6 = new Biker(6000, startSignal, finishSignal, "Biker 6", raceResults);
        Biker biker7 = new Biker(7000, startSignal, finishSignal, "Biker 7", raceResults);
        Biker biker8 = new Biker(8000, startSignal, finishSignal, "Biker 8", raceResults);
        Biker biker9 = new Biker(9000, startSignal, finishSignal, "Biker 9", raceResults);
        Biker biker10 = new Biker(10000, startSignal, finishSignal, "Biker 10", raceResults);

        biker1.start();
        biker2.start();
        biker3.start();
        biker4.start();
        biker5.start();
        biker6.start();
        biker7.start();
        biker8.start();
        biker9.start();
        biker10.start();

        System.out.print("Referee: ");
        Thread.sleep(1000);
        System.out.print("Ready... ");
        Thread.sleep(1000);
        System.out.print("Set... ");
        Thread.sleep(1000);
        System.out.print("Go!");
        System.out.println();
        startSignal.countDown();

        finishSignal.await();

        raceResults.sort(Comparator.comparingLong(Biker::getRaceTime));

        Thread.sleep(1000);
        System.out.println("\n--- Race Results ---");
        Thread.sleep(1000);
        int rank = 1;
        for (Biker biker : raceResults) {
            System.out.println(rank + ". " + biker.getName() + " - Time: " + biker.getRaceTime() + " ms");
            Thread.sleep(100);
            rank++;
        }
//      System.out.println(Thread.currentThread().getName() + " has finished the race.");
    }
}

class Biker extends Thread {
	int delay;
    CountDownLatch startSignal;
    CountDownLatch finishSignal;
    List<Biker> raceResults;
    long startTime;
    long endTime;

    public Biker(int delay, CountDownLatch startSignal, CountDownLatch finishSignal, String name, List<Biker> raceResults) {
        super(name);
        this.startSignal = startSignal;
        this.finishSignal = finishSignal;
        this.raceResults = raceResults;
    }

    public long getRaceTime() {
        return endTime - startTime;
    }

    @Override
    public void run() {
        try {
 
            startSignal.await();

            startTime = System.currentTimeMillis();

            Thread.sleep(new Random().nextInt(5000) + 1000);

            endTime = System.currentTimeMillis();

            synchronized (raceResults) {
                raceResults.add(this);
            }

            finishSignal.countDown();

            System.out.println(Thread.currentThread().getName() + " finished the race");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}