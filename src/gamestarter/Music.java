/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestarter;

/**
 *
 * @author kyrylo
 */

/**
*	Music - This class loads a sound (.wav) and plays it.
*
* @Author William Fiset, Micah Stairs
* March 13, 2014
**/

import java.io.File;
import javax.sound.sampled.*;

public abstract class Music{

	/** Loads a sound clip and plays it **/
	public static void playSound(String fileName){

		String pathDir = System.getProperty("user.dir") + "/";

		try{

			File musicFile = new File(pathDir + fileName);

			AudioInputStream audio = AudioSystem.getAudioInputStream(musicFile);
			Clip musicClip = AudioSystem.getClip();
			musicClip.open(audio);
			musicClip.start();

		}
		catch(Exception e){
			System.out.println( "Might wanna check path:\n" + pathDir + fileName + "\n" );
			e.printStackTrace();
		}
		
	}
}

















