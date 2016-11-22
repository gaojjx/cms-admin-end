package diamond.cms.server;

import javax.annotation.Resource;

import org.junit.Test;

import diamond.cms.server.core.PageResult;
import diamond.cms.server.model.Article;
import diamond.cms.server.services.ArticleService;

public class ArticleServiceTest extends BaseTestCase{

    @Resource
    ArticleService articleService;

    @Test
    public void findTest(){
        PageResult<Article> article = articleService.page(new PageResult<Article>());
        article.getData().forEach(a -> {
            System.out.println(a.getCatalogName());
        });
    }
}
