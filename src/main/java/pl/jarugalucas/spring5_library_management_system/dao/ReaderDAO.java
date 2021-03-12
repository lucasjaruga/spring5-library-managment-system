package pl.jarugalucas.spring5_library_management_system.dao;

import pl.jarugalucas.spring5_library_management_system.entity.Reader;

import java.util.List;

public interface ReaderDAO {

    public void saveReader(Reader reader);
    public List<Reader> getReaders();

}