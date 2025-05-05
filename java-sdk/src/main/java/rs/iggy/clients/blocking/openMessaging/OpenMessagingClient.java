package rs.iggy.clients;

import io.openmessaging.*;

public class OpenMessagingClient implements MessagingClient {
    private final String serviceUrl;
    private MessagingAccessPoint accessPoint;
    private io.openmessaging.producer.Producer producer;

    public OpenMessagingClient(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    @Override
    public void connect() {
        accessPoint = OMS.getMessagingAccessPoint(serviceUrl);
        accessPoint.startup();
        producer = accessPoint.createProducer();
        producer.startup();
    }

    @Override
    public void sendMessage(String topic, String message) {
        Message msg = producer.createMessage(topic, message.getBytes());
        producer.send(msg);
    }

    @Override
    public void disconnect() {
        producer.shutdown();
        accessPoint.shutdown();
    }
}