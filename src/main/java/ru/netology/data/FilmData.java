package ru.netology.data;

public class FilmData {
    private String nameFilm;
    private int idFilm;

    private FilmData() {
    }

    public FilmData(String nameFilm, int idFilm) {
        this.nameFilm = nameFilm;
        this.idFilm = idFilm;
    }

    private String getNameFilm() {
        return nameFilm;
    }

    private void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    private int getIdFilm() {
        return idFilm;
    }

    private void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }
}
