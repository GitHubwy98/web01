package com.cn.hp;


import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "BuffImageServlet")
public class BuffImageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedImage bd = new BufferedImage(80, 40, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = bd.getGraphics();
        Color color = new Color(125, 210, 233);
        graphics.setColor(color);
        graphics.fillRect(0, 0, 80, 40);
        String str = "123456789abcdefghijklnm";
        Random rd = new Random();
        for (int i = 0; i < 4; i++) {

        }


    }

    void s() {

        //缓存图片
        BufferedImage img = new BufferedImage(80, 40, BufferedImage.TYPE_INT_RGB);
        //绘图对象
        Graphics graphics = img.getGraphics();
        Color color = new Color(123, 255, 54);
        //设置颜色
        graphics.setColor(color);

        graphics.fillRect(0, 0, 80, 40);

        String str = "123456789abcdefg";
        Random rd = new Random();

        for (int i = 0; i < 4; i++) {
            Color color1 = new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255));
            graphics.setColor(color1);
            int s = i * 20 + 5;
            char c = str.charAt(rd.nextInt(str.length()));

            graphics.drawString(Character.toString(c), i * 20 + 5, 22);


        }
        String strs = "----------";
        graphics.drawString(strs, 2, 22);
        //ImageIO.write(img,"png",response.getOutputStream());
    }
}
