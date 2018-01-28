package design.structural.proxy;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        Server serverProxy = (Server) Proxy.newProxyInstance(Server.class.getClassLoader(), new Class[] {Server.class},
                new ClientInvocationHandler());
        System.out.println(serverProxy.performServerFunctionsAndReturnResult());
        System.out.println(serverProxy.notAClientMethod());
    }

}
