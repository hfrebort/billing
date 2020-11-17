package at.frebort.billing.controller;

import at.frebort.billing.dao.InvoiceRepository;
import at.frebort.billing.dto.Invoice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceRestController {

   private final InvoiceRepository repository;

   @Autowired
   public InvoiceRestController(final InvoiceRepository repository) {
      this.repository = repository;
   }

   @GetMapping("/invoices")
   @ResponseBody
   public List<Invoice> getInvoices() {
      return this.repository.findAll();
   }

   @GetMapping("/invoices/{invoiceId}")
   @ResponseBody
   public Invoice getInvoice(@PathVariable("invoiceId") final int id) {
      return this.repository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("invoice does not exist!"));
   }

   @PostMapping("/invoices")
   public void insertinvoice(@RequestBody final Invoice invoice) {
      if (this.repository.existsById(invoice.getInvoiceId())) {
         throw new IllegalArgumentException("Invoice already exist!");
      }
      this.repository.save(invoice);
   }

   @PutMapping("/invoices")
   public void updateCustomer(@RequestBody final Invoice invoice) {
      this.repository.save(invoice);
   }
}
