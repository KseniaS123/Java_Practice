// 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
// Реализовать в java.

package lesson6.Homework;

public class LapTop {
    int id;
    String model;
    String cpu;
    int ram;
    String videoCard;
    String color;
    String country;

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getCpu() {
        return cpu;
    }

    public Integer getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %d %s %s %s", id, model, cpu, ram, videoCard, color,  country);
    }

    public LapTop(int id, String model, String cpu, int ram, String videoCard, String color, String country) {
        this.id = id;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.videoCard = videoCard;
        this.color = color;
        this.country = country;
    }
}
