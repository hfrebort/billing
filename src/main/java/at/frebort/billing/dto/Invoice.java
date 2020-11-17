package at.frebort.billing.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Invoice {
   
   @Id
   private int invoiceId;
   private String number;
   private Date invoiceDate;
   private Date paymentDate;
   private String insurance;
   private String text;
   private String salutation;
   private String title;
   private String company;
   private String companyExtension;
   private String address;
   private String zipCode;
   private String city;
   private String region;
   private boolean payWithDebit;
   private boolean canceled;
   private Date cancelationDate;
   private boolean alreadySent;
   private Date alreadySentDate;
   
   public int getInvoiceId() {
      return invoiceId;
   }
   public void setInvoiceId(int invoiceId) {
      this.invoiceId = invoiceId;
   }
   public String getNumber() {
      return number;
   }
   public void setNumber(String number) {
      this.number = number;
   }
   public Date getInvoiceDate() {
      return invoiceDate;
   }
   public void setInvoiceDate(Date invoiceDate) {
      this.invoiceDate = invoiceDate;
   }
   public Date getPaymentDate() {
      return paymentDate;
   }
   public void setPaymentDate(Date paymentDate) {
      this.paymentDate = paymentDate;
   }
   public String getInsurance() {
      return insurance;
   }
   public void setInsurance(String insurance) {
      this.insurance = insurance;
   }
   public String getText() {
      return text;
   }
   public void setText(String text) {
      this.text = text;
   }
   public String getSalutation() {
      return salutation;
   }
   public void setSalutation(String salutation) {
      this.salutation = salutation;
   }
   public String getTitle() {
      return title;
   }
   public void setTitle(String title) {
      this.title = title;
   }
   public String getCompany() {
      return company;
   }
   public void setCompany(String company) {
      this.company = company;
   }
   public String getCompanyExtension() {
      return companyExtension;
   }
   public void setCompanyExtension(String companyExtension) {
      this.companyExtension = companyExtension;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String address) {
      this.address = address;
   }
   public String getZipCode() {
      return zipCode;
   }
   public void setZipCode(String zipCode) {
      this.zipCode = zipCode;
   }
   public String getCity() {
      return city;
   }
   public void setCity(String city) {
      this.city = city;
   }
   public String getRegion() {
      return region;
   }
   public void setRegion(String region) {
      this.region = region;
   }
   public boolean isPayWithDebit() {
      return payWithDebit;
   }
   public void setPayWithDebit(boolean payWithDebit) {
      this.payWithDebit = payWithDebit;
   }
   public boolean isCanceled() {
      return canceled;
   }
   public void setCanceled(boolean canceled) {
      this.canceled = canceled;
   }
   public Date getCancelationDate() {
      return cancelationDate;
   }
   public void setCancelationDate(Date cancelationDate) {
      this.cancelationDate = cancelationDate;
   }
   public boolean isAlreadySent() {
      return alreadySent;
   }
   public void setAlreadySent(boolean alreadySent) {
      this.alreadySent = alreadySent;
   }
   public Date getAlreadySentDate() {
      return alreadySentDate;
   }
   public void setAlreadySentDate(Date alreadySentDate) {
      this.alreadySentDate = alreadySentDate;
   }
   
}
