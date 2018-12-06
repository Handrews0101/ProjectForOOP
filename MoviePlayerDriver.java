/**
 * Author: Andrews, Hannah
 * Description: Here lies a driver that test the functions of MoviePlayer
 */

public class MoviePlayerDriver {

// Includes things such as screen size and res, and the monitor type
  public static void testMoviePlayer() {
    MoviePlayer moviePlayer = new MoviePlayer("MoviePlayer",
        new Screen("1080", 144, 1),
        MonitorType.LCD);

    System.out.println(moviePlayer);
  }

}
