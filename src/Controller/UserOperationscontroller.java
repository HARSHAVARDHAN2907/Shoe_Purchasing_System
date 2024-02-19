package Controller;
import Dao.ShoeDAO;
public class UserOperationscontroller {
    ShoeDAO shoeDAO;
    public UserOperationscontroller(ShoeDAO shoeDAO){
        this.shoeDAO=shoeDAO;
    }
}
