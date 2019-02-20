package java.bean;

import bean.Cd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * created on 2019/2/20 18:18
 *
 * @author zhangalong
 */
@Component
public class CdPlayer implements Md{

    private bean.Cd cd;

    //第一种自动装配，构造器上
    @Autowired
    //第四种自动装配，Java依赖注入规范
    //@Inject
    public CdPlayer(Cd cd) {
        this.cd = cd;
    }





    @Override
    public void play() {
       cd.play();
    }


    public Cd getCd() {
        return cd;
    }
    //第二种构造器，set方法上
    //@Autowired
    public void setCd(Cd cd) {
        this.cd = cd;
    }

    //第三种构造器，任意方法上
    //@Autowired
    public void insetCd(Cd cd) {
        this.cd = cd;
    }


}
