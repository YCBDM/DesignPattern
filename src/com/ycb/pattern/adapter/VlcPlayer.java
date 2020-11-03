package com.ycb.pattern.adapter;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/18 19:21
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String audioType, String fileName) {
        //do Nothing
    }

    @Override
    public void playVlc(String audioType, String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }
}
