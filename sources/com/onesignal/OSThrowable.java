package com.onesignal;

class OSThrowable {

    static class OSMainThreadException extends RuntimeException {
        public OSMainThreadException(String str) {
            super(str);
        }
    }
}
