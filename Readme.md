apk_dex_shell



一个演示如何给Apk加壳的示例代码.

- DexReinforcingTools 
  - 给Apk加壳的工具, 可以用java或者cpp或者任何其他语言写成.
- MyApk 
  - 需要加固的Apk
- ShellingMyApk 
  - 脱壳Apk, 实际安装到用户手机上的是该Apk, 其在Application的 attachBaseContext 时会解压得到实际的apk文件, 然后运行实际的Apk