package Dao;
import java.util.*;
import java.sql.*;

import Model.*;
public class ShoeDaoImpl implements ShoeDAO{
    Connection con;
    public ShoeDaoImpl(){
        con=EstablishConnection.getDbConnection();
    }
    public void insertShoe(){

    }
    public boolean deleteShoeByBrand(String brand){
        return false;
    }

    public boolean deleteShoeById(int id){
        return false;
    }

    public boolean deleteShoeBySize(int size){
        return false;
    }

    public boolean updateShoe(int id){
        return false;
    }

    public ArrayList<Shoe> viewById(int id){
        ArrayList<Shoe> al=new ArrayList<>();
        String query="Select * from shoe where sid=?";
        PreparedStatement pst;
        try{
            pst=con.prepareStatement(query);
            pst.setInt(1, id);
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
            Shoe shoe=new Shoe(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(6), rs.getString(7), rs.getInt(4), rs.getInt(5));
            al.add(shoe);
            }
            else{
                return  null;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return new ArrayList<>();
    }
    public void viewBySize(int size){
    }

    public void viewByBrand(String brand){
    }
}
