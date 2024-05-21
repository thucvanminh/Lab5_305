package BuidlerPattern1;
public interface IContract {

    public void buildContractID(String ID);

    public void buildPropertyID(String ID);

    public void buildTenantID(String ID);

    public void buildRentAmount(double amount);

    public Contract signContract();

}
