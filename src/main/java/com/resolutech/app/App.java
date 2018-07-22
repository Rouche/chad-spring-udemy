package com.resolutech.app;

import com.resolutech.app.beans.Stranger;
import com.resolutech.app.beans.annotated.Father;
import com.resolutech.app.beans.annotated.Son;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class App extends SpringBootServletInitializer implements ApplicationContextAware {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext.getBean("husband", Stranger.class).introduce());
        System.out.println(applicationContext.getBean("date", Stranger.class).introduce());
        System.out.println(applicationContext.getBean("son", Stranger.class).introduce());
        System.out.println(applicationContext.getBean("kid", Stranger.class).introduce());
        System.out.println(applicationContext.getBean("wife", Stranger.class).introduce());

        System.out.println(applicationContext.getBean("son", Son.class).getSkill().execute());
        System.out.println(applicationContext.getBean("father", Father.class).getSkill().execute());
        System.out.println(applicationContext.getBean("father", Father.class).getDrinker().execute());
    }
}
