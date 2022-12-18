package ru.netology.repository;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.data.FilmData;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {

    FilmData film1 = new FilmData("Фильм1", 0);
    FilmData film2 = new FilmData("Фильм2", 1);
    FilmData film3 = new FilmData("Фильм3", 2);
    FilmData film4 = new FilmData("Фильм4", 3);
    FilmData film5 = new FilmData("Фильм5", 4);
    FilmData film6 = new FilmData("Фильм6", 5);
    FilmData film7 = new FilmData("Фильм7", 6);
    FilmData film8 = new FilmData("Фильм8", 7);
    FilmData film9 = new FilmData("Фильм9", 8);
    FilmData film10 = new FilmData("Фильм10", 9);
    FilmData film11 = new FilmData("Фильм11", 10);
    FilmData film12 = new FilmData("Фильм12", 11);

    @Test

    public void testAddFilm() {
        PosterManager poster = new PosterManager();
        poster.addFilm(film1);
        poster.addFilm(film2);
        poster.addFilm(film3);

        FilmData[] expected = {film1, film2, film3,};
        FilmData[] actual = poster.findAllFilm();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testAllFilm() {
        PosterManager poster = new PosterManager();
        poster.addFilm(film1);
        poster.addFilm(film2);
        poster.addFilm(film3);
        poster.addFilm(film4);
        poster.addFilm(film5);
        poster.addFilm(film6);
        poster.addFilm(film7);
        poster.addFilm(film8);
        poster.addFilm(film9);
        poster.addFilm(film10);
        poster.addFilm(film11);
        poster.addFilm(film12);


        FilmData[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        FilmData[] actual = poster.findAllFilm();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testLastFilm() {
        PosterManager poster = new PosterManager(5);
        poster.addFilm(film1);
        poster.addFilm(film2);
        poster.addFilm(film3);
        poster.addFilm(film4);
        poster.addFilm(film5);
        poster.addFilm(film6);
        poster.addFilm(film7);
        poster.addFilm(film8);
        poster.addFilm(film9);
        poster.addFilm(film10);
        poster.addFilm(film11);
        poster.addFilm(film12);


        FilmData[] expected = {film12, film11, film10, film9, film8};
        FilmData[] actual = poster.findLastFiveFilm();

        Assertions.assertArrayEquals(expected, actual);
    }
}