package net.java.sip.communicator.plugin.vlcj;

import uk.co.caprica.vlcj.player.MediaPlayer;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;

/**
 * Created by frank on 10/3/14.
 */
public class VlcjMediaPlayerController {


    private volatile boolean initialized = false;

    //TODO: is mediaPlayer thread safe?
    private volatile MediaPlayer mediaPlayer = null;

    public void initialize(){
        VlcjPlayer vlcjPlayer = new VlcjPlayer();
        mediaPlayer = vlcjPlayer.getMediaPlayer();
        initialized = true;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public void pause() {
        if (mediaPlayer == null) return;
        mediaPlayer.pause();
    }
}
