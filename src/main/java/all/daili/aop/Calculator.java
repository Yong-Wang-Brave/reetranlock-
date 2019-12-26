package all.daili.aop;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    //业务逻辑方法
    public int div(int i, int j) {
        System.out.println("--------");
        return i / j;
    }
}