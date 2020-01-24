class ClinicService{
    //Members
    private int serviceNumber;
    private String serviceName;
    private String serviceDescription;

    //Set value functions
    public void setServiceNumber(int snum){
        serviceNumber = snum;
    }
    public void setServiceName(String sn){
        serviceName = sn;
    }
    public void setServiceDescription(String sd){
        serviceDescription = sd;
    }

    //Get functions to call private values
    public int getServiceNumber(){
        return serviceNumber;
    }
    public String getServiceName(){
        return serviceName;
    }
    public String getServiceDescription(){
        return serviceDescription;
    }
}