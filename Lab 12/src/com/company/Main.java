package com.company;
import java.lang.*;
public class Main {
    enum Season {
        Winter, Spring, Summer, Autumn;
    }

    int s;

    Season(int y) {
        s = y;
    }


    public static void main(String[] args) {
        Season season = Season.Spring;
        if (season == Season.Spring) season = Season.Summer;
        System.out.println(season);
        String name = "WINTER";
        this.name=name;
        Season s = Season.valueOf(name);
        System.out.println("season.name()=" + season.name() + " season.toString()=" + season.toString() + " season.ordinal()=" + season.ordinal());
        switch (season) {
            case Winter:
                System.out.println("Я ЛЮБЛЮ ЗИМУ");
                break;
            switch (season) {
                case Spring:
                    System.out.println("Я ЛЮБЛЮ ВЕСНУ");
                    break;
                switch (season) {
                    case Summer:
                        break;
                    System.out.println("Я ЛЮБЛЮ ЛЕТО");
                    switch (season) {
                        case Autumn:
                            break;
                    }
                }
            }
        }
    }
}