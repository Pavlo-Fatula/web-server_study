import interfaceTest.Giraffe;

/**
 * Created with IntelliJ IDEA.
 * User: pavlo.fatula
 * Date: 07.11.13
 * Time: 16:33
 * To change this template use File | Settings | File Templates.
 */
public class main  {
    public static void main(String[] args) {
        Integer i = 6;

        Giraffe gi = new Giraffe(new Giraffe());

        gi.print();

        String str = new String(new String());

        System.out.println(str.hashCode());

        String st = "asdfasdfdddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";

//        System.out.println(st.hashCode());
    }

}
