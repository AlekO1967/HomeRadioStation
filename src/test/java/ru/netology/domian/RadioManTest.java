package ru.netology.domian;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioManTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/dataForDecVl.csv")
    void decreaseVolume(boolean on, int currentVolume, int expected) {
        RadioMan radioMan = new RadioMan();
        radioMan.setOn(on);
        radioMan.setCurrentVolume(currentVolume);
        radioMan.decreaseVolume();

        assertEquals(expected, radioMan.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForIncVl.csv")
    void increaseVolume(boolean on, int currentVolume, int expected) {
        RadioMan radioMan = new RadioMan();
        radioMan.setOn(on);
        radioMan.setCurrentVolume(currentVolume);
        radioMan.increaseVolume();

        assertEquals(expected, radioMan.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForPrevRS.csv")
    void prevRadioStation(boolean on, int currentRadioStation, int expected) {
        RadioMan radioMan = new RadioMan();
        radioMan.setOn(on);
        radioMan.setCurrentRadioStation(currentRadioStation);
        radioMan.prevRadioStation();

        assertEquals(expected, radioMan.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForNextRS.csv")
    void nextRadioStation(boolean on, int currentRadioStation, int expected) {
        RadioMan radioMan = new RadioMan();
        radioMan.setOn(on);
        radioMan.setCurrentRadioStation(currentRadioStation);
        radioMan.nextRadioStation();

        assertEquals(expected, radioMan.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForInputRS.csv")
    void inputRadioStation(boolean on, int currentRadioStation, int expected) {
        RadioMan radioMan = new RadioMan();
        radioMan.setOn(on);
        radioMan.setCurrentRadioStation(currentRadioStation);

        assertEquals(expected, radioMan.getCurrentRadioStation());

    }

}
