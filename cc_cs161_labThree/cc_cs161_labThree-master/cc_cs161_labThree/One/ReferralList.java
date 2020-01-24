class ReferralList{
    //Members
    private String providerName;
    private String location;
    private String serviceProvided;
    private String serviceNeed;
    private int phone;

    //Get functions for private variables
    public String getProviderName(){
        return providerName;
    }
    public String getLocation(){
        return location;
    }
    public String getServiceProvided(){
        return serviceProvided;
    }
    public int getPhone(){
        return phone;
    }

    //Set functions to set variables
    public void setProviderName(String pn){
        providerName = pn;
    }
    public void setLocation(String lo){
        location = lo;
    }
    public void setServiceProvided(String sp){
        serviceProvided = sp;
    }
    public void setPhone(int ph){
        phone = ph;
    }

     //Operation to identify the client's needs (calls from ServiceNeed)
     public void matchServiceNeeds(String str){
        serviceNeed = str;
    }
    //Operation to display a list of possible referrals
    public void displayMatchedList(){
        if(serviceNeed == serviceProvided){
        System.out.println(providerName + location + phone + serviceProvided);
        }
    }
    
}