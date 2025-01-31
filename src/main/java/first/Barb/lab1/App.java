/**
 * 
 */
package first.Barb.lab1;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author barbz
 *
 */
public class App implements SelfCheckCapable {
	private String voicecontrol; //connect to Alexa to activate product voice control
	public int power; //See power level in app
	private String location; //preset location for cleaning in the app
	private String onoffstate; // can turn on/off in App
	
	public void scheduleClean() {
	//The app can set a time for the robot to clean
	}
	
	public void startClean() {
		//The app can control when to start cleaning
	}
	
	public void turnOn() {
		//the app can turn it on
	}
	
	public void turnOff() {
		//turn vacuum off in the app
	}
	public void spotClean() {
		//Click the spot clean feature to clean only a ceterain area
	}
	public void connectAlexa() {
		//connect to Alexa and say the commands
	}
	public void stopClean() {
		//can have vacuum stay idle without turning off
	}
	public App() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.05);
	}
	
	
	

}
