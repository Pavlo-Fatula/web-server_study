package interfaceTest;

/**
 * Created with IntelliJ IDEA.
 * User: pavlo.fatula
 * Date: 08.11.13
 * Time: 12:27
 * To change this template use File | Settings | File Templates.
 */
public class Member { //implements IPage
//    @Override
//    public void printValue(String s) {
//        System.out.println("user_1: " + s);
//    }

    int fac_time(int n, int acc) {
        if (n == 0) {
            return acc;
        } else {
            return fac_time(n - 1, acc * n);
        }
    }

    int factorial(int n) {
        return fac_time(n, 1);
    }


    int calc(int times, int value) {
        if (times == 0) {
            return value;
        } else {
            return calc(times - 1, value * 2);
        }
    }
    int ttt(int times){
        return calc(times, 2);
    }

    int cycle(int times, int value){
        for(int i=0; i < times; i++){
            value= value*2;
            System.out.println(value);
        }
        return value;
    }



    public void foo() {
        int r = ttt(15);
        System.out.println(r);
        int ti =  cycle(15, 2);
        System.out.println(ti);
        int t =  factorial(3);
        System.out.println(t);
    }


}
