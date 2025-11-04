package com.atividade_escobar.cor.handler;

import com.atividade_escobar.cor.model.Request;

public abstract class Handler {
    private Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public final void handle(Request request) {
        boolean handled = process(request);
        if (!handled && next != null) {
            next.handle(request);
        }
    }

    protected abstract boolean process(Request request);
}
