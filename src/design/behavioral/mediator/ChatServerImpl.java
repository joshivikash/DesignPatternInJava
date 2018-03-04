package design.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatServerImpl implements ChatServer {

    private List<User> users = new ArrayList<>();

    @Override
    public void addUsers(User user) {
        // TODO Auto-generated method stub
        users.add(user);
    }

    @Override
    public void sendMessage(User user, String msg) {
        // TODO Auto-generated method stub
        for (User user2 : users) {
            if (!user2.getName().equals(user.getName())) {
                user2.receiveMsg(user, msg);
            }
        }
    }

}
