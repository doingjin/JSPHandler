package tag;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TesttagHandeler extends SimpleTagSupport {
	
	// 실제 태그의 기능을 정의하는 메서드
	// 시작태그를 만나면 자동호출됨
	public void doTag() throws IOException {
		// JSP로부터 정보를 받아올 수 있게 하는 메서드
		// getOut() : 가장 많이 쓰는 메서드 / out객체를 참조할 때 사용
		
		JspWriter out=getJspContext().getOut();
		out.println("tag handler class기반 실습 중!");
	
	}
	
}
