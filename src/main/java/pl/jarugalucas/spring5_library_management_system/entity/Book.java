package pl.jarugalucas.spring5_library_management_system.entity;

import java.util.List;

public class Book {

    private int id;
    private String title;
    private String publicationDate;
    private Integer availableAmount;

    private List<Author> authors;
}