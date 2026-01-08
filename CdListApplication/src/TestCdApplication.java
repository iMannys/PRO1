import model.*;
import view.CdConsoleView;

public class TestCdApplication
{
  public static void main(String[] args)
  {
    CdModel model = new CdModelManager();

    Song[] songs1 = {
        new Song("Test", "Test", new Time(1550)),
        new Song("Test2", "Test2", new Time(6233))
    };
    model.addCd(new Cd("Test", "Test", songs1));

    Song[] songs2 = {
        new Song("Yesterday", "The Beatles", new Time(1450)),
        new Song("Let It Be", "The Beatles", new Time(2430))
    };
    model.addCd(new Cd("The Beatles Collection", "The Beatles", songs2));

    Song[] songs3 = {
        new Song("Billie Jean", "Michael Jackson", new Time(2940)),
        new Song("Beat It", "Michael Jackson", new Time(2580))
    };
    model.addCd(new Cd("Thriller", "Michael Jackson", songs3));

    Song[] songs4 = {
        new Song("Shape of You", "Ed Sheeran", new Time(2330)),
        new Song("Perfect", "Ed Sheeran", new Time(2590))
    };
    model.addCd(new Cd("Divide", "Ed Sheeran", songs4));

    Song[] songs5 = {
        new Song("Rolling in the Deep", "Adele", new Time(2280)),
        new Song("Someone Like You", "Adele", new Time(2860))
    };
    model.addCd(new Cd("21", "Adele", songs5));

    CdConsoleView view = new CdConsoleView(model);
    view.start();
  }
}