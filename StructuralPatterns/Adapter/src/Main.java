/*
The Adapter Design Pattern is a structural pattern that allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by converting the interface of a class into another interface that a client expects

 MediaPlayer is the target interface that clients use to play different types of audio files.
AdvancedMediaPlayer is the interface that provides specific functionality for playing different types of advanced audio files.
VlcPlayer and Mp4Player are concrete classes implementing the AdvancedMediaPlayer interface.
MediaAdapter is the adapter class that implements the MediaPlayer interface by utilizing the AdvancedMediaPlayer interface.
AudioPlayer is the client class that interacts with the MediaPlayer interface.
AdapterPatternDemo is the main class where the client code is written to demonstrate the usage of the Adapter Design Pattern.

 */
public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

        System.out.println("Adapter Design Pattern Demo");
    }
}