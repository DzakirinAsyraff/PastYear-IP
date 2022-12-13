package Model;

public class Customer {
    // attributes: username, fullname, email, gender, payment, address, phone
    private String username;
    private String fullname;
    private String email;
    private String gender;
    private String payment;
    private String address;
    private String phone;
    private String[] interest;

    // empty constructor
    public Customer() {
    }

    // constructor with all attributes
    public Customer(String username, String fullname, String gender, String email, String payment, String address, String phone, String[] interest) {
        this.username = username;
        this.fullname = fullname;
        this.gender = gender;
        this.email = email;
        this.payment = payment;
        this.address = address;
        this.phone = phone;
        this.interest = interest;
    }

    // getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String[] getInterest() {
        return interest;
    }

    public void setInterest(String[] interest) {
        this.interest = interest;
    }

    // // toString method
    // @Override
    // public String toString() {
    //     return "Customer [address=" + address + ", email=" + email + ", fullname=" + fullname ;
    // }

}
