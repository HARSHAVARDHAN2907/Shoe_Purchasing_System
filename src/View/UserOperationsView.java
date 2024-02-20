package View;
import java.util.*;
import Controller.UserOperationscontroller;
public class UserOperationsView {
    Scanner in=new Scanner(System.in);
    UserOperationscontroller userOperationscontroller;
    public UserOperationsView(UserOperationscontroller userOperationscontroller){
        this.userOperationscontroller=userOperationscontroller;
    }
    public void UserViewPage(int id){
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        int choice;
        do{
        System.out.println("1.Display sneakers for viewing");
        System.out.println("2.Place an order for a sneaker");
        System.out.println("3.Add a sneaker to cart");
        System.out.println("4.View Order History");
        System.out.println("5.Logout");
        System.out.println();
        System.out.print("Enter Value: ");
        choice=in.nextInt();
        if(choice<=0 || choice>5){
            System.out.println("Invalid Input...Try Again");
        }
        }while(!(choice>=1 && choice<=5));
        if(choice==5){
            System.out.println();
            Display disp=new Display();
            disp.display();
        }
    }
}
