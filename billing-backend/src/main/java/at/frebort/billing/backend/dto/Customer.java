package at.frebort.billing.backend.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

   @Id
   private int customerId;

   private String firstName;

   private String lastName;

   private String company, companyExtension, address, zipCode, city, region,
         salutation, title, phone, fax, mobile, mobileAlternative,
         email, emailAlternative, website, insurance, vatNumber,
         paymentDate, reminderLock, archived, remark;

   public int getCustomerId() {
      return this.customerId;
   }

   public void setCustomerId(final int customerId) {
      this.customerId = customerId;
   }

   public String getFirstName() {
      return this.firstName;
   }

   public void setFirstName(final String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return this.lastName;
   }

   public void setLastName(final String lastName) {
      this.lastName = lastName;
   }

   public String getCompany() {
      return this.company;
   }

   public void setCompany(final String company) {
      this.company = company;
   }

   public String getCompanyExtension() {
      return this.companyExtension;
   }

   public void setCompanyExtension(final String companyExtension) {
      this.companyExtension = companyExtension;
   }

   public String getAddress() {
      return this.address;
   }

   public void setAddress(final String address) {
      this.address = address;
   }

   public String getZipCode() {
      return this.zipCode;
   }

   public void setZipCode(final String zipCode) {
      this.zipCode = zipCode;
   }

   public String getCity() {
      return this.city;
   }

   public void setCity(final String city) {
      this.city = city;
   }

   public String getRegion() {
      return this.region;
   }

   public void setRegion(final String region) {
      this.region = region;
   }

   public String getSalutation() {
      return this.salutation;
   }

   public void setSalutation(final String salutation) {
      this.salutation = salutation;
   }

   public String getTitle() {
      return this.title;
   }

   public void setTitle(final String title) {
      this.title = title;
   }

   public String getPhone() {
      return this.phone;
   }

   public void setPhone(final String phone) {
      this.phone = phone;
   }

   public String getFax() {
      return this.fax;
   }

   public void setFax(final String fax) {
      this.fax = fax;
   }

   public String getMobile() {
      return this.mobile;
   }

   public void setMobile(final String mobile) {
      this.mobile = mobile;
   }

   public String getMobileAlternative() {
      return this.mobileAlternative;
   }

   public void setMobileAlternative(final String mobileAlternative) {
      this.mobileAlternative = mobileAlternative;
   }

   public String getEmail() {
      return this.email;
   }

   public void setEmail(final String email) {
      this.email = email;
   }

   public String getEmailAlternative() {
      return this.emailAlternative;
   }

   public void setEmailAlternative(final String emailAlternative) {
      this.emailAlternative = emailAlternative;
   }

   public String getWebsite() {
      return this.website;
   }

   public void setWebsite(final String website) {
      this.website = website;
   }

   public String getInsurance() {
      return this.insurance;
   }

   public void setInsurance(final String insurance) {
      this.insurance = insurance;
   }

   public String getVatNumber() {
      return this.vatNumber;
   }

   public void setVatNumber(final String vatNumber) {
      this.vatNumber = vatNumber;
   }

   public String getPaymentDate() {
      return this.paymentDate;
   }

   public void setPaymentDate(final String paymentDate) {
      this.paymentDate = paymentDate;
   }

   public String getReminderLock() {
      return this.reminderLock;
   }

   public void setReminderLock(final String reminderLock) {
      this.reminderLock = reminderLock;
   }

   public String getArchived() {
      return this.archived;
   }

   public void setArchived(final String archived) {
      this.archived = archived;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setRemark(final String remark) {
      this.remark = remark;
   }

   @Override
   public String toString() {
      return "Customer [customerId=" + this.customerId + ", firstName=" + this.firstName + ", lastName=" + this.lastName + "]";
   }

}
