package pl.jarugalucas.spring5_library_management_system.services;

import org.springframework.stereotype.Service;
import pl.jarugalucas.spring5_library_management_system.dao.BooksDAO;
import pl.jarugalucas.spring5_library_management_system.entity.Book;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {

    private final BooksDAO booksDAO;

    public BooksServiceImpl(BooksDAO booksDAO) {
        this.booksDAO = booksDAO;
    }

    @Override
    @Transactional
    public void saveOrUpdateBook(Book book) {
        booksDAO.saveOrUpdateBook(book);
    }

    @Override
    @Transactional
    public Book getBook(int id) {
        return booksDAO.getBook(id);
    }

    @Override
    @Transactional
    public List<Book> getBooks() {
        return booksDAO.getBooks();
    }

    @Override
    @Transactional
    public void deleteBook(int id) {
        booksDAO.deleteBook(id);
    }
}