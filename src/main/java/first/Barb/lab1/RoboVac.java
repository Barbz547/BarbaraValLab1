/**
 * 
 */
package first.Barb.lab1;

import edu.fiu.jit.EmptyComponent;

/**
 * @author barbz
 *
 */
public class RoboVac extends EmptyComponent  {
	
	private String brand;  
	private double price; // price varies from as low as $50 to as high as $1200
	private String model; //different models to one vacuum
	

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
		return null;
	}

}
