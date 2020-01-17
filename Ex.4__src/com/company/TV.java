package com.company;

public class TV {
    private int channel;
    private int volumeLevel;
    private boolean on;

    public boolean turnOnOrOfTheTV() {
        if (on == true) {
            System.out.println("Good Bye");
            on = false;
            return false;
        } else if (on == false) {
            System.out.println("The Tv is turned ON");
            on = true;
        }
        return true;
    }

    public TV() {
    }

    public TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
