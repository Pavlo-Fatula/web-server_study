package interfaceTest;

/**
 * Created with IntelliJ IDEA.
 * User: pavlo.fatula
 * Date: 12.11.13
 * Time: 17:28
 * To change this template use File | Settings | File Templates.
 */


public final class SingleTone {

    private SingleTone(){}

    private static SingleTone instance; // = new SingleTone();

    public static synchronized SingleTone getInstance(){
        if(instance == null) return instance = new SingleTone();
        return instance;
    }

    public void print(String s){
        System.out.println("hello from SinglTome: " + s);
    }
}
