package Controller;
import Dao.ShoeDAO;
import Dao.ShoeDaoImpl;
import Model.Shoe;
import java.util.*;
public class UserOperationscontroller {
    ShoeDAO shoeDAO;
    public UserOperationscontroller(ShoeDAO shoeDAO){
        this.shoeDAO=shoeDAO;
    }
    public ArrayList<Shoe> viewById(int id){
    ArrayList<Shoe> al=shoeDAO.viewById(id);
    return al;
    }
}
