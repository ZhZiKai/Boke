import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {   
public static void main(String[] args) {
	int count = 0;
	  String regEx = "[\\u4e00-\\u9fa5]";
	  // System.out.println(regEx);
	  String str = "Internet ���� is ��� very  good ^_^!";
	  // System.out.println(str);
	  Pattern p = Pattern.compile(regEx);
	  Matcher m = p.matcher(str);
	  System.out.print("��ȡ�����������У�");
	  while (m.find()) {
	   System.out.print(m.group(0));
	   break;
	  }
	  System.out.println();
	  System.out.println(p.matches(regEx, "��"));
	  System.out.println(p.matches(regEx, "a"));
}


	
}  
