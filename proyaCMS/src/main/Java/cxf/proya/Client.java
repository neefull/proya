package cxf.proya;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by wzf on 2017/5/31.
 */
public class Client {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(HelloWorld.class);
        factory.setAddress("http://localhost:9000/ws/HelloWorld");
        HelloWorld helloworld = (HelloWorld) factory.create();
        System.out.println(helloworld.sayHi("proya"));
        System.exit(0);
    }
}