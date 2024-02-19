package com.example.projectaudit.core;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.example.projectaudit.annotation.ProjectAudit;

@Component
@Aspect
public class ProjectAuditAspect {

    static {
        System.out.println("I am in Aspect class");
    }


    @Pointcut("@annotation(com.example.projectaudit.annotation.ProjectAudit)")
    public void projectAuditAnnotatedMethodExecution() {
    }

    @Before("projectAuditAnnotatedMethodExecution()")
    public void auditProjectAuditBean(JoinPoint point) {
        System.out.println("Entering audit");
        MethodSignature signature = (MethodSignature) point.getSignature();

        Method method = null;
        try {
            method = point.getTarget()
                .getClass()
                .getMethod(signature.getMethod().getName(), signature.getMethod().getParameterTypes());
        } catch (Exception e) {

        }

        System.out.println(method);

    }
    
}
