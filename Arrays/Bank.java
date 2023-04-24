package Assi3;

public class Bank {
	private int actid;
	private String name,city;
    private double balance,bal1=2000;
    
    public Bank(int actid,String name,String city) {
    	this.actid=actid;
    	this.name=name;
    	this.city=city;
    }
	public void deposite(double amount) {
		this.balance = this.balance + amount;
		System.out.println("Balance = "+this.balance);
	}
    public void withdrawal(double amount) {
    	if(balance>amount) {
    		this.balance = this.balance - amount;
    		System.out.println("Balance = "+this.balance);
    	}
    	else {
    		System.out.println("Insufficent Balance");
    	//	return;
    	}
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    	public void MoneyTransfer(Bank receiver,double amount) {
    		if(balance>amount) {
    		this.balance = this.balance - amount;
    		receiver.bal1 = receiver.bal1 + amount;
    		System.out.println("Receiver ="+receiver.getName());
    		System.out.println("Receiver Balance = "+this.bal1);
    		System.out.println("Sender Balance ="+this.balance);
    	}
    		else {
    			System.out.println("Insufficent Balance cannot Transfer");
    		}
    	}
		 
}
