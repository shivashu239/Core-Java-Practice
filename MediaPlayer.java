interface Playable {
    void play();
    void stop();
}
abstract class Media {
    private String title;
    Media(String title) {
        this.title = title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void getTitle() {
        System.out.println("Title = " + title);
    }
    public String getTitles() {
        return title;
    }
}
class Song extends Media implements Playable {
    Song(String title){
        super(title);
    }
    public void play() {
        System.out.println("Playing song : " + getTitles());
    }
    public void stop() {
        System.out.println("Playing song : " + getTitles());
    }
}
class Video extends Media implements Playable {
    Video(String title) {
        super(title);
    }
    public void play() {
        System.out.println("Playing Video : " + getTitles());
    }
    public void stop() {
        System.out.println("Stopped Video : " + getTitles());
    }
}
public class MediaPlayer {
    public static void main(String[] args) {
        Song song = new Song("Duch");
        Video video = new Video("Hindi video");

        song.play();
        song.stop();

        video.play();
        video.stop();
    }
}

