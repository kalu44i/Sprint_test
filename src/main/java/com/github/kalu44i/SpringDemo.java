package com.github.kalu44i;

import com.github.kalu44i.entity.NewsItem;
import com.github.kalu44i.springdemo.DatabaseWorker;
import org.hibernate.metamodel.relational.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by NickVeremeichyk on 8/12/15.
 */
@Configuration
@ComponentScan
public class SpringDemo {

    @Bean
    EntityManagerFactory entityManagerFactory() {
        return Persistence.createEntityManagerFactory("entityManager");
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringDemo.class);
        DatabaseWorker databaseWorker = context.getBean(DatabaseWorker.class);

        NewsItem newsItem_1 = new NewsItem("Hello world!", "link_1", "Desc_1", "Pub_date_1");
        NewsItem newsItem_2 = new NewsItem("Hello worlder mans!", "link_2", "Desc_2", "Pub_date_2");
        List<NewsItem> listToDB = new ArrayList<NewsItem>();
        listToDB.add(newsItem_1);
        listToDB.add(newsItem_2);
        databaseWorker.addNewsItems(listToDB);

        List list = databaseWorker.getNewsItems();
        for (Object aList : list) {
            NewsItem newsItem = (NewsItem) aList;
            System.out.println(newsItem.getId() + " " + newsItem.getDesc() + " " + newsItem.getLink() + " " + newsItem.getTitle());
        }

    }
}
