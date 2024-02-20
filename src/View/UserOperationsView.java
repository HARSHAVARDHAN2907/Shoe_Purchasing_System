package View;
import java.util.*;
import Controller.UserOperationscontroller;
import Model.Shoe;
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
        if(choice==1){
            int opt;
            do{
                System.out.println();
                System.out.println("----------------------------------------------");
                System.out.println("| 1.Search Sneaker by ID                     |");
                System.out.println("| 2.Search Sneaker by Brand                  |");
                System.out.println("| 3.Search Sneaker by Size                   |");
                System.out.println("----------------------------------------------");
                System.out.println();
                System.out.print("Enter Value: ");
                opt=in.nextInt();
                if(opt<1 && opt>3){
                    System.out.println("Invalid Input...Try Again");
                }
            }while(opt<1 && opt>3);
            if(opt==1){
                System.out.println();
                System.out.print("Enter Sneaker ID to view: ");
                int sid=in.nextInt();
                ArrayList<Shoe> al=userOperationscontroller.viewById(sid);
                if(al.size()==0){
                    System.out.println("Not Available");
                }
                else{
                    Shoe shoe=al.get(0);
                    System.out.println("ID: "+shoe.getSid()+" | Name: "+shoe.getSname()+" | Brand: "+shoe.getSbrand()+" | Size: "+shoe.getSsize()+" | Wearable By: "+shoe.getGender()+" | Price: "+shoe.getSprice());
                }
            }
            if(opt==2){
                System.out.println();
                System.out.print("Enter Sneaker Brand to view: ");
                String brand=in.next().toLowerCase();
                ArrayList<Shoe> al=userOperationscontroller.viewByBrand(brand);
                if(al.size()==0){
                    System.out.println("Not Available");
                }
                else{
                    for(Shoe shoe:al){
                        System.out.println();
                        System.out.println("ID: "+shoe.getSid()+" | Name: "+shoe.getSname()+" | Brand: "+shoe.getSbrand()+" | Size: "+shoe.getSsize()+" | Wearable By: "+shoe.getGender()+" | Price: "+shoe.getSprice());
                    }
                }
            }
            if(opt==3){
                System.out.println();
                System.out.print("Enter your sneaker size to view: ");
                int size=in.nextInt();
                ArrayList<Shoe> al=userOperationscontroller.viewBySize(size);
                if(al.size()==0){
                    System.out.println("Not Available");
                }
                else{
                    for(Shoe shoe:al){
                        System.out.println();
                        System.out.println("ID: "+shoe.getSid()+" | Name: "+shoe.getSname()+" | Brand: "+shoe.getSbrand()+" | Size: "+shoe.getSsize()+" | Wearable By: "+shoe.getGender()+" | Price: "+shoe.getSprice());
                    }
                }
            }
        }
    }
}