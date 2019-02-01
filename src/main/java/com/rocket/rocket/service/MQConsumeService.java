package com.rocket.rocket.service;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.rocket.rocket.util.constant.TopicEnum;
import org.springframework.stereotype.Service;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Service
public @interface MQConsumeService {
    /**
     * 消息主题
     */
    TopicEnum topic();

    /**
     * 消息标签,如果是该主题下所有的标签，使用“*”
     */
    String[] tags();
}
