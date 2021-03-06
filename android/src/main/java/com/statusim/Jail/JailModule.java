package com.statusim.Jail;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.github.status_im.status_go.Statusgo;


public class JailModule extends ReactContextBaseJavaModule {

    public JailModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "Jail";
    }

    @ReactMethod
    public void init(String js) {
        Statusgo.initJail(js);
    }

    @ReactMethod
    public void parse(String chatId, String js, Callback succ) {
        succ.invoke(Statusgo.parse(chatId, js));
    }

    @ReactMethod
    public void call(String chatId, String path, String params, Callback callback) {
        callback.invoke(Statusgo.call(chatId, path, params));
    }
}
