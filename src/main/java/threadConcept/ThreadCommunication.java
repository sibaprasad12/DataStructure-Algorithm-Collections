package threadConcept;/** * * wait() * Object wait methods has three variance, * one which waits indefinitely for any other thread to call notify or notifyAll method on the object to wake up the current thread. * Other two variances puts the current thread in wait for specific amount of time before they wake up. * notify * * notify() * method wakes up only one thread waiting on the object and that thread starts execution. * So if there are multiple threads waiting for an object, this method will wake up only one of them. The choice of the thread to wake depends on the OS implementation of thread management. * notifyAll * * notifyAll() * method wakes up all the threads waiting on the object, although which one will process first depends on the OS implementation. */public class ThreadCommunication {    public static void main(String...args){        ThreadCommunication1 t1 = new ThreadCommunication1();        ThreadCommunication2 t2 = new ThreadCommunication2();        t1.setName("Yield Thread");        t2.setName("Other Thread");        t1.start();        t2.start();    }}class ThreadCommunication1 extends  Thread{    @Override    public void run() {        for (int i = 0;i<5;i++){            try {                Thread.sleep(1000);            } catch (InterruptedException e) {                e.printStackTrace();            }            System.out.println(this.getName()+" Is Running "+i);        }        yield();    }}class ThreadCommunication2 extends  Thread{    @Override    public void run() {        for (int i = 0;i<5;i++){            System.out.println(this.getName()+" Is Running "+i);        }    }}