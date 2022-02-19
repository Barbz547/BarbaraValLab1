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
public class Filter extends InteriorBody implements SelfCheckCapable{
	
	private void maxPower() {
		//suction power raised for carpeted areas
	}
	private void lowPower() {
		//suction power lowered for tile and hard-wood 
	}
	private void suctionDebris() {
		//debris is pulled through the filter an stored there
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Filter";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	
}
