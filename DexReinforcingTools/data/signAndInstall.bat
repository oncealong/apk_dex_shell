java -jar .\sign\signapk.jar .\sign\testkey.x509.pem .\sign\testkey.pk8 shelling_new.apk shelling_new.sig.apk
adb install shelling_new.sig.apk
adb shell am start -n com.example.reforceapk/com.example.myapk.MainActivity