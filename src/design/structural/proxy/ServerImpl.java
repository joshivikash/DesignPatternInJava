package design.structural.proxy;

class ServerImpl implements Server {

    @Override
    public String performServerFunctionsAndReturnResult() {
        return "Server Response ....Success !!!";
    }

    @Override
    public String notAClientMethod() {
        return "This method should be called by Server classes only";
    }
}
