package core.threads;

public class threads {
    public  static  void main(String[] args){
        int n=8;
        for (int i=0;i<=n;i++){
            ml _ml=new ml();
            _ml.start();
        }
    }
}

class ml extends  Thread{

    @Override
    public void run() {
        System.out.println("current running  thread is: "+ Thread.currentThread().getId());
    }
}
