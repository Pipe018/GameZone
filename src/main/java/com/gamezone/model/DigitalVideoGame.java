package com.gamezone.model;

import com.gamezone.interfaces.Downloadable;
import com.gamezone.interfaces.Playable;

public class DigitalVideoGame extends VideoGame implements Downloadable, Playable {

    private double sizeGB;

    public DigitalVideoGame(String title, String platform, double price, int stock, double sizeGB) {
        super(title, platform, price, stock);
        this.sizeGB = sizeGB;
    }

    @Override
    public double calculateFinalPrice() {
        if (sizeGB > 50) {
            return price + 5000;
        }
        return price;
    }

    @Override
    public void download() {
        System.out.println("Descargando videojuego...");
    }

    @Override
    public void play() {
        System.out.println("Iniciando videojuego...");
    }

    public double getSizeGB() {
        return sizeGB;
    }

    public void setSizeGB(double sizeGB) {
        this.sizeGB = sizeGB;
    }

    @Override
    public String toString() {
        return "DigitalVideoGame{" +
                "title='" + title + '\'' +
                ", platform='" + platform + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", sizeGB=" + sizeGB +
                '}';
    }
}