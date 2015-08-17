package com.github.kalu44i.entity;

import javax.persistence.*;

/**
 * Created by NickVeremeichyk on 8/1/15.
 */
@Entity
@Table(name="news_item")
public class NewsItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="item_id")
    private long id;

    @Column(name="title")
    private String title;

    @Column(name="link")
    private String link;

    @Column(name="description")
    private String desc;

    @Column(name="pub_date")
    private String pubDate;

    public NewsItem() {}

    public NewsItem(String title, String link, String desc, String pubDate) {
        this.title = title;
        this.link = link;
        this.desc = desc;
        this.pubDate = pubDate;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }
}
