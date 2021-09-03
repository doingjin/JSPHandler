package test;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
// Annotation
public class InitialMember implements ServletContextListener{
	// 강제성
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// Tomcat이 시작될 때 작동하는 메서드
		// DB data를 생성할 예정 -> Member.java
		
		ArrayList<Member> datas=new ArrayList<Member>();
		for(int i=1;i<5;i++) {
			Member data=new Member("timo"+i,"timo"+i+"@naver.com");
			datas.add(data);
		}
		
		datas.add(new Member("ari",null));
		datas.add(new Member("amumu",null));
		
		// 현재 만든 데이터들은 톰캣이 시작될 대 생성된 것들
		// scope: application에 저장하고 싶다!
		
		
		// 지금부터 저장하는 것들은 application scope로 저장됨!!!
		ServletContext context=sce.getServletContext();
		context.setAttribute("members", datas);
		context.setAttribute("member", new Member());
	}
	
}


