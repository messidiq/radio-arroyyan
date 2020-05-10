package com.royyan.radio.listeners;

public interface PlayerListener {
    void onStartPlaying();
    void onPlayerPause();
    void onPlayerStop();
    void onPlayerError();
}
