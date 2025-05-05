package rs.iggy.clients;

import rs.iggy.clients.blocking.tcp.IggyTcpClient;

public class IggyMessagingClient implements MessagingClient {
    private final IggyTcpClient client;

    public IggyMessagingClient(String host, int port) {
        this.client = new IggyTcpClient(host, port);
    }

    @Override
    public void connect() {
        client.users().login("iggy", "iggy");
    }

    @Override
    public void sendMessage(String topic, String message) {
        // Implement using your existing Iggy logic
    }

    @Override
    public void disconnect() {
        // Implement disconnect logic if needed
    }
}