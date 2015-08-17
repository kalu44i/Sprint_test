package com.github.kalu44i.springdemo;

import com.github.kalu44i.dao.NewsItemDAO;
import com.github.kalu44i.dao.UserDAO;
import com.github.kalu44i.entity.NewsItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by NickVeremeichyk on 8/12/15.
 */
@Component
public class DatabaseWorker {
    @Autowired
    private UserDAO userDAO;

    @Autowired
    private NewsItemDAO newsItemDAO;

    public DatabaseWorker() {

    }

    public List getNewsItems() {
        return newsItemDAO.getAllNewsItems();
    }

    public void addNewsItems(List<NewsItem> list) {
        newsItemDAO.addNewsItems(list);
    }

}
