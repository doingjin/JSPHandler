package tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTagHandler extends SimpleTagSupport{
	
	private String fontsize;
	private String fontcolor;
	
	public void doTag() throws IOException, JspException {
		JspWriter out=getJspContext().getOut();
		StringBuffer sb=new StringBuffer();
		JspFragment body=getJspBody();
		if(body!=null) {
			sb.append("<p style='color:").append(fontcolor).append(";font-size:").append(fontsize).append(";'>");
			out.println(sb.toString());
			body.invoke(null);
			out.println("</p>");
		}
	}
	public String getFontsize() {
		return fontsize;
	}
	public void setFontsize(String fontsize) {
		this.fontsize = fontsize;
	}
	public String getFontcolor() {
		return fontcolor;
	}
	public void setFontcolor(String fontcolor) {
		this.fontcolor = fontcolor;
	}
}
