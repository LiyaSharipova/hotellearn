package com.github.sharipova.service;

import com.github.sharipova.repository.DbInteractionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liya on 01.10.17.
 */

@Service
public class DbInteractionServiceImpl implements DbInteractionService {
    @Autowired
    private DbInteractionRepo repo;

    public String getSomeCellFromDb() {
        return repo.getSomeCellFromDb();
    }
}
