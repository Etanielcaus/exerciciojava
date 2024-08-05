package Package.TestingCode;

public class Dog extends Animal {
    protected String song;

    public Dog(String song, String name, String type){
        super(name, type);
        this.song = song;
    }

    public void interagir(){
        System.out.println(song);
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
