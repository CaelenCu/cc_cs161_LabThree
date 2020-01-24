class Client{
    //Members
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String country;
    private String email;
    private String insuranceCarrier;
    private int zipCode;
    private int phone;

    //Set Method Functions
    public void setFirstName(String fn){
        firstName = fn;
    }
    public void setLastName(String ln){
        lastName = ln;
    }
    public void setStreet(String st){
        street = st;
    }
    public void setCity(String ci){
        city = ci;
    }
    public void setState(String st){
        state = st;
    }
    public void setCountry(String cou){
        country = cou;
    }
    public void setEmail(String em){
        email = em;
    }
    public void setInsuranceCarrier(String ic){
        insuranceCarrier = ic;
    }
    public void setZipCode(int zip){
        zipCode = zip;
    }
    public void setPhone(int ph){
        phone = ph;
    }

    //Get method Functions
    public String getFirstname(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getStreet(){
        return street;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getCountry(){
        return country;
    }
    public String getEmail(){
        return email;
    }
    public String getInsuranceCarrier(){
        return insuranceCarrier;
    }
    public int getZipCode(){
        return zipCode;
    }
    public int getPhone(){
        return phone;
    }
 





    
}