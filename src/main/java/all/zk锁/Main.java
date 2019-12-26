package all.zk锁;

import org.eclipse.jdt.internal.compiler.classfmt.MethodInfoWithAnnotations;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new yewuThread(), "线程一");
        Thread thread2 = new Thread(new yewuThread(), "线程二");
        thread1.start();
        thread2.start();

    }
   static  Lock lock =new ReentrantLock();
    static class yewuThread implements Runnable {
        @Override
        public void run() {
            new Order().createOrder();
            lock.lock();
            Boolean result = new kucun().reducekucun();
            lock.unlock();
            if (result) {
               System.out.println(Thread.currentThread().getName()+"减库存成功");
                new zhifu().zhifu();
            }else{

                System.out.println(Thread.currentThread().getName()+"减库存失败");

            }

        }
    }
}