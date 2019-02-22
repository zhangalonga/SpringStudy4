package cc;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * created on 2019/2/22 14:02
 *
 * @author zhangalong
 */
public class ClankDisc implements Md{
    private Cd cd;

    @Autowired
    public void setCd(Cd cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
