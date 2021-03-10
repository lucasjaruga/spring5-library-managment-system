package pl.jarugalucas.spring5_library_management_system.services;

import org.springframework.stereotype.Service;
import pl.jarugalucas.spring5_library_management_system.dao.ReaderDAO;
import pl.jarugalucas.spring5_library_management_system.entity.Reader;

import javax.transaction.Transactional;

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
}