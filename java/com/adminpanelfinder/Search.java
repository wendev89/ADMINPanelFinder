package com.adminpanelfinder;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.ads.Ad;
import com.google.ads.AdListener;
import com.google.ads.AdRequest.ErrorCode;
import java.util.ArrayList;

public class Search extends Activity {
    private String ControlPageURL;
    private ArrayAdapter<String> adapter;
    private Handler handler;
    private TextView lblcount;
    private ArrayList<String> listItems;
    private ListView lv;
    private ProgressBar progress;
    private TextView textView1;
    private TextView textView3;

    /* renamed from: com.adminpanelfinder.Search$1 */
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
    public Search() {
        /*
        r0 = this;
        r0.<init>();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adminpanelfinder.Search.<init>():void");
    }

    /*  JADX ERROR: NullPointerException in pass: a
        java.lang.NullPointerException
        	at e.b.d.g.a.a.a(SourceFile:55)
        	at e.b.d.g.a.a.a(SourceFile:34)
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
    public boolean PageControl(java.lang.String r8) {
        /*
        r7 = this;
        r4 = 0;
        r2 = new java.net.URL;	 Catch:{ Exception -> 0x002c }
        r2.<init>(r8);	 Catch:{ Exception -> 0x002c }
        r3 = r2.openConnection();	 Catch:{ Exception -> 0x002c }
        r3 = (java.net.HttpURLConnection) r3;	 Catch:{ Exception -> 0x002c }
        r5 = "User-Agent";	 Catch:{ Exception -> 0x002c }
        r6 = "Android Application:45656";	 Catch:{ Exception -> 0x002c }
        r3.setRequestProperty(r5, r6);	 Catch:{ Exception -> 0x002c }
        r5 = "Connection";	 Catch:{ Exception -> 0x002c }
        r6 = "close";	 Catch:{ Exception -> 0x002c }
        r3.setRequestProperty(r5, r6);	 Catch:{ Exception -> 0x002c }
        r5 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ Exception -> 0x002c }
        r3.setConnectTimeout(r5);	 Catch:{ Exception -> 0x002c }
        r3.connect();	 Catch:{ Exception -> 0x002c }
        r0 = r3.getResponseCode();	 Catch:{ Exception -> 0x002c }
        r5 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r0 != r5) goto L_?;
    L_0x002a:
        r4 = 1;
    L_0x002b:
        return r4;
    L_0x002c:
        r1 = move-exception;
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adminpanelfinder.Search.PageControl(java.lang.String):boolean");
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
    public void PageFound(java.lang.String r4) {
        /*
        r3 = this;
        r0 = r3.lv;
        if (r0 != 0) goto L_0x0039;
    L_0x0004:
        r0 = r3.textView3;
        r1 = 0;
        r0.setVisibility(r1);
        r0 = new java.util.ArrayList;
        r0.<init>();
        r3.listItems = r0;
        r0 = new android.widget.ArrayAdapter;
        r1 = 17367043; // 0x1090003 float:2.5162934E-38 double:8.5804593E-317;
        r2 = r3.listItems;
        r0.<init>(r3, r1, r2);
        r3.adapter = r0;
        r0 = 2131165196; // 0x7f07000c float:1.7944602E38 double:1.052935509E-314;
        r0 = r3.findViewById(r0);
        r0 = (android.widget.ListView) r0;
        r3.lv = r0;
        r0 = r3.lv;
        r1 = r3.adapter;
        r0.setAdapter(r1);
        r0 = r3.lv;
        r1 = new com.adminpanelfinder.Search$3;
        r1.<init>();
        r0.setOnItemClickListener(r1);
    L_0x0039:
        r0 = r3.listItems;
        r0.add(r4);
        r0 = r3.adapter;
        r0.notifyDataSetChanged();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adminpanelfinder.Search.PageFound(java.lang.String):void");
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
    protected void onCreate(android.os.Bundle r8) {
        /*
        r7 = this;
        super.onCreate(r8);
        r5 = 2130903042; // 0x7f030002 float:1.741289E38 double:1.0528059877E-314;
        r7.setContentView(r5);
        r5 = 2131165191; // 0x7f070007 float:1.7944592E38 double:1.0529355065E-314;
        r3 = r7.findViewById(r5);
        r3 = (android.widget.LinearLayout) r3;
        r1 = new com.google.ads.AdView;
        r5 = com.google.ads.AdSize.BANNER;
        r6 = "a15015054c5b139";
        r1.<init>(r7, r5, r6);
        r5 = new com.adminpanelfinder.Search$1;
        r5.<init>(r3);
        r1.setAdListener(r5);
        r3.addView(r1);
        r4 = new com.google.ads.AdRequest;
        r4.<init>();
        r1.loadAd(r4);
        r5 = r7.getIntent();
        r2 = r5.getExtras();
        r5 = "Keyword";
        r0 = r2.getString(r5);
        r5 = 2131165193; // 0x7f070009 float:1.7944596E38 double:1.0529355075E-314;
        r5 = r7.findViewById(r5);
        r5 = (android.widget.ProgressBar) r5;
        r7.progress = r5;
        r5 = new android.os.Handler;
        r5.<init>();
        r7.handler = r5;
        r5 = 2131165194; // 0x7f07000a float:1.7944598E38 double:1.052935508E-314;
        r5 = r7.findViewById(r5);
        r5 = (android.widget.TextView) r5;
        r7.lblcount = r5;
        r5 = r7.lblcount;
        r6 = "";
        r5.setText(r6);
        r5 = 2131165192; // 0x7f070008 float:1.7944594E38 double:1.052935507E-314;
        r5 = r7.findViewById(r5);
        r5 = (android.widget.TextView) r5;
        r7.textView1 = r5;
        r5 = 2131165195; // 0x7f07000b float:1.79446E38 double:1.0529355085E-314;
        r5 = r7.findViewById(r5);
        r5 = (android.widget.TextView) r5;
        r7.textView3 = r5;
        r7.ControlPageURL = r0;
        r5 = r7.getCurrentFocus();
        r7.startProgress(r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adminpanelfinder.Search.onCreate(android.os.Bundle):void");
    }

    public void startProgress(View view) {
        new Thread(new Runnable() {

            /* renamed from: com.adminpanelfinder.Search$2$1 */
            class AnonymousClass1 implements Runnable {
                private final /* synthetic */ String[] val$asp;
                private final /* synthetic */ int val$count;
                private final /* synthetic */ int val$temp_count;
                private final /* synthetic */ boolean val$varmi;

                AnonymousClass1(String[] strArr, int i, int i2, boolean z) {
                    this.val$asp = strArr;
                    this.val$temp_count = i;
                    this.val$count = i2;
                    this.val$varmi = z;
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
                public void run() {
                    /*
                    r6 = this;
                    r2 = com.adminpanelfinder.Search.AnonymousClass2.this;
                    r2 = com.adminpanelfinder.Search.this;
                    r2 = r2.textView1;
                    r3 = new java.lang.StringBuilder;
                    r4 = "Scanning Url:\r\n";
                    r3.<init>(r4);
                    r4 = r6.val$asp;
                    r5 = r6.val$temp_count;
                    r4 = r4[r5];
                    r3 = r3.append(r4);
                    r3 = r3.toString();
                    r2.setText(r3);
                    r2 = r6.val$temp_count;
                    r1 = r2 * 100;
                    r2 = r6.val$temp_count;
                    if (r2 == 0) goto L_0x0050;
                L_0x002a:
                    r2 = r6.val$count;
                    r2 = r1 / r2;
                    r2 = r2 + 1;
                    r0 = java.lang.String.valueOf(r2);
                    r2 = com.adminpanelfinder.Search.AnonymousClass2.this;
                    r2 = com.adminpanelfinder.Search.this;
                    r2 = r2.lblcount;
                    r3 = new java.lang.StringBuilder;
                    r4 = "%";
                    r3.<init>(r4);
                    r3 = r3.append(r0);
                    r3 = r3.toString();
                    r2.setText(r3);
                L_0x0050:
                    r2 = r6.val$temp_count;
                    r2 = r2 + 1;
                    r3 = r6.val$count;
                    if (r2 != r3) goto L_0x009f;
                L_0x0058:
                    r2 = com.adminpanelfinder.Search.AnonymousClass2.this;
                    r2 = com.adminpanelfinder.Search.this;
                    r2 = r2.lblcount;
                    r3 = "Scan is Completed.";
                    r2.setText(r3);
                    r2 = com.adminpanelfinder.Search.AnonymousClass2.this;
                    r2 = com.adminpanelfinder.Search.this;
                    r2 = r2.textView1;
                    r3 = "";
                    r2.setText(r3);
                    r2 = com.adminpanelfinder.Search.AnonymousClass2.this;
                    r2 = com.adminpanelfinder.Search.this;
                    r2 = r2.progress;
                    r3 = 4;
                    r2.setVisibility(r3);
                    r2 = com.adminpanelfinder.Search.AnonymousClass2.this;
                    r2 = com.adminpanelfinder.Search.this;
                    r2 = r2.listItems;
                    if (r2 != 0) goto L_0x009f;
                L_0x0090:
                    r2 = com.adminpanelfinder.Search.AnonymousClass2.this;
                    r2 = com.adminpanelfinder.Search.this;
                    r2 = r2.lblcount;
                    r3 = "Scan is Completed.\r\n\r\n\r\nNot Found\r\nAdmin Panel Page";
                    r2.setText(r3);
                L_0x009f:
                    r2 = com.adminpanelfinder.Search.AnonymousClass2.this;
                    r2 = com.adminpanelfinder.Search.this;
                    r2 = r2.progress;
                    r3 = r6.val$temp_count;
                    r3 = r3 + 1;
                    r2.setProgress(r3);
                    r2 = r6.val$varmi;
                    if (r2 == 0) goto L_?;
                L_0x00b4:
                    r2 = com.adminpanelfinder.Search.AnonymousClass2.this;
                    r2 = com.adminpanelfinder.Search.this;
                    r3 = r6.val$asp;
                    r4 = r6.val$temp_count;
                    r3 = r3[r4];
                    r2.PageFound(r3);
                L_0x00c3:
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.adminpanelfinder.Search.2.1.run():void");
                }
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
            public void run() {
                /*
                r9 = this;
                r0 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
                r2 = new java.lang.String[r0];
                r0 = 0;
                r1 = "admin/";
                r2[r0] = r1;
                r0 = 1;
                r1 = "administrator/";
                r2[r0] = r1;
                r0 = 2;
                r1 = "admin1/";
                r2[r0] = r1;
                r0 = 3;
                r1 = "admin2/";
                r2[r0] = r1;
                r0 = 4;
                r1 = "admin3/";
                r2[r0] = r1;
                r0 = 5;
                r1 = "admin4/";
                r2[r0] = r1;
                r0 = 6;
                r1 = "admin5/";
                r2[r0] = r1;
                r0 = 7;
                r1 = "usuarios/";
                r2[r0] = r1;
                r0 = 8;
                r1 = "usuario/";
                r2[r0] = r1;
                r0 = 9;
                r1 = "administrator/";
                r2[r0] = r1;
                r0 = 10;
                r1 = "moderator/";
                r2[r0] = r1;
                r0 = 11;
                r1 = "webadmin/";
                r2[r0] = r1;
                r0 = 12;
                r1 = "adminarea/";
                r2[r0] = r1;
                r0 = 13;
                r1 = "bb-admin/";
                r2[r0] = r1;
                r0 = 14;
                r1 = "adminLogin/";
                r2[r0] = r1;
                r0 = 15;
                r1 = "admin_area/";
                r2[r0] = r1;
                r0 = 16;
                r1 = "panel-administracion/";
                r2[r0] = r1;
                r0 = 17;
                r1 = "instadmin/";
                r2[r0] = r1;
                r0 = 18;
                r1 = "memberadmin/";
                r2[r0] = r1;
                r0 = 19;
                r1 = "administratorlogin/";
                r2[r0] = r1;
                r0 = 20;
                r1 = "adm/";
                r2[r0] = r1;
                r0 = 21;
                r1 = "admin/account.php";
                r2[r0] = r1;
                r0 = 22;
                r1 = "admin/index.php";
                r2[r0] = r1;
                r0 = 23;
                r1 = "admin/login.php";
                r2[r0] = r1;
                r0 = 24;
                r1 = "admin/admin.php";
                r2[r0] = r1;
                r0 = 25;
                r1 = "admin/account.php";
                r2[r0] = r1;
                r0 = 26;
                r1 = "admin_area/admin.php";
                r2[r0] = r1;
                r0 = 27;
                r1 = "admin_area/login.php";
                r2[r0] = r1;
                r0 = 28;
                r1 = "siteadmin/login.php";
                r2[r0] = r1;
                r0 = 29;
                r1 = "siteadmin/index.php";
                r2[r0] = r1;
                r0 = 30;
                r1 = "siteadmin/login.html";
                r2[r0] = r1;
                r0 = 31;
                r1 = "admin/account.html";
                r2[r0] = r1;
                r0 = 32;
                r1 = "admin/index.html";
                r2[r0] = r1;
                r0 = 33;
                r1 = "admin/login.html";
                r2[r0] = r1;
                r0 = 34;
                r1 = "admin/admin.html";
                r2[r0] = r1;
                r0 = 35;
                r1 = "admin_area/index.php";
                r2[r0] = r1;
                r0 = 36;
                r1 = "bb-admin/index.php";
                r2[r0] = r1;
                r0 = 37;
                r1 = "bb-admin/login.php";
                r2[r0] = r1;
                r0 = 38;
                r1 = "bb-admin/admin.php";
                r2[r0] = r1;
                r0 = 39;
                r1 = "admin/home.php";
                r2[r0] = r1;
                r0 = 40;
                r1 = "admin_area/login.html";
                r2[r0] = r1;
                r0 = 41;
                r1 = "admin_area/index.html";
                r2[r0] = r1;
                r0 = 42;
                r1 = "admin/controlpanel.php";
                r2[r0] = r1;
                r0 = 43;
                r1 = "admin.php";
                r2[r0] = r1;
                r0 = 44;
                r1 = "admincp/index.asp";
                r2[r0] = r1;
                r0 = 45;
                r1 = "admincp/login.asp";
                r2[r0] = r1;
                r0 = 46;
                r1 = "admincp/index.html";
                r2[r0] = r1;
                r0 = 47;
                r1 = "admin/account.html";
                r2[r0] = r1;
                r0 = 48;
                r1 = "adminpanel.html";
                r2[r0] = r1;
                r0 = 49;
                r1 = "webadmin.html";
                r2[r0] = r1;
                r0 = 50;
                r1 = "webadmin/index.html";
                r2[r0] = r1;
                r0 = 51;
                r1 = "webadmin/admin.html";
                r2[r0] = r1;
                r0 = 52;
                r1 = "webadmin/login.html";
                r2[r0] = r1;
                r0 = 53;
                r1 = "admin/admin_login.html";
                r2[r0] = r1;
                r0 = 54;
                r1 = "admin_login.html";
                r2[r0] = r1;
                r0 = 55;
                r1 = "panel-administracion/login.html";
                r2[r0] = r1;
                r0 = 56;
                r1 = "admin/cp.php";
                r2[r0] = r1;
                r0 = 57;
                r1 = "cp.php";
                r2[r0] = r1;
                r0 = 58;
                r1 = "administrator/index.php";
                r2[r0] = r1;
                r0 = 59;
                r1 = "administrator/login.php";
                r2[r0] = r1;
                r0 = 60;
                r1 = "nsw/admin/login.php";
                r2[r0] = r1;
                r0 = 61;
                r1 = "webadmin/login.php";
                r2[r0] = r1;
                r0 = 62;
                r1 = "admin/admin_login.php";
                r2[r0] = r1;
                r0 = 63;
                r1 = "admin_login.php";
                r2[r0] = r1;
                r0 = 64;
                r1 = "administrator/account.php";
                r2[r0] = r1;
                r0 = 65;
                r1 = "administrator.php";
                r2[r0] = r1;
                r0 = 66;
                r1 = "admin_area/admin.html";
                r2[r0] = r1;
                r0 = 67;
                r1 = "pages/admin/admin-login.php";
                r2[r0] = r1;
                r0 = 68;
                r1 = "admin/admin-login.php";
                r2[r0] = r1;
                r0 = 69;
                r1 = "admin-login.php";
                r2[r0] = r1;
                r0 = 70;
                r1 = "bb-admin/index.html";
                r2[r0] = r1;
                r0 = 71;
                r1 = "bb-admin/login.html";
                r2[r0] = r1;
                r0 = 72;
                r1 = "acceso.php";
                r2[r0] = r1;
                r0 = 73;
                r1 = "bb-admin/admin.html";
                r2[r0] = r1;
                r0 = 74;
                r1 = "admin/home.html";
                r2[r0] = r1;
                r0 = 75;
                r1 = "login.php";
                r2[r0] = r1;
                r0 = 76;
                r1 = "modelsearch/login.php";
                r2[r0] = r1;
                r0 = 77;
                r1 = "moderator.php";
                r2[r0] = r1;
                r0 = 78;
                r1 = "moderator/login.php";
                r2[r0] = r1;
                r0 = 79;
                r1 = "moderator/admin.php";
                r2[r0] = r1;
                r0 = 80;
                r1 = "account.php";
                r2[r0] = r1;
                r0 = 81;
                r1 = "pages/admin/admin-login.html";
                r2[r0] = r1;
                r0 = 82;
                r1 = "admin/admin-login.html";
                r2[r0] = r1;
                r0 = 83;
                r1 = "admin-login.html";
                r2[r0] = r1;
                r0 = 84;
                r1 = "controlpanel.php";
                r2[r0] = r1;
                r0 = 85;
                r1 = "admincontrol.php";
                r2[r0] = r1;
                r0 = 86;
                r1 = "admin/adminLogin.html";
                r2[r0] = r1;
                r0 = 87;
                r1 = "adminLogin.html";
                r2[r0] = r1;
                r0 = 88;
                r1 = "admin/adminLogin.html";
                r2[r0] = r1;
                r0 = 89;
                r1 = "home.html";
                r2[r0] = r1;
                r0 = 90;
                r1 = "rcjakar/admin/login.php";
                r2[r0] = r1;
                r0 = 91;
                r1 = "adminarea/index.html";
                r2[r0] = r1;
                r0 = 92;
                r1 = "adminarea/admin.html";
                r2[r0] = r1;
                r0 = 93;
                r1 = "webadmin.php";
                r2[r0] = r1;
                r0 = 94;
                r1 = "webadmin/index.php";
                r2[r0] = r1;
                r0 = 95;
                r1 = "webadmin/admin.php";
                r2[r0] = r1;
                r0 = 96;
                r1 = "admin/controlpanel.html";
                r2[r0] = r1;
                r0 = 97;
                r1 = "admin.html";
                r2[r0] = r1;
                r0 = 98;
                r1 = "admin/cp.html";
                r2[r0] = r1;
                r0 = 99;
                r1 = "cp.html";
                r2[r0] = r1;
                r0 = 100;
                r1 = "adminpanel.php";
                r2[r0] = r1;
                r0 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
                r1 = "moderator.html";
                r2[r0] = r1;
                r0 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
                r1 = "administrator/index.html";
                r2[r0] = r1;
                r0 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
                r1 = "administrator/login.html";
                r2[r0] = r1;
                r0 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
                r1 = "user.html";
                r2[r0] = r1;
                r0 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
                r1 = "administrator/account.html";
                r2[r0] = r1;
                r0 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
                r1 = "administrator.html";
                r2[r0] = r1;
                r0 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
                r1 = "login.html";
                r2[r0] = r1;
                r0 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
                r1 = "modelsearch/login.html";
                r2[r0] = r1;
                r0 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
                r1 = "moderator/login.html";
                r2[r0] = r1;
                r0 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
                r1 = "adminarea/login.html";
                r2[r0] = r1;
                r0 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
                r1 = "panel-administracion/index.html";
                r2[r0] = r1;
                r0 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
                r1 = "panel-administracion/admin.html";
                r2[r0] = r1;
                r0 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
                r1 = "modelsearch/index.html";
                r2[r0] = r1;
                r0 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
                r1 = "modelsearch/admin.html";
                r2[r0] = r1;
                r0 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
                r1 = "admincontrol/login.html";
                r2[r0] = r1;
                r0 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
                r1 = "adm/index.html";
                r2[r0] = r1;
                r0 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
                r1 = "adm.html";
                r2[r0] = r1;
                r0 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
                r1 = "moderator/admin.html";
                r2[r0] = r1;
                r0 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
                r1 = "user.php";
                r2[r0] = r1;
                r0 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
                r1 = "account.html";
                r2[r0] = r1;
                r0 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
                r1 = "controlpanel.html";
                r2[r0] = r1;
                r0 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
                r1 = "admincontrol.html";
                r2[r0] = r1;
                r0 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
                r1 = "panel-administracion/login.php";
                r2[r0] = r1;
                r0 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
                r1 = "wp-login.php";
                r2[r0] = r1;
                r0 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
                r1 = "adminLogin.php";
                r2[r0] = r1;
                r0 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
                r1 = "admin/adminLogin.php";
                r2[r0] = r1;
                r0 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
                r1 = "home.php";
                r2[r0] = r1;
                r0 = 128; // 0x80 float:1.8E-43 double:6.3E-322;
                r1 = "admin.php";
                r2[r0] = r1;
                r0 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
                r1 = "adminarea/index.php";
                r2[r0] = r1;
                r0 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
                r1 = "adminarea/admin.php";
                r2[r0] = r1;
                r0 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
                r1 = "adminarea/login.php";
                r2[r0] = r1;
                r0 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
                r1 = "panel-administracion/index.php";
                r2[r0] = r1;
                r0 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
                r1 = "panel-administracion/admin.php";
                r2[r0] = r1;
                r0 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
                r1 = "modelsearch/index.php";
                r2[r0] = r1;
                r0 = 135; // 0x87 float:1.89E-43 double:6.67E-322;
                r1 = "modelsearch/admin.php";
                r2[r0] = r1;
                r0 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
                r1 = "admincontrol/login.php";
                r2[r0] = r1;
                r0 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
                r1 = "adm/admloginuser.php";
                r2[r0] = r1;
                r0 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
                r1 = "admloginuser.php";
                r2[r0] = r1;
                r0 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
                r1 = "admin2.php";
                r2[r0] = r1;
                r0 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
                r1 = "admin2/login.php";
                r2[r0] = r1;
                r0 = 141; // 0x8d float:1.98E-43 double:6.97E-322;
                r1 = "admin2/index.php";
                r2[r0] = r1;
                r0 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
                r1 = "usuarios/login.php";
                r2[r0] = r1;
                r0 = 143; // 0x8f float:2.0E-43 double:7.07E-322;
                r1 = "adm/index.php";
                r2[r0] = r1;
                r0 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
                r1 = "adm.php";
                r2[r0] = r1;
                r0 = 145; // 0x91 float:2.03E-43 double:7.16E-322;
                r1 = "affiliate.php";
                r2[r0] = r1;
                r0 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
                r1 = "adm_auth.php";
                r2[r0] = r1;
                r0 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
                r1 = "memberadmin.php";
                r2[r0] = r1;
                r0 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
                r1 = "administratorlogin.php";
                r2[r0] = r1;
                r0 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
                r1 = "wp-admin";
                r2[r0] = r1;
                r0 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
                r1 = "yonetici/";
                r2[r0] = r1;
                r0 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
                r1 = "yonetim/";
                r2[r0] = r1;
                r0 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
                r1 = "yonet";
                r2[r0] = r1;
                r0 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
                r1 = "kullanicilar/";
                r2[r0] = r1;
                r4 = r2.length;
                r0 = com.adminpanelfinder.Search.this;
                r0 = r0.progress;
                r0.setMax(r4);
                r6 = 0;
            L_0x03a3:
                r0 = r2.length;
                if (r6 < r0) goto L_0x03a7;
            L_0x03a6:
                return;
            L_0x03a7:
                r3 = r6;
                r0 = new java.lang.StringBuilder;
                r1 = com.adminpanelfinder.Search.this;
                r1 = r1.ControlPageURL;
                r1 = java.lang.String.valueOf(r1);
                r0.<init>(r1);
                r1 = "/";
                r0 = r0.append(r1);
                r1 = r2[r6];
                r0 = r0.append(r1);
                r7 = r0.toString();
                r0 = com.adminpanelfinder.Search.this;
                r5 = r0.PageControl(r7);
                r0 = com.adminpanelfinder.Search.this;
                r8 = r0.handler;
                r0 = new com.adminpanelfinder.Search$2$1;
                r1 = r9;
                r0.<init>(r2, r3, r4, r5);
                r8.post(r0);
                r6 = r6 + 1;
                goto L_0x03a3;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adminpanelfinder.Search.2.run():void");
            }
        }).start();
    }
}
