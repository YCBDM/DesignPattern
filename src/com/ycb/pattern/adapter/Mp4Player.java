package com.ycb.pattern.adapter;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/18 19:21
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String audioType, String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);

    }

    @Override
    public void playVlc(String audioType, String fileName) {
        //do Nothing
    }
}
