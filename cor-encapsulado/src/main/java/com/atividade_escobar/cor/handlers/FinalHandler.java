package com.atividade_escobar.cor.handlers;

import com.atividade_escobar.cor.handler.Handler;
import com.atividade_escobar.cor.model.Request;

public class FinalHandler extends Handler {
    @Override
    protected boolean process(Request request) {
        if (request.getResult() == null) {
            request.setResult("No handler could process the request");
        } else {
            request.setResult(request.getResult() + " -> Finalized");
        }
        return true;
    }
}
