package pl.jarugalucas.spring5_library_management_system.services;

import pl.jarugalucas.spring5_library_management_system.entity.Reader;

import java.util.List;

public interface ReaderService {

    public void saveReader(Reader reader);
    public List<Reader> getReaders();
}