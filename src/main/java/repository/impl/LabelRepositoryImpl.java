package repository.impl;

import model.Label;
import org.hibernate.Session;
import repository.LabelRepository;
import utils.HibernateUtil;

import java.util.List;

public class LabelRepositoryImpl implements LabelRepository {
    private Session session;

    @Override
    public Label getById(Long id) {
        Label label = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            label = session.load(Label.class, id);
            session.getTransaction().commit();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return label;
    }

    @Override
    public Label insert(Label label) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(label);
        session.getTransaction().commit();
        session.close();
        return label;
    }

    @Override
    public Label update(Label label) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Label> getAll() {
        return null;
    }
}
