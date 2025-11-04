package com.atividade_escobar.cor;

import com.atividade_escobar.cor.facade.RequestProcessor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RequestProcessorTest {
    @Test
    public void testAuthorizedAndProcess() {
        RequestProcessor p = new RequestProcessor();
        String result = p.process("auth user process");
        assertNotNull(result);
        assertTrue(result.contains("Authenticated"));
        assertTrue(result.contains("Validated"));
        assertTrue(result.contains("BusinessProcessed") || result.contains("Finalized"));
    }

    @Test
    public void testUnauthorized() {
        RequestProcessor p = new RequestProcessor();
        String result = p.process("noauth data");
        assertEquals("Unauthorized", result);
    }
}
