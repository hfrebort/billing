package at.frebort.billing.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * The Class IdGeneratorRestControllerTest.
 */
@SpringBootTest
@AutoConfigureMockMvc
public class IdGeneratorRestControllerTest {

   /** The mock mvc. */
   @Autowired
   private MockMvc mockMvc;

   /**
    * Test generate customer id returns status ok.
    *
    * @throws Exception the exception
    */
   @Test
   public void testGenerateCustomerIdReturnsStatusOk() throws Exception {
      this.mockMvc.perform(get("/generate/customerid"))
            .andExpect(status().isOk());
   }
}
