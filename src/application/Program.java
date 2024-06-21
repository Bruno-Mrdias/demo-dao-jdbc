package application;

import entities.Seller;
import modelDao.DaoFactory;
import modelDao.SellerDao;

public class Program {
    public static void main(String[] args) throws Exception {
       

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        
        System.out.println(seller);
    }
}
