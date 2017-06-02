package cxf.proya;

/**
 * Created by wzf on 2017/5/31.
 */
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String name) {
        String msg = "Hello " + name + "!";
        return msg;
    }
}