package BuidlerPattern1;
public class Contract {
    String contractID;
    String tenantID;
    String PropertyID;
    double rentAmount;

    public Contract(String contractID, String tenantID, String propertyID, double rentAmount) {
        this.contractID = contractID;
        this.tenantID = tenantID;
        PropertyID = propertyID;
        this.rentAmount = rentAmount;
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public String getTenantID() {
        return tenantID;
    }

    public void setTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    public String getPropertyID() {
        return PropertyID;
    }

    public void setPropertyID(String propertyID) {
        PropertyID = propertyID;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    @Override
    public String toString() {
        return "Contract ID: " + this.contractID + ", tenant ID: " + this.tenantID + ", Property ID: " + PropertyID
                + ", Rent amount: " + rentAmount;
    }

}
