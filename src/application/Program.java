package application;

import entities.Department;
import entities.Seller;
import java.util.Date;
import modelDao.DaoFactory;
import modelDao.SellerDao;

public class Program {
    public static void main(String[] args) throws Exception {
       
        Department obj = new Department(1, "Books");
        System.out.println(obj);

        Seller seller = new Seller(21, "BOB", "bob@gmail.com", new Date(), 3000.0,obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}
