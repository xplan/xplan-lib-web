package com.xplan.apps.aplan.wyh.action;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;


/**
 * 
 *    
 * ImageAction   
 * 登录验证代码生成图片 
 * Chivalrous   
 * Chivalrous   
 * 2011-12-10 上午11:22:00   
 *    
 * @version 1.0.0   
 *
 */
public class ImageAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private Log log = LogFactory.getLog(ImageAction.class);

	/**
	 * 生成验证码图片
	 * Math.random()欺骗浏览器	
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public void generateImage() throws Exception {	
		HttpServletResponse response = ServletActionContext.getResponse();	
		@SuppressWarnings("rawtypes")
		Map session = ServletActionContext.getContext().getSession();
		ServletOutputStream out = response.getOutputStream();		
		response.setContentType("image/jpeg");
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);

		// 在内存中创建图象
		int width = 60, height = 18;
		BufferedImage image = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
		// 获取图形上下文
		Graphics g = image.getGraphics();
		// 生成随机类
		Random random = new Random();
		// 设定背景色
		g.setColor(getRandColor(200, 250));
		g.fillRect(0, 0, width, height);
		// 设定字体
		g.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		// 随机产生155条干扰线，使图象中的认证码不易被其它程序探测到
		g.setColor(getRandColor(160, 200));
		for (int i = 0; i < 155; i++) {
			int x = random.nextInt(width);
			int y = random.nextInt(height);
			int xl = random.nextInt(12);
			int yl = random.nextInt(12);
			g.drawLine(x, y, x + xl, y + yl);
		}
		// 取随机产生的认证码(4位数字)
		String sRand = "";
		for (int i = 0; i < 4; i++) {
			String rand = String.valueOf(random.nextInt(10));
			sRand += rand;
			// 将认证码显示到图象中
			g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));
			// 调用函数出来的颜色相同，可能是因为种子太接近，所以只能直接生成
			g.drawString(rand, 13 * i + 6, 16);
		}
		// 将认证码存入SESSION
		session.put("VerifyCode", sRand);
		// 图象生效
		g.dispose();
		// 输出图象到页面
		log.debug("生成验证码图片,输出图象到页面");
		ImageIO.write(image, "JPEG", out);
		if(null != out){
			out.close();
		}
	}	

	/**
	 * 给定范围获得随机颜色
	 */
	private Color getRandColor(int fc, int bc) {
		Random random = new Random();
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}
}