package com.sunflower.rabbit.common.annotation;

import com.sunflower.rabbit.common.config.RabbitConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author xzhen
 * @created 20:09 27/01/2019
 * @description TODO
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(RabbitConfig.class)
public @interface EnableRabbitMq {
}
