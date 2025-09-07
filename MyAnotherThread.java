public class MyAnotherThread extends Thread {
    public void run(){
        for(int i=10;i>=0;i--){
            System.out.println("another thread "+i);
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){

            }
            
        }
    }
    public static void main(String[] args) {
        Thread t1=new Thread();
        t1.start();;
    }
}
