package simple;

import message.Message;
import simple.Protocol.AProtocol;
import simple.Protocol.BProtocol;
import simple.Protocol.CProtocol;
import simple.Protocol.Protocol;

public class Main {
    public static void main(String[] args) {
        MessageProtocolConverter messageProtocolConverter = new MessageProtocolConverter();

        System.out.println("-------------Serialize-------------");
        Protocol protocolA = new AProtocol()
                                    .setAField1("1")
                                    .setAField2("2");
        Message messageA = messageProtocolConverter.protocolSerialize(protocolA);
        System.out.println(messageA.getMessage());

        Protocol protocolB = new BProtocol()
                                    .setBField1("1")
                                    .setBField2("2")
                                    .setBField3("3");
        Message messageB = messageProtocolConverter.protocolSerialize(protocolB);
        System.out.println(messageB.getMessage());

        Protocol protocolC = new CProtocol()
                                    .setCField1("1")
                                    .setCField2("2")
                                    .setCField3("3")
                                    .setCField4("4");
        Message messageC = messageProtocolConverter.protocolSerialize(protocolC);
        System.out.println(messageC.getMessage());

        System.out.println("-------------Deserialize-------------");
        Protocol deserializedProtocolA = messageProtocolConverter.messageDeserialize(messageA);
        deserializedProtocolA.execute();

        Protocol deserializedProtocolB = messageProtocolConverter.messageDeserialize(messageB);
        deserializedProtocolB.execute();

        Protocol deserializedProtocolC = messageProtocolConverter.messageDeserialize(messageC);
        deserializedProtocolC.execute();


    }
}

