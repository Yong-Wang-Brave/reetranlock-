package all.zk锁;

public class Order {
    public void  createOrder(){
        
        System.out.println(Thread.currentThread().getName()+"创建订单");
        
        
    }
}
