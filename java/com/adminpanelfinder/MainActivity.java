package com.adminpanelfinder;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.google.ads.Ad;
import com.google.ads.AdListener;
import com.google.ads.AdRequest.ErrorCode;

public class MainActivity extends Activity {

    /* renamed from: com.adminpanelfinder.MainActivity$1 */
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

    /* renamed from: com.adminpanelfinder.MainActivity$2 */
    class AnonymousClass2 implements OnClickListener {
        private final /* synthetic */ EditText val$searchKeyword;

        AnonymousClass2(EditText editText) {
            this.val$searchKeyword = editText;
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
            	at e.b.d.g.i.b(SourceFile:14)
            	at e.b.d.g.j.accept(Unknown Source)
            	at d.b.a.c.l.f.a(SourceFile:85)
            	at e.b.d.g.i.a(SourceFile:14)
            	at e.b.b.a(SourceFile:33)
            	at e.a.d.a(SourceFile:402)
            	at e.a.f.a(SourceFile:62)
            	at e.a.d.a(SourceFile:296)
            	at e.a.e.run(Unknown Source)
            */
        public void onClick(android.view.View r10) {
            /*
            r9 = this;
            r6 = com.adminpanelfinder.MainActivity.this;
            r7 = 2131165187; // 0x7f070003 float:1.7944584E38 double:1.0529355045E-314;
            r4 = r6.findViewById(r7);
            r4 = (android.widget.Spinner) r4;
            r5 = r4.getSelectedItem();
            r6 = com.adminpanelfinder.MainActivity.this;
            r6 = r6.getApplication();
            r0 = com.adminpanelfinder.MyLib.InternetConnectionCheck(r6);
            if (r0 == 0) goto L_0x0056;
        L_0x001b:
            r6 = new java.lang.StringBuilder;
            r7 = r5.toString();
            r7 = java.lang.String.valueOf(r7);
            r6.<init>(r7);
            r7 = r9.val$searchKeyword;
            r7 = r7.getText();
            r7 = r7.toString();
            r6 = r6.append(r7);
            r2 = r6.toString();
            r1 = new android.os.Bundle;
            r1.<init>();
            r6 = "Keyword";
            r1.putString(r6, r2);
            r3 = new android.content.Intent;
            r6 = com.adminpanelfinder.MainActivity.this;
            r7 = com.adminpanelfinder.Search.class;
            r3.<init>(r6, r7);
            r3.putExtras(r1);
            r6 = com.adminpanelfinder.MainActivity.this;
            r6.startActivity(r3);
        L_0x0055:
            return;
        L_0x0056:
            r6 = com.adminpanelfinder.MainActivity.this;
            r6 = r6.getApplicationContext();
            r7 = "No Internet Connection";
            r8 = 1;
            r6 = android.widget.Toast.makeText(r6, r7, r8);
            r6.show();
            goto L_0x0055;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adminpanelfinder.MainActivity.2.onClick(android.view.View):void");
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
    public MainActivity() {
        /*
        r0 = this;
        r0.<init>();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adminpanelfinder.MainActivity.<init>():void");
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
    public void onCreate(android.os.Bundle r11) {
        /*
        r10 = this;
        super.onCreate(r11);
        r8 = 2130903041; // 0x7f030001 float:1.7412889E38 double:1.052805987E-314;
        r10.setContentView(r8);
        r8 = 2131165191; // 0x7f070007 float:1.7944592E38 double:1.0529355065E-314;
        r4 = r10.findViewById(r8);
        r4 = (android.widget.LinearLayout) r4;
        r1 = new com.google.ads.AdView;
        r8 = com.google.ads.AdSize.BANNER;
        r9 = "a15015054c5b139";
        r1.<init>(r10, r8, r9);
        r8 = new com.adminpanelfinder.MainActivity$1;
        r8.<init>(r4);
        r1.setAdListener(r8);
        r4.addView(r1);
        r5 = new com.google.ads.AdRequest;
        r5.<init>();
        r1.loadAd(r5);
        r8 = 2131165188; // 0x7f070004 float:1.7944586E38 double:1.052935505E-314;
        r6 = r10.findViewById(r8);
        r6 = (android.widget.EditText) r6;
        r8 = 2131165187; // 0x7f070003 float:1.7944584E38 double:1.0529355045E-314;
        r0 = r10.findViewById(r8);
        r0 = (android.widget.Spinner) r0;
        r8 = 2;
        r7 = new java.lang.String[r8];
        r8 = 0;
        r9 = "http://";
        r7[r8] = r9;
        r8 = 1;
        r9 = "https://";
        r7[r8] = r9;
        r2 = new android.widget.ArrayAdapter;
        r8 = 17367048; // 0x1090008 float:2.5162948E-38 double:8.580462E-317;
        r2.<init>(r10, r8, r7);
        r8 = 17367049; // 0x1090009 float:2.516295E-38 double:8.5804623E-317;
        r2.setDropDownViewResource(r8);
        r0.setAdapter(r2);
        r8 = 2131165190; // 0x7f070006 float:1.794459E38 double:1.052935506E-314;
        r3 = r10.findViewById(r8);
        r3 = (android.widget.Button) r3;
        r8 = new com.adminpanelfinder.MainActivity$2;
        r8.<init>(r6);
        r3.setOnClickListener(r8);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adminpanelfinder.MainActivity.onCreate(android.os.Bundle):void");
    }
}
