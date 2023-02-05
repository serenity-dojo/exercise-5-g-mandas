package com.serenitydojo;

public class Hamster extends Pet{
    private final String favoriteGame;

    public Hamster(String name, int age, String favoriteGame) {
        super(name, age);
        this.favoriteGame = favoriteGame;
    }

    public String play() {
        return "runs in wheel";
    }

}
