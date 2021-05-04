package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {

    @Override
    public String getDescription() {
        String s = String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(), Country.BELARUS , getCountOfEggsPerMonth());
        return s;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 5;
    }
}
