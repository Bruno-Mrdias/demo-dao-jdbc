package application;

import entities.Department;
import entities.Seller;
import java.util.List;
import modelDao.DaoFactory;
import modelDao.SellerDao;

public class Program {
    public static void main(String[] args) throws Exception {
       

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment ===");
        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }
    }
}
