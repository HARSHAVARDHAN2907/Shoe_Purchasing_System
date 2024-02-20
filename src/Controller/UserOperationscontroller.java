package Controller;
import Dao.ShoeDAO;
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
    public ArrayList<Shoe> viewByBrand(String brand){
        ArrayList<Shoe> al=shoeDAO.viewByBrand(brand);
        return al;
    }

    public ArrayList<Shoe> viewBySize(int size){
        ArrayList<Shoe> al=shoeDAO.viewBySize(size);
        return al;
    }
}