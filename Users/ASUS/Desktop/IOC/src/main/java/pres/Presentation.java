package pres;

import tn.iteam.dao.IDao;
import tn.iteam.metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class Presentation {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String metierClassName = scanner.next();
            Class cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.newInstance();
            String daoClassName = scanner.next();
            Class cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.newInstance();
            System.out.println(metier.calcul());

        } catch (Exception e) {
            throw new RuntimeException(e);

        }

    }
}
