package Polimorfismo._06;

public abstract class Midia  {

    public abstract void reproduzir();


}
class MidiaTest{
    public static void main(String[] args) {
        Midia audio = new Audio("Música");
        Midia video = new Video("Imagens");

        audio.reproduzir();
        video.reproduzir();
    }
}