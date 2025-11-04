package com.atividade_escobar.cor.facade;

import com.atividade_escobar.cor.builder.ChainBuilder;
import com.atividade_escobar.cor.handler.Handler;
import com.atividade_escobar.cor.model.Request;

/**
 * Facade público. Programador de borda conhece somente esta classe.
 */
public class RequestProcessor {
    private final Handler chain;

    public RequestProcessor() {
        this.chain = new ChainBuilder().build();
    }

    public String process(String data) {
        Request req = new Request(data);
        chain.handle(req);
        return req.getResult();
    }
}
