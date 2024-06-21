package application;

import entities.Seller;
import modelDao.DaoFactory;
import modelDao.SellerDao;

public class Program {
    public static void main(String[] args) throws Exception {
       

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);
        
        System.out.println(seller);
    }
}
