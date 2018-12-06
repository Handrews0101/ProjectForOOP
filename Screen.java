/**
 * Author: Andrews, Hannah
 * Description: Here lies a class that describes the Screen of products 
 */

public class Screen implements ScreenSpec {

  private String resolution;
  private int refreshrate;
  private int responsetime;

  //this is a constructor
  Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }
// Some more overrides 
  @Override
  public String getResolution() {
    return this.resolution;
  }

  @Override
  public int getRefreshRate() {
    return this.refreshrate;
  }

  @Override
  public int getResponseTime() {
    return this.responsetime;
  }

  @Override
  public String toString() {
    return
        "Resolution : " + resolution + '\n' +
            "Refresh Rate : " + refreshrate + '\n' +
            "Response Time : " + responsetime + '\n';
  }
}
