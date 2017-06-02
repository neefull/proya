package cxf.proya;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by wzf on 2017/6/2.
 */

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IComplexUserService {


     void setUser(User user);
}
