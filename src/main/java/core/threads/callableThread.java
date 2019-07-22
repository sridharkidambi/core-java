package core.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class runnableProcess implements Callable {
    @Override
    public Object call() throws Exception {
        int n=8;
        int temp=0;
        System.out.println("current thread id is:"+ Thread.currentThread().getId());
        for(int i=0;i<Thread.currentThread().getId();i++){
            temp=temp+i;
        }
        Thread.sleep(100);
        return temp;
    }
}

public  class  callableThread{
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int n=8;



        FutureTask[] _future =new FutureTask[8];
        for(int i=0;i<n;i++){
            Callable c =new runnableProcess();
            _future[i]= new FutureTask(c);
            Thread t= new Thread(_future[i]);
            t.start();
        }
//        _future[0].wait();

        for(int i=0;i<n;i++){
//            if(_future[i].isDone())
            System.out.println("Future result for iteration"+ i + ":  "+ _future[i].get());
//            else
//                System.out.println("Future result for iteration completion not done.");
        }

    }
}
