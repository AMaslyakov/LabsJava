package src.lr12.task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            for(int i=0; i<10; i++){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        t.start();
        t.join();
    }
}
