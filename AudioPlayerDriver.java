/**
 * Author: Andrews, Hannah
 * Description: Contains a driver to test out the AudioPlayer class
 */

class AudioPlayerDriver {

  public static void testAudioPlayer() {
    AudioPlayer audioPlayer = new AudioPlayer("iPod Mini", "MP3");

    audioPlayer.play();
    audioPlayer.stop();
    audioPlayer.next();
    audioPlayer.previous();

    System.out.print(audioPlayer);

    // lol wow they have some old time tech 
    AudioPlayer audioPlayer1 = new AudioPlayer("Walkman", "WAV");

    System.out.println(audioPlayer1);
  }
}
