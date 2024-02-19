package Dao;
import Model.Order;
import java.util.*;
/**
 * OrdersDAO
 */
public interface OrdersDAO {
    public ArrayList<Order> getOrders(int id);
}
