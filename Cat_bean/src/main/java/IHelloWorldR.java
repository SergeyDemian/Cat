
import java.io.Serializable;

import javax.ejb.Remote;

@Remote
public interface IHelloWorldR extends Serializable {

	public String outString();
}
