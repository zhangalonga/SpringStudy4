
import org.junit.Test;
import zal.B;
import zal.C;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * created on 2019/2/15 14:12
 *
 * @author zhangalong
 */
public class CtEST {

    @Test
    public void ll(){
        B b = mock(B.class);
        final C c = new C(b);
        c.get();
        verify(b,times(1)).say();

    }
}
