package pl.jarugalucas.spring5_library_management_system.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import pl.jarugalucas.spring5_library_management_system.entity.Reader;

@Repository
public class ReaderDAOimpl implements ReaderDAO {

    private final SessionFactory sessionFactory;

    public ReaderDAOimpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void saveReader(Reader reader) {

        // get the current Hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        // save reader
        currentSession.save(reader);
    }
}