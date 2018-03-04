package design.behavioral.iterator;

public class Channel {
    public enum ChannelType {
        HINDI, ENGLISH
    }

    private ChannelType channelType;
    private String      title;

    public Channel(ChannelType channelType, String title) {
        this.channelType = channelType;
        this.title = title;
    }

    public ChannelType getChannelType() {
        return channelType;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
