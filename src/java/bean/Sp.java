package bean;

import org.springframework.stereotype.Component;

/**
 * created on 2019/2/18 18:54
 *
 * @author zhangalong
 */
@Component
public class Sp implements Cd {
    private String title = "zhangalong";
    private String room = "ri";

    @Override
    public void play() {
        System.out.println(title+room);
    }
}
