package pl.jarugalucas.spring5_library_management_system.entity;

import java.util.List;

public class Reader {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;

    private List<Book> books;
}