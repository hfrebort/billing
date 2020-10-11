package at.frebort.billing.frontend;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author hfrebort
 * @version 11.10.2020
 */
@SpringBootTest
@AutoConfigureMockMvc
public class RestControllerTest {

   @Autowired
   private MockMvc mockMvc;

   @Autowired
   private ZipCodeRestController controller;

   @Test
   public void contextLoads() throws Exception {
      assertThat(this.controller).isNotNull();
   }

   @Test
   void whenValidInput_thenReturns200() throws Exception {
      this.mockMvc.perform(get("/zipcodes")
            .contentType("application/json"))
            .andExpect(status().isOk());
   }

}
