package com.github.kalu44i.dao;

import com.github.kalu44i.entity.NewsItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by NickVeremeichyk on 8/10/15.
 */
@Component
public class NewsItemDAO {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    public NewsItemDAO() {

    }

    public List getAllNewsItems() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select news from NewsItem news");
        List itemsList  = query.getResultList();
        entityManager.close();

        return itemsList;
    }

    public void addNewsItems(List<NewsItem> list) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        for (NewsItem newsItem : list) {
            entityManager.persist(newsItem);
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
