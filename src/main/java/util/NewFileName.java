package util;

import java.util.Date;

public class NewFileName {

	/* 파일명 변경(time) */
	public static String getNewFileName(String f) {
		String filename = "";
		String fpost = "";
		
		if(f.indexOf('.') >= 0) {	// 도트가 있을 때(확장자명이 있을때),
			fpost = f.substring(f.lastIndexOf('.'));	//확장자명 (.txt)
			filename = new Date().getTime() + fpost;
		}
		else {
			filename = new Date().getTime()+ ".back";	//임의의 확장자명을 붙여둠
		}
		
		return filename;
	}
	
}
