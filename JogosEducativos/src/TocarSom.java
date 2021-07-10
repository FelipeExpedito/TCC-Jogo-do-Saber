
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class TocarSom {
    
    public void playSound(String soundName)
 {
//   try 
//   {
//    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile( ));
//    Clip clip = AudioSystem.getClip( );
//    clip.open(audioInputStream);
//    clip.start( );
//   }
//   catch(Exception ex)
//   {
//     System.out.println("Error with playing sound.");
//     ex.printStackTrace( );
     URL url = getClass().getResource(soundName);
     AudioClip audio = Applet.newAudioClip(url);
     audio.play();
     
   }
 }
//}
