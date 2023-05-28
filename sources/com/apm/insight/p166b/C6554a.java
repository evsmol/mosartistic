package com.apm.insight.p166b;

import android.app.ActivityManager;

/* renamed from: com.apm.insight.b.a */
public class C6554a {
    /* renamed from: a */
    static String m16006a(ActivityManager.ProcessErrorStateInfo processErrorStateInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("|------------- processErrorStateInfo--------------|\n");
        sb.append("condition: " + processErrorStateInfo.condition + "\n");
        sb.append("processName: " + processErrorStateInfo.processName + "\n");
        sb.append("pid: " + processErrorStateInfo.pid + "\n");
        sb.append("uid: " + processErrorStateInfo.uid + "\n");
        sb.append("tag: " + processErrorStateInfo.tag + "\n");
        sb.append("shortMsg : " + processErrorStateInfo.shortMsg + "\n");
        sb.append("longMsg : " + processErrorStateInfo.longMsg + "\n");
        sb.append("-----------------------end----------------------------");
        return sb.toString();
    }

    /* renamed from: a */
    static boolean m16007a(ActivityManager.ProcessErrorStateInfo processErrorStateInfo, ActivityManager.ProcessErrorStateInfo processErrorStateInfo2) {
        return String.valueOf(processErrorStateInfo.condition).equals(String.valueOf(processErrorStateInfo2.condition)) && String.valueOf(processErrorStateInfo.processName).equals(String.valueOf(processErrorStateInfo2.processName)) && String.valueOf(processErrorStateInfo.pid).equals(String.valueOf(processErrorStateInfo2.pid)) && String.valueOf(processErrorStateInfo.uid).equals(String.valueOf(processErrorStateInfo2.uid)) && String.valueOf(processErrorStateInfo.tag).equals(String.valueOf(processErrorStateInfo2.tag)) && String.valueOf(processErrorStateInfo.shortMsg).equals(String.valueOf(processErrorStateInfo2.shortMsg)) && String.valueOf(processErrorStateInfo.longMsg).equals(String.valueOf(processErrorStateInfo2.longMsg));
    }
}
