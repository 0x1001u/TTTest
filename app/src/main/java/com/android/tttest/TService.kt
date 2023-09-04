package com.android.tttest

import android.accessibilityservice.AccessibilityService
import android.util.Log
import android.view.accessibility.AccessibilityEvent

class TService: AccessibilityService(){
    val TAG = javaClass.simpleName
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        Log.d(TAG, "onAccessibilityEvent: $event")
    }

    override fun onInterrupt() {
        Log.d(TAG, "onInterrupt")
    }
}