package cxf.proya;

/**
 * Created by wzf on 2017/6/2.
 */

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
@SuppressWarnings("deprecation")
public class ComplexUserService implements IComplexUserService {

    public void setUser(User user) {
        System.out.println("############Server setUser###########");
        System.out.println("setUser:" + user);
    }
}
