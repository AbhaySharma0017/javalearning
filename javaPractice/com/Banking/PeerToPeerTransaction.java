package com.Banking;
class  PeerToPeerTransaction extends Transaction{
    private String recipient;

    public PeerToPeerTransaction(int transactionId, double amount, String recipient)
    {
        super(transactionId,amount);
        this.recipient = recipient;
    }
     String getRecipient(){
        return recipient;
    }
    //   public PeerToPeerTransaction()
    // {

    // }
}