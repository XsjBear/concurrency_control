package aspect.annotation;

import org.springframework.core.annotation.Order;

import java.lang.annotation.*;

/**
 * @Description:mq发送失败重试切面
 * @Author Xsj 2021/7/7  21:47
 **/
@Documented
@Target({ ElementType.METHOD})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Order(value = 1)
public @interface HandleMqRetry {
}
