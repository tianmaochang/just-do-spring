package com.now.config;

import com.now.BraveKnight;
import com.now.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public BraveKnight braveKnight(){
        return new BraveKnight(slayDragonQuest());
    }

    @Bean
    public SlayDragonQuest slayDragonQuest(){
        return new SlayDragonQuest(System.out);
    }
}
