package pl.jarugalucas.spring5_library_management_system.services;

import org.springframework.stereotype.Service;
import pl.jarugalucas.spring5_library_management_system.dao.ReadersDAO;
import pl.jarugalucas.spring5_library_management_system.entity.Reader;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ReadersServiceImpl implements ReadersService {

    private final ReadersDAO readersDAO;

    public ReadersServiceImpl(ReadersDAO readersDAO) {
        this.readersDAO = readersDAO;
    }

    @Override
    @Transactional
    public void saveOrUpdateReader(Reader reader) {
        readersDAO.saveOrUpdateReader(reader);
    }

    @Override
    @Transactional
    public List<Reader> getReaders() {

        List<Reader> readers = readersDAO.getReaders();
        return readers;
    }

    @Override
    @Transactional
    public Reader getReader(int id) {
        Reader reader = readersDAO.getReader(id);
        return reader;
    }

    @Override
    @Transactional
    public void deleteReader(int id) {
        readersDAO.deleteReader(id);
    }
}