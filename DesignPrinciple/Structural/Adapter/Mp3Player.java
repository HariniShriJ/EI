public class Mp3Player implements MediaPlayer {
    public void play(String audioType, String fileName) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else {
            System.out.println("Mp3Player can't play: " + audioType);
        }
    }
}
