package com.cinus.image;


import org.junit.Test;

import java.awt.image.BufferedImage;

import static org.junit.Assert.assertTrue;


public class ImgUtilsTest {

    @Test
    public void test_grayscale() throws Exception {
        BufferedImage img = ImgUtils.loadImage("src/test/java/com/cinus/image/test-data/test.jpg");
        BufferedImage bfi = ImgUtils.grayscale(img);
        boolean ret = ImgUtils.writeImage("src/test/java/com/cinus/image/test-data/test2.jpg", ImgUtils.IMAGE_TYPE_JPG, bfi);
        assertTrue(ret);
    }

    @Test
    public void test_dilation() throws Exception {
        BufferedImage img = ImgUtils.loadImage("src/test/java/com/cinus/image/test-data/test.jpg");
        BufferedImage bfi = ImgUtils.dilation(img, 10);
        boolean ret = ImgUtils.writeImage("src/test/java/com/cinus/image/test-data/test3.jpg", ImgUtils.IMAGE_TYPE_JPG, bfi);
        assertTrue(ret);
    }


}
