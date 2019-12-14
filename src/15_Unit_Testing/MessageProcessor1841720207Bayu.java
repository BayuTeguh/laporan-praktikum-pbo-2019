package unittesting;

public class MessageProcessor1841720207Bayu {
    private String mSender, mRecipient, mMessage;

     public String getMessageBayu() {
         return mMessage;     
     } 
 
    public String getRecipientBayu() {         
        return mRecipient;     
    } 
 
    public String getSenderBayu() {         
        return mSender;     
    } 

      public void setMessageBayu(String message) {         
          this.mMessage = message;     
    } 
 
    public void setRecipientBayu(String recipient) {
        this.mRecipient = recipient;     
    } 
 
    public void setSenderBayu(String sender) {
        this.mSender = sender;     
    } 
    
    public String messageFormatBayu(){
        String message = String.format("Hai %s, you have message from %s.\nThe message as follows : %s", 
                this.mRecipient, this.mSender, this.mMessage);
        return message;
    }
    
    public void showMessageBayu(){
        System.out.println(messageFormatBayu());
    }
}
