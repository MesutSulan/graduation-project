package com.kidsapp.childplay.interfaces;

public interface AdsCallback {

    void adLoadingFailed();

    void adClose();

    void startNextScreen();

    void onLoaded();
}