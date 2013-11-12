package interfaceTest;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: pavlo.fatula
 * Date: 08.11.13
 * Time: 12:25
 * To change this template use File | Settings | File Templates.
 */
public class Run  {
    Page page = new Page();


    public Run(){
    }

    @Test
    public void Exec(){
//        page.member1.printValue("as");
//        page.member1.foo();
        SingleTone s = SingleTone.getInstance();
//        s.print("sdfaf");


        Integer i = 6;
        String st = i.toString();

    }

    public static void main(String[] args) {
        Integer i = 6;
        String st = "asdfasdfdddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";
        System.out.println(st.hashCode());
    }

}
