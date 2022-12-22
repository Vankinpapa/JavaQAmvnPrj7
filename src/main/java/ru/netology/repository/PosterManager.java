package ru.netology.repository;

import ru.netology.data.FilmData;

public class PosterManager {

    private FilmData[] films = new FilmData[0];
    private int limit;

    public PosterManager() {
        this.limit = 10;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(FilmData film) {
        FilmData[] tmp = new FilmData[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public FilmData[] findAll() {
        if (films.length > limit) {
            FilmData[] tmp = new FilmData[limit];
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = films[i];
            }
            return tmp;
        } else {
            return films;
        }
    }


    public FilmData[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        FilmData[] tmp = new FilmData[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }

}
