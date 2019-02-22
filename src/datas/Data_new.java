package datas;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;

/**
 * created on 2019/2/22 14:26
 *
 * @author zhangalong
 */
public class Data_new {


    /**
     * 测试环境
     * @return
     */

    @Bean(destroyMethod = "shutdown")
    public DataSource getDataSource(){
        return new EmbeddedDatabaseBuilder().
                addScript("classpath:schema.sql").addScript("classpath:test-data.sql").build();
    }

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
