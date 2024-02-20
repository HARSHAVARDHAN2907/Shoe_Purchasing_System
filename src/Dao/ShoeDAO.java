package Dao;
import java.util.*;
import Model.Shoe;
public interface ShoeDAO {
    void insertShoe();
    boolean deleteShoeById(int id);
    boolean deleteShoeByBrand(String brand);
    boolean deleteShoeBySize(int size);
    boolean updateShoe(int id);
    ArrayList<Shoe> viewById(int id);
    ArrayList<Shoe> viewByBrand(String brand);
    ArrayList<Shoe> viewBySize(int size);
}