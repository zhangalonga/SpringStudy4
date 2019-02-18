package bean;

import org.springframework.stereotype.Component;


/**
 * created on 2019/2/18 18:54
 *
 * @author zhangalong
 * 如果想给他独特的名字，可以使用@Component("lony")
 * 也可以使用@Named
 *
 */
@Component
public class Sp implements bean.Cd {
    private String title = "zhangalong";
    private String room = "ri";

    @Override
    public void play() {
        System.out.println(title+room);
    }
}
