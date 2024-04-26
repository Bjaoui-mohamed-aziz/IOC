package tn.iteam.ext;

import tn.iteam.dao.IDao;

public class DaoImplV3 implements IDao {
    @Override
    public double getValue() {
        System.out.println("version capteurs");
        return 800;
    }
}
