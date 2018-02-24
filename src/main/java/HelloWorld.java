import lejos.hardware.BrickFinder;
import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.lcd.Font;
import lejos.hardware.lcd.GraphicsLCD;
import lejos.utility.Delay;

/**
 * Example leJOS EV3 Project with an ant build file
 *
 */
public class HelloWorld {

	public static void main(String[] args) {
		 GraphicsLCD g = BrickFinder.getDefault().getGraphicsLCD();
        final int SW = g.getWidth();
        final int SH = g.getHeight();
        Button.LEDPattern(4);
        Sound.beepSequenceUp();

        g.setFont(Font.getLargeFont());
        g.drawString("leJOS/EV3", SW/2, SH/2, GraphicsLCD.BASELINE|GraphicsLCD.HCENTER);
        Button.LEDPattern(3);
        Delay.msDelay(4000);
        Button.LEDPattern(5);
        g.clear();
        g.refresh();
        Sound.beepSequence();
        Delay.msDelay(500);
        Button.LEDPattern(0);
	}
	
}