package Controller;

import java.util.ArrayList;

import Dao.ShoeDAO;
import Model.Shoe;

public class BillController {
    ShoeDAO shoeDAO;
    public BillController(ShoeDAO shoeDAO){
        this.shoeDAO=shoeDAO;
    }
    public ArrayList<Shoe> generateBill(){
        ArrayList<Shoe> al=new ArrayList<>();
        
        return al;
    }
}
