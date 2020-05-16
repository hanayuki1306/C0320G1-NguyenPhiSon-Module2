package Java_Class_and_Object.Bai_Tap.StopWatch;

import java.util.*;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }
    public long startTime(){
        startTime = new Date();
        return startTime.getTime();
    }
    public long endTime() {
        endTime = new Date();
        return endTime.getTime();
    }
    public Date start(){
        return startTime = new Date();
    }
    public Date stop() {
        return endTime = new Date();
    }
    public long getElapsedTime(){
        return start().getTime() - stop().getTime();
    }
public static void main(String[] args) {
    StopWatch obj1 = new StopWatch();
    long start = System.currentTimeMillis();
//    while(i<1000000)
    long end = System.currentTimeMillis();
    System.out.println(obj1.start());
    System.out.println(obj1.stop());
    System.out.println(obj1.getElapsedTime());
    long res = end - start;
    System.out.println(res);
}
}
