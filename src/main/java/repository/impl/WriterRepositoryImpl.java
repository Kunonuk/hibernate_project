package repository.impl;

import model.Writer;
import org.hibernate.Session;
import repository.WriterRepository;
import utils.HibernateUtil;

import java.util.List;

public class WriterRepositoryImpl implements WriterRepository {

    @Override
    public Writer getById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Writer.class, id); // dont work
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Writer insert(Writer writer) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.saveOrUpdate(writer);
            session.getTransaction().commit();
            return writer;
        }
    }

    @Override
    public Writer update(Writer writer) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.saveOrUpdate(writer);
            session.getTransaction().commit();
            return writer;
        }
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Writer> getAll() {
        return null;
    }
}
