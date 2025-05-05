package rs.iggy.clients;

public interface MessagingClient {
    void connect();
    void sendMessage(String topic, String message);
    void disconnect();
}