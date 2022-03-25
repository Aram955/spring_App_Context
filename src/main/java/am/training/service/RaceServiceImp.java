package am.training.service;

import am.training.beans.Race;

import java.time.LocalDate;

public class RaceServiceImp implements RaceService{
    public HorseService horseService;

    @Override
    public Race getRace() {
        Race race = new Race();
        race.setLength(10);
        race.setParticipatingHorses(horseService.getHorses());
        race.setStartDate(LocalDate.of(2022,10,11));
        return race;
    }

    public RaceServiceImp(HorseService horseService) {
        this.horseService = horseService;
    }


}
