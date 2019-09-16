package com.adminpanelfinder;

import android.app.Activity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.google.ads.Ad;
import com.google.ads.AdListener;
import com.google.ads.AdRequest.ErrorCode;

public class WebViewActivity extends Activity {

    /* renamed from: com.adminpanelfinder.WebViewActivity$1 */
    class AnonymousClass1 implements AdListener {
        private final /* synthetic */ LinearLayout val$layout;

        AnonymousClass1(LinearLayout linearLayout) {
            this.val$layout = linearLayout;
        }

        public void onDismissScreen(Ad arg0) {
        }

        public void onFailedToReceiveAd(Ad arg0, ErrorCode arg1) {
        }

        public void onLeaveApplication(Ad arg0) {
        }

        public void onPresentScreen(Ad arg0) {
        }

        public void onReceiveAd(Ad arg0) {
            this.val$layout.setLayoutParams(new LayoutParams(-1, -2));
        }
    }

    private class HelloWebViewClient extends WebViewClient {
        private HelloWebViewClient() {
        }

        /* synthetic */ HelloWebViewClient(WebViewActivity webViewActivity, HelloWebViewClient helloWebViewClient) {
            this();
        }

        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: u
        java.lang.NullPointerException
        	at e.b.d.g.b.u$a.a(SourceFile:119)
        	at e.b.d.g.b.u$a.a(SourceFile:92)
        	at e.b.d.g.b.u$a.a(SourceFile:52)
        	at e.b.d.g.b.w.a(SourceFile:23)
        	at e.b.d.g.b.f.b(SourceFile:54)
        	at e.b.d.g.b.f.a(SourceFile:58)
        	at e.b.d.g.b.g.accept(Unknown Source)
        	at d.b.a.c.l.f.a(SourceFile:85)
        	at e.b.d.g.b.f.b(SourceFile:58)
        	at e.b.d.g.b.f.a(SourceFile:19)
        	at e.b.d.g.b.u.a(SourceFile:30)
        	at e.b.d.g.i.a(SourceFile:28)
        	at e.b.d.g.i.b(SourceFile:15)
        	at e.b.d.g.k.accept(Unknown Source)
        	at d.b.a.c.l.f.a(SourceFile:85)
        	at e.b.d.g.i.a(SourceFile:15)
        	at e.b.b.a(SourceFile:33)
        	at e.a.d.a(SourceFile:402)
        	at e.a.f.a(SourceFile:62)
        	at e.a.d.a(SourceFile:296)
        	at e.a.e.run(Unknown Source)
        */
    public WebViewActivity() {
        /*
        r0 = this;
        r0.<init>();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adminpanelfinder.WebViewActivity.<init>():void");
    }

    /*  JADX ERROR: NullPointerException in pass: a
        java.lang.NullPointerException
        	at e.b.d.g.a.a.b(SourceFile:129)
        	at e.b.d.g.a.a.a(SourceFile:43)
        	at e.b.d.g.i.a(SourceFile:28)
        	at e.b.d.g.i.b(SourceFile:15)
        	at e.b.d.g.k.accept(Unknown Source)
        	at d.b.a.c.l.f.a(SourceFile:85)
        	at e.b.d.g.i.a(SourceFile:15)
        	at e.b.b.a(SourceFile:33)
        	at e.a.d.a(SourceFile:402)
        	at e.a.f.a(SourceFile:62)
        	at e.a.d.a(SourceFile:296)
        	at e.a.e.run(Unknown Source)
        */
    public void onCreate(android.os.Bundle r10) {
        /*
        r9 = this;
        super.onCreate(r10);
        r7 = 2130903043; // 0x7f030003 float:1.7412893E38 double:1.052805988E-314;
        r9.setContentView(r7);
        r7 = 2131165191; // 0x7f070007 float:1.7944592E38 double:1.0529355065E-314;
        r4 = r9.findViewById(r7);
        r4 = (android.widget.LinearLayout) r4;
        r1 = new com.google.ads.AdView;
        r7 = com.google.ads.AdSize.BANNER;
        r8 = "a15015054c5b139";
        r1.<init>(r9, r7, r8);
        r7 = new com.adminpanelfinder.WebViewActivity$1;
        r7.<init>(r4);
        r1.setAdListener(r7);
        r4.addView(r1);
        r5 = new com.google.ads.AdRequest;
        r5.<init>();
        r1.loadAd(r5);
        r7 = r9.getIntent();
        r3 = r7.getExtras();
        r7 = "AdminPanelUrl";
        r0 = r3.getString(r7);
        r7 = 2131165197; // 0x7f07000d float:1.7944604E38 double:1.0529355095E-314;
        r2 = r9.findViewById(r7);
        r2 = (android.widget.TextView) r2;
        r2.setText(r0);
        r7 = 2131165198; // 0x7f07000e float:1.7944606E38 double:1.05293551E-314;
        r6 = r9.findViewById(r7);
        r6 = (android.webkit.WebView) r6;
        r7 = r6.getSettings();
        r8 = 1;
        r7.setJavaScriptEnabled(r8);
        r7 = new com.adminpanelfinder.WebViewActivity$HelloWebViewClient;
        r8 = 0;
        r7.<init>(r9, r8);
        r6.setWebViewClient(r7);
        r6.loadUrl(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adminpanelfinder.WebViewActivity.onCreate(android.os.Bundle):void");
    }
}
