public class Main {
    public static void main(String[] args){
        Musician pianist = new Musician(new Piano());
        Musician guitarist = new Musician(new Guitar());
        Musician drummer = new Musician(new Drums());

        pianist.play();
        guitarist.play();
        drummer.play();
    }
}
