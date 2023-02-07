
import java.io.File;
import java.io.InputStream;
import java.net.URL;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;

public class MusicLoader {

    public static InputStream sound;

    public static float value;

    Clip clip;

    public MusicLoader(){
    value = 0;
    }

    public void load(){
        sound = (getClass().getResourceAsStream("/sounds/pacman-theme.wav"));
    }


    public void play(InputStream sound){
        try {

            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));

            clip.start();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
