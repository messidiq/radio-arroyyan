package com.royyan.radio.listeners;

public interface MediaRecorderListener {
    void onRecordingStart();
    void onRecordingStop();
    void onRecordingError();
}
