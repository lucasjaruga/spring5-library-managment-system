package pl.jarugalucas.spring5_library_management_system.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import pl.jarugalucas.spring5_library_management_system.entity.Reader;

import java.util.List;

@Repository
public class ReaderDAOimpl implements ReaderDAO {

    private final SessionFactory sessionFactory;

    public ReaderDAOimpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Reader> getReaders() {

        Session currentSession = sessionFactory.getCurrentSession();

        Query<Reader> query = currentSession.createQuery("from Reader", Reader.class);

        return query.getResultList();
    }

    @Override
    public Reader getReader(int id) {

        Session currentSession = sessionFactory.getCurrentSession();
        Reader reader = currentSession.get(Reader.class, id);
        return reader;
    }

    @Override
    public void saveReader(Reader reader) {

        // get the current Hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        // save reader
        currentSession.saveOrUpdate(reader);
    }

    @Override
    public void deleteReader(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Reader reader = currentSession.get(Reader.class, id);
        currentSession.delete(reader);
    }
}