package ru.netology.javamvnMakito.services;

public class Affiche {
    private String[] movies = new String[0];
    private int limit;

    public Affiche() {
        limit = 10;
    }

    public Affiche(int limit) {
        this.limit = limit;
    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;

    }

    public String[] findLast() {
        int length;
        if (movies.length < limit) {
            length = movies.length;
        } else {
            length = limit;
        }
        String[] tmp = new String[length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;

    }
}