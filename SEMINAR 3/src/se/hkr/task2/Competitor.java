package se.hkr.task2;

import java.io.Serializable;

public class Competitor implements Serializable, Comparable<Competitor>{
    private String name;
    private int age;
    private String gender;
    private Time time;

    public Competitor(String name, int age, String gender, Time time) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    @Override
    public String toString() {
        return this.time.getHours() + ":" + this.time.getMinutes() + ":" + this.time.getSeconds()
                + " --> " + this.name;
    }

    @Override
    public int compareTo(Competitor o) {
        return (this.time.getHours() * 3600 + this.time.getHours() * 60 + this.time.getSeconds()) -
                (o.getTime().getHours() * 3600 + o.getTime().getMinutes() * 60 + o.getTime().getSeconds());
    }

}

