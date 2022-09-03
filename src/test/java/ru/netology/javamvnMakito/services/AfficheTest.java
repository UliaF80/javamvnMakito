package ru.netology.javamvnMakito.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AfficheTest {
    @Test
    public void test() {
        Affiche affiche = new Affiche();

        affiche.add("Movie 1");
        affiche.add("Movie 2");
        affiche.add("Movie 3");

        String[] actual = affiche.findAll();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};

        Assertions.assertArrayEquals(expected, actual);
    }
}
