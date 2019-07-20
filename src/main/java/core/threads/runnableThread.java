package core.threads;

/*
Thread Class vs Runnable Interface

        1. If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple inheritance.
        But, if we implement the Runnable interface, our class can still extend other base classes.

        2. We can achieve basic functionality of a thread by extending Thread class because it provides some inbuilt methods like yield(),
        interrupt() etc. that are not available in Runnable interface.
The key difference between wait() and sleep() is that former is used for inter-thread communication while later is used to introduced to pause the current thread


1) Thread.sleep() method is used to pause the execution, relinquish the CPU and return it to thread scheduler.

2) Thread.The sleep() method is a static method and always puts the current thread to sleep.

3) Java has two variants of sleep method in Thread class one with one argument which takes milliseconds as the duration of sleep and another method with two arguments one is millisecond and other is the nanosecond.

4) Unlike wait() method in Java, sleep() method of Thread class doesn't relinquish the lock it has acquired.

5) sleep() method throws Interrupted Exception if another thread interrupts a sleeping thread in java.

6) With sleep() in Java it's not guaranteed that when sleeping thread woke up it will definitely get CPU, instead it will go to Runnable state and fight for CPU with other thread.

7) There is a misconception about sleep method in Java that calling t.sleep() will put Thread "t" into sleeping state, that's not true because Thread.sleep method is a static method it always put the current thread into Sleeping state and not thread "t".

That’s all on Sleep method in Java. We have seen the difference between sleep and wait along with sleep and yield in Java. In Summary, just keep in mind that both sleep() and yield() operate on the current thread.


Read more: https://javarevisited.blogspot.com/2011/12/difference-between-wait-sleep-yield.html#ixzz5uBAf0irY


        Read more: https://javarevisited.blogspot.com/2011/12/difference-between-wait-sleep-yield.html#ixzz5uB9bbKE5
 */
class runThread implements Runnable {
    @Override
    public void run() {
        System.out.println("runnable current running  thread is: "+ Thread.currentThread().getId());
    }

}
public  class runnableThread {
    public  static  void main(String[] args){
        int n = 8;
        for(
                int i = 0;
                i<=n;i++)

        {
            Thread obj=new Thread(new runThread());
            obj.start();
        }
    }
}
