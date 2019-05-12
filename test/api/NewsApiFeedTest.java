package api;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NewsApiFeedTest {

	private NewsApiFeed feed;

	@Before
	public void setUp() throws Exception {
		feed = new NewsApiFeed();
		feed.setParameter("q", "Apeldoorn");
		feed.setUrl();
	}

	@Test
	public void testUrl() {
		// TODO: finish test
		Assert.assertEquals("", feed.getUrl());
	}

	@Test
	public void testRequest() {
		Assert.assertNotNull(feed.request());
	}

}
