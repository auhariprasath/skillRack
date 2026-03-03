class NumberThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Thread 1: " + i);
        }
    }

    public static void main(String[] args) {

        NumberThread t1 = new NumberThread();
        t1.start();

        for (int i = 1; i <= 50; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}