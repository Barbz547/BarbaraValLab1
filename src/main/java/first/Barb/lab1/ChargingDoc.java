/**
 * 
 */
package first.Barb.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * @author barbz
 *
 */
public class ChargingDoc implements GenericComponent{
	private int power;
	
	public void leaveChargeport() {
		//once fully charged the vacuum can leave the port and resume vacuuming
	}
	public void enterChargeport() {
		//can enter port when battery levels are low
	}
	public void selfCharge() {
		//starts charging automatically until full
		
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Charging Doc:Bedroom 1";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public List<SelfCheckCapable> getSubComponents() {
		// TODO Auto-generated method stub
		List internalComponents = new ArrayList(); // create an empty list
		Object component1;
		Collections.addAll(internalComponents, power); // add all your sub components
		return internalComponents;
	}
}
