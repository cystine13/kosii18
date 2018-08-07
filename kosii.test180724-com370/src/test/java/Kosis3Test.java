import java.io.UnsupportedEncodingException;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class Kosis3Test {

	@Test
	public void test() throws Exception {
		// fail("Not yet implemented");

		RestTemplate restTemplate = new RestTemplate();

		String result = restTemplate.getForObject(
				"http://kosis.kr/openapi/statisticsList.do?method=getList&apiKey=ZjZjOTI3MjRjNmU1YzdhZTMwOWRjNjgxN2MzNDgwNmY=&vwCd=MT_ZTITLE&parentListId=A&format=json",
				String.class);
		System.out.println(result);
		System.out.println(new String(result.getBytes("iso-8859-1"), "utf-8"));

		String originalStr = "Å×½ºÆ®"; // 테스트
		String[] charSet = { "utf-8", "euc-kr", "ksc5601", "iso-8859-1", "x-windows-949" };

		for (int i = 0; i < charSet.length; i++) {
			for (int j = 0; j < charSet.length; j++) {
				try {
					System.out.println("[" + charSet[i] + "," + charSet[j] + "] = "
							+ new String(originalStr.getBytes(charSet[i]), charSet[j]));
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
