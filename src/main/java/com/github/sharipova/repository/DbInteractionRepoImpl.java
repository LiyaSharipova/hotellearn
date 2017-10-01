package com.github.sharipova.repository;

import com.github.sharipova.entity.FileEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by liya on 01.10.17.
 */

@Repository
public class DbInteractionRepoImpl implements DbInteractionRepo {
    @PersistenceContext
    private EntityManager entityManager;

    public String getSomeCellFromDb() {

        TypedQuery<FileEntity> query = entityManager.createQuery("select f from FileEntity as f", FileEntity.class);
        List<FileEntity> resultList = query.getResultList();
        return resultList.get(0).getName();
    }
}
