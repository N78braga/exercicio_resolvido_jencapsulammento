package Polimorfismo._06;

public class Video extends Midia{
    private String tv;

    public Video(String tv) {
        this.tv = tv;
    }

    public String getTv() {
        return tv;
    }

    @Override
    public void reproduzir() {
        System.out.println("A TV ele está reproduzindo som e ".concat(this.getTv()));

    }
}
