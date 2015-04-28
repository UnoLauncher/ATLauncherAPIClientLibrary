package uk.jamierocks.atlauncher.test;

import uk.jamierocks.atlauncher.api.News;
import uk.jamierocks.atlauncher.api.Response;
import uk.jamierocks.atlauncher.api.objects.NewsObject;

/**
 * Created by jamie on 28/04/15.
 */
public class NewsTest {

    public static void main(String[] args) {
        Response<NewsObject[]> response = News.getNews();
        for (NewsObject news : response.getData()) {
            System.out.println(news.getTitle());
        }
    }
}
