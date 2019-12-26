package all.zerenlian;

public abstract class ProcessingObject<T>{


    protected ProcessingObject<T> successor;


    public void setSuccessor(ProcessingObject<T> successor){


        this.successor =successor;}


    public T handler(T input){


        T r =handleWork(input);

//执行实体类的方法
        if(successor !=null){
            return successor.handler(r);
        }

               return r;}


    abstract protected T handleWork(T input);



}

