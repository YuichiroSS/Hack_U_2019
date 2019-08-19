import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.StringBuilder;

/**
 * HttpURLConnectionのサンプル
 */
class Sample {

	void runSample() {

//		String strUrl = "http://httpbin.org/get";
		String strUrl = "http://httpbin.org/post";
		HttpURLConnection  urlConn = null;
		InputStream in = null;
		BufferedReader reader = null;

		try {
			//接続するURLを指定する
			URL url = new URL(strUrl);
			
			//コネクションを取得する
			urlConn = (HttpURLConnection) url.openConnection();
			
			//urlConn.setRequestMethod("GET");
			urlConn.setRequestMethod("POST");

			urlConn.connect();
			
			int status = urlConn.getResponseCode();
			
			System.out.println("HTTPステータス:" + status);
			
		    if (status == HttpURLConnection.HTTP_OK) {

				in = urlConn.getInputStream();
				
		    	reader = new BufferedReader(new InputStreamReader(in));
		    	
				StringBuilder output = new StringBuilder();
				String line;

				while ((line = reader.readLine()) != null) {
					output.append(line);
				}
				System.out.println(output.toString());
		      }
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (urlConn != null) {
					urlConn.disconnect();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Test1 {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.runSample();
	}
}