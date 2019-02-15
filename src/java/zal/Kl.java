package zal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * created on 2019/2/15 14:25
 *
 * @author zhangalong
 */
public class Kl {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        final C bean = context.getBean(C.class);
        bean.get();
        context.close();
    }
}
