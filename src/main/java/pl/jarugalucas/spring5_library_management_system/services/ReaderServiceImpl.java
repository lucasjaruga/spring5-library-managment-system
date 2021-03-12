package pl.jarugalucas.spring5_library_management_system.services;

import org.springframework.stereotype.Service;
import pl.jarugalucas.spring5_library_management_system.dao.ReaderDAO;
import pl.jarugalucas.spring5_library_management_system.entity.Reader;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ReaderServiceImpl implements ReaderService {

    private final ReaderDAO readerDAO;

    public ReaderServiceImpl(ReaderDAO readerDAO) {
        this.readerDAO = readerDAO;
    }

    @Override
    @Transactional
    public void saveReader(Reader reader) {
        readerDAO.saveReader(reader);
    }

    @Override
    @Transactional
    public List<Reader> getReaders() {

        List<Reader> readers = readerDAO.getReaders();
        return readers;
    }

    @Override
    @Transactional
    public Reader getReader(int id) {
        Reader reader = readerDAO.getReader(id);
        return reader;
    }

    @Override
    @Transactional
    public void deleteReader(int id) {
        readerDAO.deleteReader(id);
    }
}