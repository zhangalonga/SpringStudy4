package zal;

import java.io.PrintStream;

/**
 * created on 2019/2/15 14:16
 *
 * @author zhangalong
 */
public class D implements B {
    private PrintStream printStream;

    public D(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void say() {
        printStream.println("DDDDNWODQ");
    }
}
