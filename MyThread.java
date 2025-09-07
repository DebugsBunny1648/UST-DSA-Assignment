//creating our thread using Runnable
import java.util.*;
class MyThread implements Runnable{
    public void run(){

        //task for thread
        for(int i=0;i<=10;i++){
            System.out.println("value of i is : "+i);
            try{   
            Thread.sleep(1000);}
            catch(Exception e){
                
            }

        }
    }
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        Thread thr=new Thread(t1);
        thr.start();
    }
}