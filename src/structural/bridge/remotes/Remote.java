package structural.bridge.remotes;

public interface Remote {
    void power();

    void volumeUp();

    void volumeDown();

    void channelUp();

    void ChannelDown();

    void setChannel(int channel);
}
