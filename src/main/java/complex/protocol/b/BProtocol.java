package complex.protocol.b;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import complex.protocol.Protocol;
import complex.protocol.ProtocolType;
import complex.protocol.b.subprotocol.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "subType")
@JsonSubTypes({
        @JsonSubTypes.Type(value = B1Protocol.class, name = "B1"),
        @JsonSubTypes.Type(value = B2Protocol.class, name = "B2"),
        @JsonSubTypes.Type(value = B3Protocol.class, name = "B3"),
        @JsonSubTypes.Type(value = B4Protocol.class, name = "B4"),
        @JsonSubTypes.Type(value = A1Protocol.class, name = "A1"),
})
public abstract class BProtocol implements Protocol {
    public ProtocolType getType() {
        return ProtocolType.B;
    }
}