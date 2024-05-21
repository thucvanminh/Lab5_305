package BuidlerPattern1;
public class Permanent implements IContract {

    String contractID;
    String tenantID;
    String propertyID;
    double rentAmount;

    public Permanent(String contractID, String tenantID, String propertyID, int rentAmount) {
        this.contractID = contractID;
        this.tenantID = tenantID;
        this.propertyID = propertyID;
        this.rentAmount = rentAmount;
    }

    @Override
    public void buildContractID(String ID) {
        this.contractID = ID;
    }

    @Override
    public void buildPropertyID(String ID) {
        this.propertyID = ID;

    }

    @Override
    public void buildRentAmount(double amount) {
        this.rentAmount = amount;

    }

    @Override
    public void buildTenantID(String ID) {
        this.tenantID = ID;

    }

    @Override
    public Contract signContract() {
        return new Contract(contractID, tenantID, propertyID, rentAmount);
    }

}
