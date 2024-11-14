package model;
public class OnlinePayment implements PaymentInterface{
    private String transactionID;
    private String paymentGateway;

    
    public OnlinePayment(String transactionID, String paymentGateway) {
        this.transactionID = transactionID;
        this.paymentGateway = paymentGateway;
    }


    public String makePayment(double amount){
        return "Payment Gateway: " + this.paymentGateway + "\nTotal amount: " + amount;
    }

    public String getTransactionID() {
        return transactionID;
    }
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }
    public String getPaymentGateway() {
        return paymentGateway;
    }
    public void setPaymentGateway(String paymentGateway) {
        this.paymentGateway = paymentGateway;
    }



}
