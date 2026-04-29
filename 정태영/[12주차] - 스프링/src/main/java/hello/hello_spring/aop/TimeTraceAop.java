package hello.hello_spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
public class TimeTraceAop {

    // 공통 관심 사항을 어디에 타켓팅할지
    @Around("execution(* hello.hello_spring..*(..)) && !target(hello.hello_spring.service.SpringConfig)")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable{

        long start = System.currentTimeMillis();

        System.out.println("START : " + joinPoint.toString());

        try{
            return joinPoint.proceed();
        }finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish - start;
            System.out.println("END :  " + joinPoint.toString() + " " + timeMs + "ms");
        }
    }
}
