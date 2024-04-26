package tn.iteam.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class DaoImpl implements IDao {
    @Override

    public double getValue() {
        System.out.println("connection à la base de donnée");
        return 100;
    }
}
