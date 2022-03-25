package am.training.service;

import am.training.beans.Race;

import java.time.LocalDate;

public class RaceServiceImp implements RaceService{
    private HorseService horseService;
    @Override
    public Race getRace() {
        Race race = new Race();
        race.setParticipatingHorses(horseService.getHorses());
        race.setLength(10);
        race.setStartDate(LocalDate.of(2022,10,11));
        return race;
    }

    public HorseService getHorseService() {
        return horseService;
    }

    public void setHorseService(HorseService horseService) {
        this.horseService = horseService;
    }
}
