package am.training.spring;

import am.training.service.HorseService;
import am.training.service.RaceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HorseService horseService = context.getBean("horseService", HorseService.class);
        System.out.println(horseService.getHorses());

        RaceService raceService = context.getBean("raceService", RaceService.class);
        System.out.println(raceService.getRace());
    }
}
