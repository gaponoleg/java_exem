public class Pc {
    private String name;
    private int ram;
    private int hd_volumeGB;
    private Os os;
    private String color;

    public Pc(String name, int ram, int hd_volumeGB, Os os, String color) {
        this.name = name;
        this.ram = ram;
        this.hd_volumeGB = hd_volumeGB;
        this.os = os;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public int getHd_volumeGB() {
        return hd_volumeGB;
    }

    public Os getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                ", ОЗУ: " + ram +
                ", объём ЖД: " + hd_volumeGB +
                ", Операционная система: " + os +
                ", Цвет: " + color + '.';
    }
}