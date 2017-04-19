package com.example.android.inclassassignment11_rachell;

/**
 * Created by Rachel Lockerman on 4/19/2017.
 */

public class jokes {
    String profession;
    int number;
    String punchline;

    public jokes() {

    }

    public jokes(String profession, int number, String punchline) {
        this.profession = profession;
        this.number = number;
        this.punchline = punchline;

    }


    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }

    public String toString() {
        return "Why did the  " + number + " of " + profession + " walk into a bar? " + '\n' + "because " + punchline;
    }

}


