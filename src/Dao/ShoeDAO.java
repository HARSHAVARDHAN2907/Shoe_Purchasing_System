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
    void viewByBrand(String brand);
    void viewBySize(int size);
}
