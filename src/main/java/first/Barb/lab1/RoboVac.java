/**
 * 
 */
package first.Barb.lab1;

import edu.fiu.jit.EmptyComponent;
import edu.fiu.jit.GenericComponent;

/**
 * @author barbz
 *
 */
public class RoboVac extends EmptyComponent implements GenericComponent  {
	
	private String brand;  
	private double price; // price varies from as low as $50 to as high as $1200
	private String model; //different models to one vacuum
	private App myApp;
	private ChargingDoc myChargingDoc;
	private ExteriorBody myExteriorBody;
	private InteriorBody myInteriorBody;
	
	public RoboVac() {
		myApp = new App();
		myChargingDoc= new ChargingDoc();
		myExteriorBody = new ExteriorBody();
		myInteriorBody = new InteriorBody();
			
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoboVac mynewinstance = new RoboVac();
		System.out.println(mynewinstance);
	}


	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Thank you for using Robovac today!";
	}

}
