package design.behavioral.iterator;

import design.behavioral.iterator.Channel.ChannelType;

public class ChannelList {
    private Channel[] channels;
    private int       index = -1;

    public ChannelList(int numberOfChannels) {
        // TODO Auto-generated constructor stub
        channels = new Channel[numberOfChannels];
    }

    public void addChannel(Channel ch) {
        channels[++index] = ch;
    }

    public ChannelIterator getIterator(ChannelType channelType) {
        return new ChannelIterator(channelType);
    }

    class ChannelIterator implements Iterator<Channel> {
        int         iteratorIndex = -1;
        ChannelType channelType;

        public ChannelIterator(ChannelType channelType) {
            this.channelType = channelType;
        }

        @Override
        public boolean hasNext() {
            for (int i = iteratorIndex + 1; i < channels.length; i++) {
                if (channels[i].getChannelType() == channelType) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public Channel next() {
            for (int i = iteratorIndex + 1; i < channels.length; i++) {
                if (channels[i].getChannelType() == channelType) {
                    iteratorIndex = i;
                    return channels[i];
                }
            }
            return null;
        }

    }
}
