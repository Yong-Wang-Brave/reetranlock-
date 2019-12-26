package all.zk锁;

public class kucun {
    static int num=1;
    public  Boolean reducekucun(){

        if(num>0){
            num--;
          //  System.out.println(Thread.currentThread().getName()+"减库存成功");
            return  true;
        }
        return false;
    }
}
