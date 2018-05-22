

import java.io.Serializable;

import javax.ejb.Local;

@Local
public interface IHelloWorldL extends Serializable{

	public String outString();
}
