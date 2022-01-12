package repository.impl;

import model.Label;
import org.hibernate.Session;
import repository.LabelRepository;
import utils.HibernateUtil;

import java.util.List;

public class LabelRepositoryImpl implements LabelRepository {

    @Override
    public Label getById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Label.class, id);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Label insert(Label label) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(label);
            session.getTransaction().commit();
            return label;
        }
    }

    @Override
    public Label update(Label label) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.update(label);
            session.getTransaction().commit();
            return label;
        }
    }

    @Override
    public void delete(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            Label label = session.get(Label.class, id);
            session.delete(label);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Label> getAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Label").list();
        }
    }
}
