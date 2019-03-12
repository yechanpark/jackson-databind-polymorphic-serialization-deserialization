package complex;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import complex.protocol.Protocol;
import complex.protocol.ProtocolType;
import message.Message;

import java.io.IOException;

class MessageProtocolConverter {
    private ObjectMapper objectMapper;

    MessageProtocolConverter() {
        objectMapper = new ObjectMapper();
    }

    /**
     * Serialize
     **/
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

    /**
     * Deserialize
     **/
    Protocol messageDeserialize(Message message) {
        try {
            // json 메시지를 json node 타입으로 변경한다.
            JsonNode protocolJsonNode = objectMapper.readTree(message.getMessage());

            // 변경된 JsonNode 중 "type"을 키 값으로 하는 JSON Node를 얻음
            JsonNode typeJsonNode = protocolJsonNode.get("type");

            // type 키에 해당되는 value값을 String으로 저장
            String stringProtocolType = typeJsonNode.textValue();

            // ProtocolType에서 해당 String 값을 바탕으로 Enum을 구함
            ProtocolType protocolType = ProtocolType.valueOf(stringProtocolType);

            // 해당 Enum의 getProtocolType()을 호출하면 추상 클래스의 정보가 넘어온다.
            // messageDeserialize() 메서드의 리턴타입은 Protocol인데,
            // readValue()는 Class<T>를 리턴하므로 Protocol 타입으로 강제로 캐스팅한다.
            return (Protocol) objectMapper.readValue(message.getMessage(), protocolType.getProtocolType());
        } catch (IOException e) {
            System.out.println("Mesaage to Protocol Deserialization Failure");
        }
        return null;
    }
}
