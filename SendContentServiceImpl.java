import java.text.SimpleDateFormat;
import java.util.Date;

//package cn.edu.bjtu.weibo.service.impl;
public class SendContentServiceImpl implements SendContentSevice{

	@Override
	public boolean sendWeiboOrComment(BaseContent weiboOrComment) {
		
		String content=weiboOrComment.getContent();
		Date date=new Date();
		SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
		String Now_date=sdf.format(date);
		return true;
	}

}
