package am.training.service;

import am.training.beans.Horse;

import java.util.ArrayList;
import java.util.List;

public class HorseServiceImp implements HorseService{
   List<Horse> horses;


    public HorseServiceImp(List<Horse> horses) {
        this.horses = horses;
    }


    @Override
    public List<Horse> getHorses() {
        return horses;
    }
}
