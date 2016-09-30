package aa.bb.c;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MessagePro implements commandInter{
	
	
	
	@Override
	public String showData(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 모델을 수행한후 결과를 얻엇다 가정
		request.setAttribute("data", "message수행");
		
		return "view1";//부파일명 변환
	}
}
