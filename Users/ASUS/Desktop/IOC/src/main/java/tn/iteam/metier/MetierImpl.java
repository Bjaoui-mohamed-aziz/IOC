package tn.iteam.metier;
import tn.iteam.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tn/iteam/metier")
public class MetierImpl implements IMetier{

    @Autowired
    private IDao dao;

    @Override
    public double calcul() {
        double nb=dao.getValue();
        return 23*nb;
    }

    public void setDao(IDao idao) {
        this.dao = idao;
    }
}
