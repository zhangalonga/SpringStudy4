package too;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * created on 2019/2/22 15:20
 *
 * @author zhangalong
 */
@Component
@Primary
//设置为首选的类
public class IceCream implements Dessert {
}
