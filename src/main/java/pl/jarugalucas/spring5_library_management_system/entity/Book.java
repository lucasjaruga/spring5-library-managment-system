package pl.jarugalucas.spring5_library_management_system.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name="authors")
    private String authors;
    @Column(name = "publication_date")
    private String publicationDate;
    @Column(name = "available_amount")
    private Integer availableAmount;

    /*@ManyToOne (fetch = FetchType.LAZY,
                cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn (name = "reader_id")
    private Reader reader;*/

    public Book () {
    }

    public Book(String title, String publicationDate, Integer availableAmount) {
        this.title = title;
        this.publicationDate = publicationDate;
        this.availableAmount = availableAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Integer getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(Integer availableAmount) {
        this.availableAmount = availableAmount;
    }

    /*public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }*/

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                ", availableAmount=" + availableAmount +
                '}';
    }
}