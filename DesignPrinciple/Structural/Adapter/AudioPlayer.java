public class AudioPlayer implements MediaPlayer {
    private Mp3Player mp3Player = new Mp3Player();
    private VlcPlayer vlcPlayer = new VlcPlayer(); // could be created via factory/DI

    public void play(String audioType, String fileName) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            mp3Player.play(audioType, fileName);
        } else if ("vlc".equalsIgnoreCase(audioType)) {
            // adapt to AdvancedMediaPlayer API
            vlcPlayer.playVlc(fileName);
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            System.out.println("Playing mp4 file. Name: " + fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
