public class CustomerManager {

    private ICustomerDai iCustomerDai;

    public CustomerManager(ICustomerDai iCustomerDai){
        this.iCustomerDai = iCustomerDai;
    }

    public  void Add(){
        // is Write here
        iCustomerDai.Add();
    }
}
