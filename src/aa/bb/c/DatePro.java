package aa.bb.c;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aa.bb.m.DateModel;

public class DatePro implements commandInter {

	@Override
	public String showData(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 모델을 수행한후 결과를 얻기
		DateModel model = new DateModel();
		ArrayList<String> list = model.getDate();
		request.setAttribute("data", list);
		return "view2";// 뷰파일명 변환
	}
}
