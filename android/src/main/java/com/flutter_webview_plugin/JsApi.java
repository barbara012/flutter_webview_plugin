package com.flutter_webview_plugin;

public class JsApi{
    //同步API
    @JavascriptInterface
    public String sendOrder(Object list)  {
        Map<String, Object> data = new HashMap<>();
        data.put("data", list);
        FlutterWebviewPlugin.channel.invokeMethod("orderChanged", data);
    }

    //异步API
    @JavascriptInterface
    public void testAsyn(Object msg, CompletionHandler<String> handler) {
        handler.complete(msg+" [ asyn call]");
    }
}