import javax.swing.JFrame;
import java.awt.Rectangle;
  
public class FaceViewer
{
  public static void main(String[] args)
  {
    JFrame frame = new JFrame();
    frame.setSize(500, 500);
    frame.setTitle("An Alien Face");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
    FaceComponent component = new FaceComponent();
    frame.add(component);
 
    frame.setVisible(true);
  
  }
}
