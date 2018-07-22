package com.resolutech.app;

import com.resolutech.app.beans.Skill;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.dep")
public class Config {

    @Bean
    public Skill randomSkill() {
        return () -> "Random skill in config";
    }

}
