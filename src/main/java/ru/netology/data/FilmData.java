package ru.netology.data;

public class FilmData {
    private String nameFilm;
    private int idFilm;

    public FilmData() {
    }

    public FilmData(String nameFilm, int idFilm) {
        this.nameFilm = nameFilm;
        this.idFilm = idFilm;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }
}
