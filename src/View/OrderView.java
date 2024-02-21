package View;

import java.util.Scanner;

import Controller.BillController;
import Controller.OrderController;
import Dao.OrderDaoImpl;
import Dao.OrdersDAO;
import Dao.ShoeDAO;
import Dao.ShoeDaoImpl;

public class OrderView {
    Scanner in=new Scanner(System.in);
    ShoeDAO shoeDAO=new ShoeDaoImpl();
    public void SpecificSneaker(int user_id){
            System.out.println();
            System.out.print("Enter Sneaker ID: ");
            int sid=in.nextInt();
            OrdersDAO ordersDAO=new OrderDaoImpl();
            OrderController orderController=new OrderController(ordersDAO);
            boolean check=orderController.placeOrder(sid,user_id);
            if(check==true){
                BillController billController=new BillController(shoeDAO);
                BillView billView=new BillView(billController);
                billView.generateBill(user_id);
                System.out.println("Order Placed Successfully...Happy Kicking...");
            }
            else{
               System.out.println("Couldn't Place Order");
            }
    }
}
