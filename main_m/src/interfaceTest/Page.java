package interfaceTest;

/**
 * Created with IntelliJ IDEA.
 * User: pavlo.fatula
 * Date: 08.11.13
 * Time: 12:32
 * To change this template use File | Settings | File Templates.
 */
public class Page {

//    public IPage member;
    public Member member1;
    private IPage lab;

    public Page(){
//        member  = new Member();
        member1 = new Member();
        lab = new Lab();
    }

    public void ttt(){
//        member.printValue("sdf");
    }
}
