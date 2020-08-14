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
                   salutation, title, phone, mobile, mobileAlternative,
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMobileAlternative() {
		return mobileAlternative;
	}

	public void setMobileAlternative(String mobileAlternative) {
		this.mobileAlternative = mobileAlternative;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailAlternative() {
		return emailAlternative;
	}

	public void setEmailAlternative(String emailAlternative) {
		this.emailAlternative = emailAlternative;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public String getVatNumber() {
		return vatNumber;
	}

	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getReminderLock() {
		return reminderLock;
	}

	public void setReminderLock(String reminderLock) {
		this.reminderLock = reminderLock;
	}

	public String getArchived() {
		return archived;
	}

	public void setArchived(String archived) {
		this.archived = archived;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

    
    
}
