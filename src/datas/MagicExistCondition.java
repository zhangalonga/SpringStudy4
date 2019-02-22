package datas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * created on 2019/2/22 15:04
 *
 * @author zhangalong
 */
public class MagicExistCondition implements Condition {

    @Bean
    @Conditional(MagicExistCondition.class)
    public MagicBean get(){
        return new MagicBean();
    }

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        final Environment environment = context.getEnvironment();
        return environment.containsProperty("magic");
    }
    /**
     * 通过给定的ConditionContext对象进而得到Environment对象，并使用这个对象检查环境中是否存在"magic"属性，
     * 满足返回true，带 @Conditional(MagicExistCondition.class)都会被创建
     */
}
