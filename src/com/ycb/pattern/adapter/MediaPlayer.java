package com.ycb.pattern.adapter;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/18 19:17
 *
 * 步骤1：创建一个播放器接口
 */
public interface MediaPlayer {
    public void play(String audioType,String fileName);
}
