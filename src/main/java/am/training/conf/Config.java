package am.training.conf;

import am.training.beans.Horse;
import am.training.beans.Race;
import am.training.service.HorseService;
import am.training.service.RaceService;
import am.training.service.RaceServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class Config {

    @Bean
    public Horse horse1() {
        return new Horse("arabakan", 1, "Ahmed");
    }

    @Bean
    public Horse horse2() {
        return new Horse("poni", 2, "Boni");
    }

    @Bean
    public Horse horse3() {
        return new Horse("bread3", 3, "rider3");
    }

    @Bean
    public Horse horse4() {
        return new Horse("bread4", 4, "rider4");
    }

    @Bean
    public List<Horse> horses() {
        return Arrays.asList(horse1(), horse2(), horse3(), horse4());
    }

    @Bean
    public HorseService horseService() {
        return new HorseService() {
            @Override
            public List<Horse> getHorses() {
                return horses();
            }
        };
    }

    @Bean
    public RaceService raceService (){
        return new RaceServiceImp(horseService());
    }

}