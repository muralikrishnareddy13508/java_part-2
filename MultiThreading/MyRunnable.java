public class MyRunnable implements Runnable{

    private final String text;

    MyRunnable(String text){
        this.text = text;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println(text);
            }
        }
        catch (InterruptedException e){
            System.out.println("Thread Interrupted");
        }

    }
}
