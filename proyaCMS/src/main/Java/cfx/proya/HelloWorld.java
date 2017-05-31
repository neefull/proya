package cfx.proya;

/**
 * Created by wzf on 2017/5/31.
 */
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
    @WebMethod
    @WebResult String sayHi(@WebParam String text);
}