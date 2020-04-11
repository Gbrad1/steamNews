package ZCW.steamNews.modules;

public class News {
    Long id;
    String news;

    public News(String news, Long id) {
        this.id = id;
        this.news = news;
    }
}
