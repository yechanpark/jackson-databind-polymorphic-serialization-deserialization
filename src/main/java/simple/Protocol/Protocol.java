package simple.Protocol;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AProtocol.class, name = "A"),
        @JsonSubTypes.Type(value = BProtocol.class, name = "B"),
        @JsonSubTypes.Type(value = CProtocol.class, name = "C")
})
public interface Protocol {
    void execute();
}