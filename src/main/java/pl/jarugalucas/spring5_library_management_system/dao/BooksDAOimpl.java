package pl.jarugalucas.spring5_library_management_system.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import pl.jarugalucas.spring5_library_management_system.entity.Book;

import java.util.List;

@Repository
public class BooksDAOimpl implements BooksDAO {

    private final SessionFactory sessionFactory;

    public BooksDAOimpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void saveOrUpdateBook(Book book) {

        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(book);
    }

    @Override
    public Book getBook(int id) {

        Session currentSession = sessionFactory.getCurrentSession();
        return currentSession.get(Book.class, id);
    }

    @Override
    public List<Book> getBooks() {

        Session currentSession = sessionFactory.getCurrentSession();
        Query<Book> books = currentSession.createQuery("from Book", Book.class);

        return books.getResultList();
    }

    @Override
    public void deleteBook(int id) {

        Session currentSession = sessionFactory.getCurrentSession();
        Book book = currentSession.get(Book.class, id);

        currentSession.delete(book);
    }
}