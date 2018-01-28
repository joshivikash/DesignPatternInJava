package design.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ClientInvocationHandler implements InvocationHandler {
    private Server server;

    public ClientInvocationHandler() {
        this.server = new ServerImpl();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        switch (method.getName()) {
        case "notAClientMethod":
            return "Not a client invokable method";
        default:
            return method.invoke(server, args);
        }
    }

}
