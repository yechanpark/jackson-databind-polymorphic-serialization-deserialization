package simple;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import message.Message;
import simple.Protocol.Protocol;

import java.io.IOException;

class MessageProtocolConverter {
    private ObjectMapper objectMapper;

    MessageProtocolConverter() {
        objectMapper = new ObjectMapper();
    }

    /** Serialize **/
    Message protocolSerialize(Protocol protocol) {
        Message message = new Message();
        try {
            String json = objectMapper.writeValueAsString(protocol);
            message.setMessage(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            System.out.println("Protocol to Message Serialization Failure");
        }

        return message;
    }

    /** Deserialize **/
    Protocol messageDeserialize(Message message) {
        Protocol protocol = null;

        try {
            protocol = objectMapper.readValue(message.getMessage(), Protocol.class);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Message to Protocol Deserialization Failure");
        }

        return protocol;

    }
}