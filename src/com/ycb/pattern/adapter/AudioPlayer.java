package com.ycb.pattern.adapter;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/18 19:31
 *
 * 步骤 4
 * 创建实现了 MediaPlayer 接口的实体类
 */
public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if(audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")){
            MediaAdapter mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }
    }
}

