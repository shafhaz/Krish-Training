package com.shafhaz;

public class Invoice {
    private int invoiceNumber;
    private double amount;
    private double tax;

    protected void setTax(double tax){
        this.tax=tax;
    }

    public Invoice(int invoiceNumber,double amount){
        this.invoiceNumber=invoiceNumber;
        this.amount=amount;
        //this.tax=tax; You dont need to pass this bcz u need to calculate it
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getAmount() {
        return amount;
    }

    public double getTax() {
        return tax;
    }
}
