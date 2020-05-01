package rnd;

import java.util.function.Function;

public class Fun {
    
    public static void main(String[] args) {
        FunFun funFun = new FunFunImpl();
        runFunFun(funFun::hello);
        runFunFun((string)-> {
            System.out.println(string+" lamda");
        });
        
        runNonFun(funFun::hello);
    }
       
    public static void runFunFun(FunFun f) {
        f.hello("hello");
        f.hello("hello again");
    }
    
    public static void runNonFun(NonFun f) {
        f.hello("hello non fun");
    }
    
    public static interface NonFun {
        public void hello(String hello);
    }
    
    @FunctionalInterface
    public static interface FunFun {
        public void hello(String hello);
    }
    
    public static class FunFunImpl implements FunFun {
        public void hello(String hello) {
            System.out.println(hello);
        }
    }    
}
