package design.behavioral.iterator;

import design.behavioral.iterator.Channel.ChannelType;
import design.behavioral.iterator.ChannelList.ChannelIterator;

public class Driver {
    public static void main(String[] args) {
        ChannelList channelList = new ChannelList(4);
        channelList.addChannel(new Channel(ChannelType.HINDI, "hindi 1"));
        channelList.addChannel(new Channel(ChannelType.HINDI, "hindi 2"));
        channelList.addChannel(new Channel(ChannelType.ENGLISH, "english 1"));
        channelList.addChannel(new Channel(ChannelType.ENGLISH, "english 2"));

        ChannelIterator hindiIterator = channelList.getIterator(ChannelType.HINDI);
        while (hindiIterator.hasNext()) {
            System.out.println(hindiIterator.next());
        }
        ChannelIterator englishIterator = channelList.getIterator(ChannelType.ENGLISH);
        while (englishIterator.hasNext()) {
            System.out.println(englishIterator.next());
        }
    }
}
