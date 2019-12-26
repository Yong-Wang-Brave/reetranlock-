package all.lambda2;


//定义接口实现1
public class IsDd implements ValidationStrategy {
    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }
}
