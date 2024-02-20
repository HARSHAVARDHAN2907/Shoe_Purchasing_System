package Dao;
import java.util.*;

import Model.EstablishConnection;
import Model.Shoe;
import java.sql.*;
public class ShoeDaoImpl implements ShoeDAO{
    private Connection con;
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
        String query="Select * from shoes where sid=?";
        PreparedStatement pst;
        ArrayList<Shoe> al=new ArrayList<>();
        try {
        pst=con.prepareStatement(query);
        pst.setInt(1, id);
        ResultSet rs=pst.executeQuery();
        if(rs.next()){
            int sid=rs.getInt(1);
            String sname=rs.getString(2);
            String sbrand=rs.getString(3);
            int ssize=rs.getInt(4);
            int scount=rs.getInt(5);
            String sprice=rs.getString(6);
            String gender=rs.getString(7);
            if(scount>0){
            Shoe shoe=new Shoe(sid, sname, sbrand, sprice, gender, ssize, scount);
            al.add(shoe);
            }
        }
        return al;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return al;
    }

    public ArrayList<Shoe> viewBySize(int size){
        ArrayList<Shoe> al=new ArrayList<>();
        String query="Select * from shoes where ssize=?";
        PreparedStatement pst;
        try {
            pst=con.prepareStatement(query);
            // System.out.println(pst);
            pst.setInt(1, size);
            // System.out.println(pst);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                int sid=rs.getInt(1);
                String sname=rs.getString(2);
                String sbrand=rs.getString(3);
                int ssize=rs.getInt(4);
                int scount=rs.getInt(5);
                String sprice=rs.getString(6);
                String gender=rs.getString(7);
                if(scount>0){
                Shoe shoe=new Shoe(sid, sname, sbrand, sprice, gender, ssize, scount);
                al.add(shoe);
                }
            }
            return al;
        } catch (Exception e) {

        }
        return al;
    }

    public ArrayList<Shoe> viewByBrand(String brand){
        ArrayList<Shoe> al=new ArrayList<>();
        String query="Select * from shoes where sbrand=?";
        PreparedStatement pst;
        try {
        pst=con.prepareStatement(query);
        pst.setString(1, brand);
        ResultSet rs=pst.executeQuery();
        while(rs.next()){
            int sid=rs.getInt(1);
            String sname=rs.getString(2);
            String sbrand=rs.getString(3);
            int ssize=rs.getInt(4);
            int scount=rs.getInt(5);
            String sprice=rs.getString(6);
            String gender=rs.getString(7);
            if(scount>0){
            Shoe shoe=new Shoe(sid, sname, sbrand, sprice, gender, ssize, scount);
            al.add(shoe);
            }
        }
        return al;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return al;
    }
}