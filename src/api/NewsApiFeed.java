package api;

import java.util.HashMap;

/*
 * Used tutorials:
 * https://newsapi.org/docs/get-started
 * https://www.baeldung.com/java-http-request API
 */

/**
 * 
 * @author drewes
 *
 */
public class NewsApiFeed extends AbstractNewsApiFeed {

	public static final String SRC = "https://newsapi.org/v2/top-headlines";
	public static final String APIKEY = "d224452ffac44d43b34c5757e92f8f23";

	public NewsApiFeed() {
		parameters = new HashMap<>();
		setParameter("apiKey", APIKEY);
		setParameter("country", "nl");
	}

}
