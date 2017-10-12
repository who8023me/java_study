//:Property.java
import java.util.*;
/** The first Thinking in java example program.
*Lists system information on current machine.
*@author simon.jia
*@author http://www.simon.jia.com
*@version 1.0
*/
public class Property {
	/**Sole entry point to class & application
	*@param args array of string arguments
	*@return No return value
	*@exception exceptions No exception thrown
	*/
	public static void main (String[] args) {
	System.out.println(new Date());
	Properties p = System.getProperties();
	p.list(System.out);
	System.out.println("---Memeory Usage:");
	Runtime rt = Runtime.getRuntime();
	System.out.println("Total Memory = "
			   +rt.totalMemory()
			   +"Free Memory = "
			   +rt.freeMemory());
  }
}///:

