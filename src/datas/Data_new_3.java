package datas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;

/**
 * created on 2019/2/22 14:44
 *
 * @author zhangalong
 */
@Configuration
@Profile("prod")
//正式环境被激活才会创建
public class Data_new_3 {
    /**
     * 正式环境
     * @return
     */
    @Bean
    public DataSource getNewDataSource(){
        final JndiObjectFactoryBean bean = new JndiObjectFactoryBean();
        bean.setJndiName("JDBC/MYDS");
        bean.setResourceRef(true);
        bean.setProxyInterface(javax.sql.DataSource.class);
        return (DataSource) bean.getObject();
    }
}
