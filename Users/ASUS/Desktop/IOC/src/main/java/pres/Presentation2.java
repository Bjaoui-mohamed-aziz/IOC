package pres;

import tn.iteam.dao.IDao;

import java.io.File;
import java.util.Scanner;

public class Presentation2 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassName = scanner.next();
            Class cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.newInstance();
            System.out.println(dao.getValue());

        } catch (Exception e) {
            throw new RuntimeException(e);

        }

    }
}
