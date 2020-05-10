package com.royyan.radio.listeners;

public interface MediaRecorderStatusListener {
    void onMyRecorderStart();
    void onMyRecorderStop();
    void onMyRecorderError();
}
