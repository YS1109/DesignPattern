package com.ysoztf.chain_of_responsibility;

public abstract class Handler {
    //继任者
    protected Handler successor;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void HandleRequest(int request);
}
