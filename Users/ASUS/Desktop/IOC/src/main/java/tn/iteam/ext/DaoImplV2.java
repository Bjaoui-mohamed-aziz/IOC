package tn.iteam.ext;

import org.springframework.stereotype.Component;
import tn.iteam.dao.IDao;
@Component
public class DaoImplV2 implements IDao {
    @Override
    public double getValue() {
        System.out.println("web service");
        return 405;
    }
}
