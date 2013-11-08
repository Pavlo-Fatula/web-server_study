package interfaceTest;

/**
 * Created with IntelliJ IDEA.
 * User: pavlo.fatula
 * Date: 08.11.13
 * Time: 12:28
 * To change this template use File | Settings | File Templates.
 */
public class Lab implements IPage {
    @Override
    public void printValue(String s) {
        System.out.println("USER_2: " + s);
    }
}
