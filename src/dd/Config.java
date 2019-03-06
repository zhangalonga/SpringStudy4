package dd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * created on 2019/3/4 14:18
 *
 * @author zhangalong
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class Config {

    @Bean
    public Audience audience(){
        return new Audience();
    }
}
