/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author isaac.dura
 */
import java.io.File;
import javax.sound.sampled.*;

public class MusicPlay {

    public void music(String audio) {
        try {
            
            
            AudioInputStream ais = AudioSystem.getAudioInputStream(getClass().getResource(audio));
            Clip test = AudioSystem.getClip();

            test.open(ais);
            test.start();

            while (!test.isRunning()) {
                Thread.sleep(10);
            }
            while (test.isRunning()) {
                Thread.sleep(10);
            }
            
            

            test.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
