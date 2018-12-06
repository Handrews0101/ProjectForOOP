/**
 * Author: Andrews, Hannah
 * Description: The class for creating objects of the the AudioPlayer type
 */

public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecifications;
  private ItemType mediaType;

  //Constructor that will take in 2 parameters, the name and audioSpecification.
  //The constructor should call its parents constructor and also setup the media type.
  AudioPlayer(String name, String audioSpecifications) {
    super(name);
    mediaType = ItemType.AUDIO;
    this.audioSpecifications = audioSpecifications;
  }
  // Put in overrides here
  
  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopping");
  }

  @Override
  public void previous() {
    System.out.println("Previous");
  }

  @Override
  public void next() {
    System.out.println("Next");
  }

  @Override
  public String toString() {
    return super.toString() +
        "Audio Spec : " + audioSpecifications + '\n' +
        "Type: " + mediaType + '\n';
  }
}
