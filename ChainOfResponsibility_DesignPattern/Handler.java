package com.shafhaz;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public  abstract double applyTax(Invoice invoice);
}
