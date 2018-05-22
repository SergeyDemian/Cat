
import javax.ejb.Stateless;

@Stateless
public class CHelloWorld implements IHelloWorldL, IHelloWorldR{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String outString() {
		return "Demo!";
	}
}
