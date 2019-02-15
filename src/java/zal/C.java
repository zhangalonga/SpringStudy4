package zal;

/**
 * created on 2019/2/15 14:10
 *
 * @author zhangalong
 */
public class C implements A{

    private B b;

    public C(B b) {
        this.b = b;
    }

    public void get(){
        b.say();
    }
}
