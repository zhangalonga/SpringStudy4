package zal;

import java.io.PrintStream;

/**
 * created on 2019/2/15 14:41
 *
 * @author zhangalong
 */
public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void before(){
        stream.println("before......");
    }

    public void after(){
        stream.println("after........");
    }
}
