package cz.sosjh.web.model;

import java.time.LocalDateTime;

public class BlogEntry {

    private Integer id;
    private String title;
    private String author;
    private LocalDateTime created;
    private String content;

    public BlogEntry() {}

    public BlogEntry(String title, String author, LocalDateTime created, String content) {
        this.title = title;
        this.author = author;
        this.created = created;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
