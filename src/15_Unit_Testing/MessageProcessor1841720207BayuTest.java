package unittesting;

import org.junit.Assert;
import org.junit.Test;
public class MessageProcessor1841720207BayuTest {
    MessageProcessor1841720207Bayu mProcessor;

    public MessageProcessor1841720207BayuTest() {
        mProcessor = new MessageProcessor1841720207Bayu();
        mProcessor.setSenderBayu("Ronaldo");
        mProcessor.setRecipientBayu("Rafael");
        mProcessor.setMessageBayu("Whats up bro?");
    }
    
    @Test
    public void testShowMessageBayu(){
        String expetedResult = "Hai Rafael, you have message from Ronaldo.\nThe message as follows : Whats up bro?";
        Assert.assertEquals(expetedResult, mProcessor.messageFormatBayu());
    }
}
