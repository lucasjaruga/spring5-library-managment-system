package pl.jarugalucas.spring5_library_management_system.dao;

import pl.jarugalucas.spring5_library_management_system.entity.Reader;

import java.util.List;

public interface ReadersDAO {

    public void saveOrUpdateReader(Reader reader);
    public List<Reader> getReaders();
    public Reader getReader(int id);
    public void deleteReader(int id);
}