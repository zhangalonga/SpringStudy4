package datas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

/**
 * created on 2019/2/22 14:43
 *
 * @author zhangalong
 */
@Configuration
@Profile("dev")
//在测试环境被激活是才会创建
public class Data_new_2 {
    /**
     * 测试环境
     * @return
     */

    @Bean(destroyMethod = "shutdown")
    public DataSource getDataSource(){
        return new EmbeddedDatabaseBuilder().
                addScript("classpath:schema.sql").addScript("classpath:test-data.sql").build();
    }
}
