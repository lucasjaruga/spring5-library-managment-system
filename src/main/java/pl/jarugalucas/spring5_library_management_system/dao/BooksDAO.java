package pl.jarugalucas.spring5_library_management_system.dao;

import pl.jarugalucas.spring5_library_management_system.entity.Book;

import java.util.List;

public interface BooksDAO {

    public void saveOrUpdateBook(Book book);
    public Book getBook(int id);
    public List<Book> getBooks();
    public void deleteBook(int id);
}