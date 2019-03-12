package complex.protocol.a;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import complex.protocol.Protocol;
import complex.protocol.ProtocolType;
import complex.protocol.a.subprotocol.A1Protocol;
import complex.protocol.a.subprotocol.A2Protocol;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "subType")
@JsonSubTypes({
        @JsonSubTypes.Type(value = A1Protocol.class, name = "A1"),
        @JsonSubTypes.Type(value = A2Protocol.class, name = "A2")
})
public abstract class AProtocol implements Protocol {
    public ProtocolType getType() {
        return ProtocolType.A;
    }
}