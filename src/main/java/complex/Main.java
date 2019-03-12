package complex;

import complex.protocol.Protocol;
import complex.protocol.a.subprotocol.A2Protocol;
import complex.protocol.b.subprotocol.B1Protocol;
import complex.protocol.b.subprotocol.B2Protocol;
import complex.protocol.b.subprotocol.B3Protocol;
import complex.protocol.b.subprotocol.B4Protocol;
import complex.protocol.c.subprotocol.C1Protocol;
import complex.protocol.c.subprotocol.C2Protocol;
import complex.protocol.c.subprotocol.C3Protocol;
import message.Message;

public class Main {
    public static void main(String[] args) {
        MessageProtocolConverter messageProtocolConverter = new MessageProtocolConverter();

        System.out.println("-------------Serialize-------------");
        Protocol protocolA1 = new complex.protocol.a.subprotocol.A1Protocol()
                                    .setA1Field1("1")
                                    .setA1Field2("2");
        Message messageA1 = messageProtocolConverter.protocolSerialize(protocolA1);
        System.out.println(messageA1.getMessage());

        Protocol protocolA2 = new A2Protocol()
                .setA2Field1("1")
                .setA2Field2("2");
        Message messageA2 = messageProtocolConverter.protocolSerialize(protocolA2);
        System.out.println(messageA2.getMessage());


        Protocol protocolB1A1 = new complex.protocol.b.subprotocol.A1Protocol()
                                    .setA1Field1("1")
                                    .setA1Field2("2");
        Message messageB1A1 = messageProtocolConverter.protocolSerialize(protocolB1A1);
        System.out.println(messageB1A1.getMessage());

        Protocol protocolB1 = new B1Protocol()
                                    .setB1Field1("1")
                                    .setB1Field2("2")
                                    .setB1Field3(3);
        Message messageB1 = messageProtocolConverter.protocolSerialize(protocolB1);
        System.out.println(messageB1.getMessage());

        Protocol protocolB2 = new B2Protocol()
                                    .setB2Field1("1")
                                    .setB2Field2(2);
        Message messageB2 = messageProtocolConverter.protocolSerialize(protocolB2);
        System.out.println(messageB2.getMessage());

        Protocol protocolB3 = new B3Protocol()
                                    .setB3Field1("1");
        Message messageB3 = messageProtocolConverter.protocolSerialize(protocolB3);
        System.out.println(messageB3.getMessage());

        Protocol protocolB4 = new B4Protocol()
                                    .setB4Field1("1")
                                    .setB4Field2(2);
        Message messageB4 = messageProtocolConverter.protocolSerialize(protocolB4);
        System.out.println(messageB4.getMessage());



        Protocol protocolC1 = new C1Protocol()
                                    .setC1Field1("1")
                                    .setC1Field2("2");
        Message messageC1 = messageProtocolConverter.protocolSerialize(protocolC1);
        System.out.println(messageC1.getMessage());

        Protocol protocolC2 = new C2Protocol()
                                    .setC2Field1("1")
                                    .setC2Field2(true);
        Message messageC2 = messageProtocolConverter.protocolSerialize(protocolC2);
        System.out.println(messageC2.getMessage());

        Protocol protocolC3 = new C3Protocol()
                                    .setC3Field1("1")
                                    .setC3Field2(false);
        Message messageC3 = messageProtocolConverter.protocolSerialize(protocolC3);
        System.out.println(messageC3.getMessage());


        System.out.println("-------------Deserialize-------------");
        Protocol deserializedProtocolA1 = messageProtocolConverter.messageDeserialize(messageA1);
        deserializedProtocolA1.execute();

        Protocol deserializedProtocolA2 = messageProtocolConverter.messageDeserialize(messageA2);
        deserializedProtocolA2.execute();

        Protocol deserializedProtocolB1A1 = messageProtocolConverter.messageDeserialize(messageB1A1);
        deserializedProtocolB1A1.execute();

        Protocol deserializedProtocolB1 = messageProtocolConverter.messageDeserialize(messageB1);
        deserializedProtocolB1.execute();

        Protocol deserializedProtocolB2 = messageProtocolConverter.messageDeserialize(messageB2);
        deserializedProtocolB2.execute();

        Protocol deserializedProtocolB3 = messageProtocolConverter.messageDeserialize(messageB3);
        deserializedProtocolB3.execute();

        Protocol deserializedProtocolB4 = messageProtocolConverter.messageDeserialize(messageB4);
        deserializedProtocolB4.execute();

        Protocol deserializedProtocolC1 = messageProtocolConverter.messageDeserialize(messageC1);
        deserializedProtocolC1.execute();

        Protocol deserializedProtocolC2 = messageProtocolConverter.messageDeserialize(messageC2);
        deserializedProtocolC2.execute();

        Protocol deserializedProtocolC3 = messageProtocolConverter.messageDeserialize(messageC3);
        deserializedProtocolC3.execute();

    }
}