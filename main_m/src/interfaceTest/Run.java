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
        page.member1.foo();
    }

}
