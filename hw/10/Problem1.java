import java.util.Date;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time1 (hour minute second): "); // User input for hour,min,sec,
        int hour = input.nextInt();
        int min = input.nextInt();
        int sec = input.nextInt(); 
        Time time1 = new Time(hour,min,sec); // hr,min,sec format as object
        System.out.println(time1.toString());
        System.out.println("Elapsed seconds in time1: " + time1.getSeconds());

        System.out.print("Enter seconds in Time 2: "); // User input for total elapsed time
        long elapsedSeconds = input.nextLong();
        Time time2 = new Time(elapsedSeconds);
        System.out.println(time2.toString());
        System.out.println("Elapsed seconds in time2: " + time2.getSeconds());
        System.out.println("Time1.compareTo(Time2)??: " + time1.compareTo(time2) );
        
        System.out.println("time3 is created as a clone of time1: ");
        Time time3 = (Time)time1.clone(); // Time 3 object is the same reference of time1.
        System.out.println("time1.compareTo(time3)?: "  + time1.compareTo(time3));
        input.close();

    }
}

class Time implements Comparable<Time>,Cloneable{

public long time = (new Date()).getTime(); // Current time since 1970

// private data fields for hr,sec,min to provide getter methods in 24:60:60
private int  hour;
private int min;
private int sec;

public Time() {
    //Conversion to total elapsed seconds.
    hour = (int)(time / (1000 * 60 * 60));
    min = (int)(time / (1000 * 60));
    sec = (int)(time / 1000);
}

public Time(int hour, int min, int sec){
    this.hour = hour;
    this.min = min;
    this.sec = sec;
    time = ((hour * 60 * 60 )  + (min * 60 ) + (sec));
}

public Time(long elapsedSeconds){
    time = elapsedSeconds;
    hour = (int)(time / (24 * 60));
    min = (int)(time / (60));
    sec = (int)(time %(hour + min));
}

public int getHour(){ // hour format as 24.

while (hour > 24) {
    hour = hour - 24;
}

return hour;

}

public int getMin(){ // Minute format as 60

    while (min > 60) {
        min = min - 60;
    }
    
    return min;
    
    }
public int getSecond(){ //second format as 60

while (sec > 60) {
           sec = sec - 60;
        }
        
 return sec;
        
        }

public long getSeconds() { // returns the total elapsed seconds.
    return time;
}

public String toString(){ // string format of hour and min and sec.
    return getHour() + " hour(s) and " + getMin()  + " minute(s) and " + getSecond() + " second(s).";
}


public int compareTo(Time o){
    if (time == o.time){ // if the objects elapsed time are the same: (cloned objects)
        return 0;
    }
    else if(time > o.time){ // if the instaniated object's elapsed time is greater. return positive integer.
        return (int) (time - o.time);
    }
    else{
        return ((int)( o.time - time)) * -1; // other return negative integer from the compared object elapsed time.
    }
}

@Override
public Object clone(){ // overridden abstract method from cloneable.
    try{
        return super.clone();
    }
    catch (CloneNotSupportedException ex){
        return null;
    }
}

}