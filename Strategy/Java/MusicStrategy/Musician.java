public class Musician {

    private MusicInstrumental musicInstrumental;

    public Musician(MusicInstrumental musicInstrumental){
        this.musicInstrumental = musicInstrumental;
    }

    public void play(){
        this.musicInstrumental.sound();
    }
}
