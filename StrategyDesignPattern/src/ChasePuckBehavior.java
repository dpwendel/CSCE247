/*
 * @author Douglas Wendel
 * chase puck behavior class implements defencce behavior 
 * and is a simple class that just prints 
 * chases the puck if this class is called. 
 */
package strategydesignpattern;


public class ChasePuckBehavior implements DefenceBehavior {
	@Override
	public String play() {
		return "Chases the puck";
	}

}
