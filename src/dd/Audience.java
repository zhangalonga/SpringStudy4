package dd;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * created on 2019/3/4 14:09
 *
 * @author zhangalong
 */
@Aspect
public class Audience {


    @Pointcut("execution(** dd.Performance.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void slienceCellPhones(){
        System.out.println("slienceing cell phones");
    }


    @Before("performance()")
    public void takeSeats(){
        System.out.println("taking seats");
    }

    @AfterReturning("performance()")
    public void applause(){
        System.out.println("clap clap clap");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("slienceing cell phones");
            System.out.println("taking seats");
            joinPoint.proceed();
            System.out.println("clap clap clap");
        }catch (Throwable e){
            System.out.println("Demanding a refund");
        }
    }



}
