/**
 * Author: Andrews, Hannah
 * Description: Here lies the Enumeration of ItemTypes
 */

public enum ItemType {

  // ItemType AUDIO = new ItemType("AU")
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");

  public String code;

  ItemType(String code) {
    this.code = code;
  }
}
