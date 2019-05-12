package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ api.NewsApiFeedTest.class, api.NewsApiParserTest.class, article.ArticleTest.class })
public class AllTests {

}
