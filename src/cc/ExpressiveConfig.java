package cc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * created on 2019/2/28 17:13
 *
 * @author zhangalong
 */
@Configuration
@PropertySource("C:/Users/zhangalong/IdeaProjects/SpringStudy4/src/resource/app.property")
public class ExpressiveConfig {

    @Autowired
    Environment environment;

    @Bean
    public BlankDisc disc(){
        //PropertySourcesPlaceholderConfigurer
        return new BlankDisc(environment.getProperty("title"),environment.getProperty("att"));
    }
}
