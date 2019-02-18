import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * created on 2019/2/18 18:56
 *
 * @author zhangalong
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = bean.SpConfig.class)
public class CdTest {
    @Autowired
    private bean.Cd cd ;

    @Test
    public void cdIsNull(){
        assertNotNull(cd);
    }
}
