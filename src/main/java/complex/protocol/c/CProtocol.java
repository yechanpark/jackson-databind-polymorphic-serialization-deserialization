package complex.protocol.c;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import complex.protocol.Protocol;
import complex.protocol.ProtocolType;
import complex.protocol.c.subprotocol.C1Protocol;
import complex.protocol.c.subprotocol.C2Protocol;
import complex.protocol.c.subprotocol.C3Protocol;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "subType")
@JsonSubTypes({
        @JsonSubTypes.Type(value = C1Protocol.class, name = "C1"),
        @JsonSubTypes.Type(value = C2Protocol.class, name = "C2"),
        @JsonSubTypes.Type(value = C3Protocol.class, name = "C3")
})
public abstract class CProtocol implements Protocol {
    public ProtocolType getType() {
        return ProtocolType.C;
    }
}