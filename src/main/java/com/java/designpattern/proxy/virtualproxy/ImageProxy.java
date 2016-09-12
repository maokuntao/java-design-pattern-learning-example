package com.java.designpattern.proxy.virtualproxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * 图片代理，负责根据URL去加载图片
 *
 * @author taomk 2016年9月12日 下午8:57:08
 */
public class ImageProxy implements Icon {

	// 加载后显示的真正的图像
	ImageIcon imageIcon;
	// 图像URL
	URL imageURL;
	// 检索图像线程
	Thread retrievalThread;
	// 是否已经加载图像
	boolean retrieving = false;

	public ImageProxy(URL url) {
		imageURL = url;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		if (imageIcon != null) {
			// 当imageIcon对象非空时，说明当前imageIcon对象已经下载下来，此时显示图片
			imageIcon.paintIcon(c, g, x, y);
		} else {
			g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
			if (!retrieving) {
				retrieving = true;
				// 创建一个新的线程来获取图像，即异步方式（asynchronous）
				retrievalThread = new Thread(new Runnable() {
					public void run() {
						try {
							// 当图像加载完毕之后，才会返回imageIcon对象
							imageIcon = new ImageIcon(imageURL, "CD Cover");
							// 当上一步的图像加载完成之后，告诉swing去重新绘制面板
							c.repaint();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				retrievalThread.start();
			}
		}
	}

	@Override
	public int getIconWidth() {
		if (imageIcon != null) {
			return imageIcon.getIconWidth();
		} else {
			return 800;
		}
	}

	@Override
	public int getIconHeight() {
		if (imageIcon != null) {
			return imageIcon.getIconHeight();
		} else {
			return 600;
		}
	}

}
