package com.example.projectaudit.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.example.projectaudit.data.ProjectAuditAction;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ProjectAudit {
    ProjectAuditAction action() default ProjectAuditAction.ACCESS;
}
