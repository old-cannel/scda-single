package com.scda;

import com.baomidou.mybatisplus.autoconfigure.MybatisPlusAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @Auther: liuqi
 * @Date: 2018/11/14 14:29
 * @Description: 文件上传服务
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class, MybatisPlusAutoConfiguration.class}, scanBasePackages = "com.scda")
public class UploadBootStrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(UploadBootStrap.class).web(true).run(args);
    }

}
