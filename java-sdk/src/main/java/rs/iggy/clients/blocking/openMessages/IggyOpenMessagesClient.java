package rs.iggy.clients.blocking.openMessages;

import rs.iggy.clients.blocking.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * IggyOpenMessagesClient: A client for interacting with the Iggy Open Messages API.
 *
 * This class implements the IggyBaseClient interface and provides methods to interact with various components of the Iggy system.
 *
 * The client is designed to be used in a blocking manner, meaning that calls to the API will block until a response is received.
 *
 * The client is built on top of an internal TCP client that handles the low-level communication with the Iggy server.
 *
 * Note: This is a placeholder implementation. The actual implementation should include methods for sending and receiving messages,
 *       handling errors, and managing connections.
 */
/* Client Implementation: Implement IggyOpenMessagesClient to provide high-level functionality by delegating to the internal client.
*/


/*
import static rs.iggy.clients.blocking.tcp.BytesSerializer.toBytes;
import static rs.iggy.clients.blocking.tcp.BytesDeserializer.readPolledMessages;
import static rs.iggy.clients.blocking.tcp.BytesDeserializer.readStreamDetails;
import static rs.iggy.clients.blocking.tcp.BytesDeserializer.readTopicDetails;
*/
public class IggyOpenMessagesClient implements IggyBaseClient {
    private static final Logger log = LoggerFactory.getLogger(IggyOpenMessagesClient.class);


    @Override
    public SystemClient system() {
        return null;
    }

    @Override
    public StreamsClient streams() {
        return null;
    }

    @Override
    public UsersClient users() {
        return null;
    }

    @Override
    public TopicsClient topics() {
        return null;
    }

    @Override
    public PartitionsClient partitions() {
        return null;
    }

    @Override
    public ConsumerGroupsClient consumerGroups() {
        return null;
    }

    @Override
    public ConsumerOffsetsClient consumerOffsets() {
        return null;
    }

    @Override
    public MessagesClient messages() {
        return null;
    }

    @Override
    public PersonalAccessTokensClient personalAccessTokens() {
        return null;
    }
}
