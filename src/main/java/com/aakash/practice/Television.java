package com.aakash.practice;

public class Television {
    private boolean isOn;
    private int currentChannel;
    private int volume;
    private String brand;

    public Television(){}

    public Television(String brand){
        this.brand = brand;
        this.isOn = false;
        this.currentChannel = 1;
        this.volume = 0;
    }

    public Television(String brand, int currentChannel){
        this.brand = brand;
        this.isOn = false;
        this.currentChannel = currentChannel;
        this.volume = 0;
    }


    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > 0) {
            this.currentChannel = currentChannel;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 0) {
            this.volume = volume;
        }
    }

    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Television{" +
                "isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                ", volume=" + volume +
                ", brand='" + brand + '\'' +
                '}';
    }
}
