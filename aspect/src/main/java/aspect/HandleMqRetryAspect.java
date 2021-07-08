package aspect;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Description:mq发送失败统一重试切面
 * @Author Xsj 2021/7/7  21:51
 **/
@Component
@Aspect
@Slf4j
public class HandleMqRetryAspect {


    @Pointcut("@annotation(aspect.annotation.HandleMqRetry)")
    private void advice() {
    }

    @Around("advice()")
    public void before(ProceedingJoinPoint proceedingJoinPoint){
        try {



        }catch (Exception e){

        }
    }


}
