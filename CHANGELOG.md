6.0.1
==

## Bug Fixes

- [Arabic and Kurdish characters show as gibberish in console.log() (#1302)](https://github.com/NativeScript/android-runtime/issues/1302)
- [IntentService extending fails at runtime when service is started (#1426)](https://github.com/NativeScript/android-runtime/issues/1426)
- [SBG may fail when parsing big JS files (#1430)](https://github.com/NativeScript/android-runtime/issues/1430)
- [Upgrade android gradle plugin to the latest 3.4.2 version (#1425)](https://github.com/NativeScript/android-runtime/issues/1425)



6.0.0
==

## Breaking Changes

- Exception information in onDiscarderError and onUnhandledError is changed so that `message` contains the exception message and `stackTrace` contains only the stackTrace. In the previous implementation `stackTrace` contained some additional details (including the exception message) and the `message` was something like:

    ```
    The application crashed because of an uncaught exception. You can look at "stackTrace" or "nativeException" for more detailed information about the exception.
    ```

- [The built-in `JSON.stringify` method is used for cross workers communication](https://github.com/NativeScript/android-runtime/issues/1408). Circular object references are no longer supported and attempting to send such object will throw an exception.


## What's New

- [Use the built-in JSON.stringify for cross workers communication (#1411)](https://github.com/NativeScript/android-runtime/pull/1411)
- [Enable AndroidX and Jetifier(#1370)](https://github.com/NativeScript/android-runtime/issues/1370)
- [Upgrade v8 to 7.5.288.22(#1387)](https://github.com/NativeScript/android-runtime/issues/1387)
- [Upgrade android gradle plugin to the latest 3.4.1 version(#1390)](https://github.com/NativeScript/android-runtime/issues/1390)
- [Remove printStackTrace method calls from the source code(#1359)](https://github.com/NativeScript/android-runtime/issues/1359)

## Bug Fixes

- [Improve package.json parsing in SBG (#1407)](https://github.com/NativeScript/android-runtime/pull/1407)
- [Improve error message in SBG class parsing (#1401)](https://github.com/NativeScript/android-runtime/pull/1401)
- [java.lang.NullPointerException in Metadata generator(#13795)](https://github.com/NativeScript/android-runtime/issues/1379)
- [Buffer() is deprecated(#1392)](https://github.com/NativeScript/android-runtime/pull/1392)
- [Warnings when building android(#1396)](https://github.com/NativeScript/android-runtime/issues/1396)
- [No JS stack on discardedError and unhandledError(#1354)](https://github.com/NativeScript/android-runtime/issues/1354)


5.4.0
==

## What's New

- [Upgrade v8 to 7.4.288.25(#1356)](https://github.com/NativeScript/android-runtime/issues/1356)
- [Upgrade the android gradle plugin to the latest 3.4.0 version(#1360)](https://github.com/NativeScript/android-runtime/issues/1360)
- [Enable V8 symbols using from application's package.json file(#1368)](https://github.com/NativeScript/android-runtime/issues/1368)

## Bug Fixes

- [HashMaps improvements - fix for "Attempt to use cleared object reference"(#1345)](https://github.com/NativeScript/android-runtime/issues/1345)
- [Unable to start Service when the application process is killed by the OS(#1347)](https://github.com/NativeScript/android-runtime/pull/1347)
- [gradlew not compatible with sh(#1349)](https://github.com/NativeScript/android-runtime/issues/1349)
- [Memory leak in global.postMessage(#1358)](https://github.com/NativeScript/android-runtime/issues/1358)
- [memory leak java <-> javascript when java returns [] array(#1363)](https://github.com/NativeScript/android-runtime/issues/1363)
- [Bug when reifying some generic classes in the SBG(#1372)](https://github.com/NativeScript/android-runtime/issues/1372)
- [Extending an Android service fails if `onCreate` hasn't been overridden()](https://github.com/NativeScript/android-runtime/issues/1373)

5.3.1
==
## Bug Fixes
 - [5.3 build failing (Android) (#1329)](https://github.com/NativeScript/android-runtime/issues/1329)
 - [fix(build): Correct dependencies of `cleanupAllJars` gradle task (#1338)](https://github.com/NativeScript/android-runtime/pull/1338)

5.3.0
==

## What's New
 - [Upgrade v8 to 7.3.492.25(#1301)](https://github.com/NativeScript/android-runtime/issues/1301)
 - [Upgrade the android gradle plugin to the latest 3.3.2 version(#1304)](https://github.com/NativeScript/android-runtime/issues/1304)
 - [Fail SBG when there's no sbg-bindings.txt file generated(#1286)](https://github.com/NativeScript/android-runtime/issues/1286)
 - [Enable arm64-v8 in app.gradle(#1284)](https://github.com/NativeScript/android-runtime/issues/1284)
 - [Support external buildscript configurations(#1279)](https://github.com/NativeScript/android-runtime/issues/1279)
 - [Refactor SBG to support generics and proper handling of overridable methods(#1322)](https://github.com/NativeScript/android-runtime/issues/1322)

## Bug Fixes
 - [The minSdk version should not be declared in the android manifest file(#1316)](https://github.com/NativeScript/android-runtime/issues/1316)
 - ["Unable to resolve dependency" error when runtime is not build (#1309)](https://github.com/NativeScript/android-runtime/issues/1309)
 - [App crashes after tns debug android --debug-brk and trying to debug with "Step into/over"(#892)](https://github.com/NativeScript/android-runtime/issues/892)
 - [Unable to call plugin's native code if application has been build before adding the plugin(#1293)](https://github.com/NativeScript/android-runtime/issues/1293)
 - [Android build fails when tns-core-modules is updated(#1257)](https://github.com/NativeScript/android-runtime/issues/1257)
 - [Generate better code(#689)](https://github.com/NativeScript/android-runtime/issues/689)

5.2.1
==

## Bug Fixes
 - [Breakpoint stop to hit when you have two open tabs and close one(#1247)](https://github.com/NativeScript/android-runtime/issues/1247)

5.2.0
==

## What's New
 - [Upgrade v8 to 7.1.302.32(#1237)](https://github.com/NativeScript/android-runtime/issues/1237)
 - [Add OnDiscardedError handler(#1245)](https://github.com/NativeScript/android-runtime/issues/1245)
 - [Upgrade the android gradle plugin to the latest 3.3.1 version(#1251)](https://github.com/NativeScript/android-runtime/issues/1251)
 - [Add android X support(#1226)](https://github.com/NativeScript/android-runtime/issues/1226)
 - [Provide a JS helper function on the global object to release the native object wrapped by a JS instance(#1254)](https://github.com/NativeScript/android-runtime/issues/1254)

## Bug Fixes

 - [ClassNotFound exception when calling nested static class with correct argument(#1195)](https://github.com/NativeScript/android-runtime/issues/1195)
 - [If you refresh or close the chrome dev tools window an error will be log in the console (#1202)](https://github.com/NativeScript/android-runtime/issues/1202)
 - [Debug on Android fails when stopped on breakpoint and change in .xml/.css/.html is applied(#1243)](https://github.com/NativeScript/android-runtime/issues/1243)
 - [Upgrade V8 to v7 to fix unstable sort() method(#1176)](https://github.com/NativeScript/android-runtime/issues/1176)
 - [CodeCache option is broken since Android Runtime 4.1.0(#1235)](https://github.com/NativeScript/android-runtime/issues/1235)
 - [Snapshots with ABI splits do not work since Android Runtime 4.1.0(#1234)](https://github.com/NativeScript/android-runtime/issues/1234)

5.1.0
==

## What's New
 - [Add a setting to wrap calls to CallJSMethod in try catch(#1223)](https://github.com/NativeScript/android-runtime/issues/1223)
 - [Support for abstract interface with static methods(#1157)](https://github.com/NativeScript/android-runtime/issues/1157)
 - [Use gradle plugin 3.2.1 instead of 3.2.0(#1209)](https://github.com/NativeScript/android-runtime/pull/1209)
 - [Add a concrete exception when the runtime cannot be found(#1201)](https://github.com/NativeScript/android-runtime/pull/1201)

## Bug Fixes

 - [__extends not working as expected for non native inheritance(#1181)](https://github.com/NativeScript/android-runtime/issues/1181)

5.0.0
==

## What's New
 - [Upgrade v8 to 6.9.427.23(#1168)](https://github.com/NativeScript/android-runtime/issues/1168)
 - [Added support for before-plugins.gradle file applied before plugin(#1183)](https://github.com/NativeScript/android-runtime/pull/1185)
 - [Make JSParser in SBG fail the build when failing(#1152)](https://github.com/NativeScript/android-runtime/issues/1152)
 - [Generate interface names list in SBG in parallel(#1132)](https://github.com/NativeScript/android-runtime/issues/1132)
 - [Upgrade android gradle plugin to 3.2.0(#1147)](https://github.com/NativeScript/android-runtime/issues/1147)

## Bug Fixes

 - [Static Binding Generator fails if class has static properties that are used within the class(#1160)](https://github.com/NativeScript/android-runtime/issues/1160)
 - [Fixing NoClassDefFoundError when using older API(#1164)](https://github.com/NativeScript/android-runtime/pull/1164)

4.2.0
==

## What's New
 - [Upgrade v8 to 6.7.288.46(#1130)](https://github.com/NativeScript/android-runtime/issues/1130)
 - [Static binding generator now uses bundled npm packages(#1096)](https://github.com/NativeScript/android-runtime/issues/1096)
 - [Add gradle dependencies versions in package.json(#1102)](https://github.com/NativeScript/android-runtime/issues/1102)
 - [Introduce a setting for auto catching exceptions when calling JS method native(#1119)](https://github.com/NativeScript/android-runtime/issues/1119)
 - [Make livesync work entirely through named sockets(#932)](https://github.com/NativeScript/android-runtime/issues/932)

## Bug Fixes

 - [Unable to increase minSdk version by modifying AndroidManifest.xml(#1104)](https://github.com/NativeScript/android-runtime/issues/1104)
 - [UTF8 symbols in inspector protocol are not properly encoded(#1116)](https://github.com/NativeScript/android-runtime/issues/1116)
 - [ChromeDevTools: If you close the socket the app will crash on the device/emulator(#1122)](https://github.com/NativeScript/android-runtime/issues/1122)
 - [App tries to write in /data/local/tmp(#828)](https://github.com/NativeScript/android-runtime/issues/828)
 - [Rewrite livesync implementation(#929)](https://github.com/NativeScript/android-runtime/pull/929)

4.1.3
==

## Bug Fixes

 - Use google repository as primary gradle repository

4.1.2
==

## Bug Fixes

 - [Webview Crash With Android 8.1.0 / Chromium 67.0.3396.68 (#1075)](https://github.com/NativeScript/android-runtime/issues/1075)

4.1.1
==

## What's New

 - [Add support for java.nio.HeapByteBuffer to ArrayBuffer conversion(#1060)](https://github.com/NativeScript/android-runtime/issues/1060)
 - [Upgrade Gradle version (wrapper and plugin) to latest(#1054)](https://github.com/NativeScript/android-runtime/issues/1054)
 - [Accessing Native Packages starting with 'in'(#1046)](https://github.com/NativeScript/android-runtime/issues/1046)
 - [tns-android 4.0.1: undefined objects are dumped with console.log making the log unreadable(#1026)](https://github.com/NativeScript/android-runtime/issues/1026)
 - [Support new gradle dependency configuration(#993)](https://github.com/NativeScript/android-runtime/issues/993)
 - [new Date() does not work as expected after time zone change(#961)](https://github.com/NativeScript/android-runtime/issues/961)
 - [Update V8 to latest stable version(#808)](https://github.com/NativeScript/android-runtime/issues/808)
 - [Checking if java class implements java interface(#739)](https://github.com/NativeScript/android-runtime/issues/739)
 - [How to disable console.logs in release builds(#1024)](https://github.com/NativeScript/android-runtime/issues/1024)

## Bug Fixes

 - [Calling java method with incorrect params crashes with a JNI exception (#844)](https://github.com/NativeScript/android-runtime/issues/844)
 - [Chrome DevTools: App crashes after adding new view element(#1051)](https://github.com/NativeScript/android-runtime/issues/1051)
 - [Extraneous classes generated by SBG are not cleaned on rebuild(#904)](https://github.com/NativeScript/android-runtime/issues/904)
 - [Source files have different roots, while using debug command(896)](https://github.com/NativeScript/android-runtime/issues/896)

4.0.1
==

## Bug Fixes

 - [App crash on startup on Android 4.4](https://github.com/NativeScript/android-runtime/issues/999)

4.0.0
==

## Breaking Changes

 - [Rewrite the build script routine to no longer use flavors as the primary mechanism to apply nativescript plugin Android configurations (#890)](https://github.com/NativeScript/android-runtime/issues/890) - **If you see the `All flavors must now belong to a named flavor dimension.` build error, ensure that you are using the latest CLI. Plugins will be built implicitly by the CLI, version 4.0.0-rc or newer.**
 - [Application package outputs are now located at `platforms/android/app/build/outputs/<build-type>/<flavor - if any>/app-<build-type>.apk` (#938)](https://github.com/NativeScript/android-runtime/issues/938)

## What's New

 - [Respect `.jar` and `.aar` libraries from `App_Resources/Android/libs` (#899)](https://github.com/NativeScript/android-runtime/issues/899)
 - [Add user-defined Android project files - `.java`, resources, assets in `App_Resources/Android` (#700)](https://github.com/NativeScript/android-runtime/issues/700) - **Enabled after updating the App_Resources/Android subdirectory structure. Use `tns resources update android` with CLI 4.0.0-rc or newer.**
 - [Console API improvements - file name, line, column support in Chrome DevTools; Objects are expanded to JSON representations (#894) (#884)](https://github.com/NativeScript/android-runtime/pull/894) - **Replaces the console API in the `tns-core-modules`.**
 - [Update Gradle to 4.1 and Android plugin for Gradle to 3.0.1 (#938)](https://github.com/NativeScript/android-runtime/issues/938)

## Bug Fixes

 - [fix: static binding generator creating wrong files, when two extended classes have the same name (#692)](https://github.com/NativeScript/android-runtime/issues/692)

3.4.2
==

## Bug Fixes

 - [fix include gradle flavor generation for plugins with incomplete include.gradle scripts (#937)](https://github.com/NativeScript/android-runtime/pull/937)

3.4.1
==

## Bug Fixes

 - [Want help to access webview document height and cookies (#5243)](https://github.com/NativeScript/NativeScript/issues/5243)
 - [Question about plugin using native lib NS 3.4 (#5254)](https://github.com/NativeScript/NativeScript/issues/5254)

3.4.0
==

## What's New

 - [Android Studio Integration (#876)](https://github.com/NativeScript/android-runtime/issues/876)

## Bug Fixes

 - [Faulty Java class name when extending a class inside a file containing dots (#761)](https://github.com/NativeScript/android-runtime/issues/761)

3.3.1
==

## Bug Fixes

 - [app.gradle applies before other plugin gradle scripts (#878)](https://github.com/NativeScript/android-runtime/issues/878)

3.3.0
==

## Bug Fixes

 - [Provide better error message while parsing js files (#833)](https://github.com/NativeScript/android-runtime/issues/833)
 - [Improve JavaScript Metadata generation (#832)](https://github.com/NativeScript/android-runtime/issues/832)
 - [Improve Error handling incorrectly implementing Java interface (#836)](https://github.com/NativeScript/android-runtime/issues/836)

3.2.0
==

## Bug Fixes

 - [Static binding generator fails when using Webpack + Workers (#778)](https://github.com/NativeScript/android-runtime/issues/778)

3.1.1
==

## Bug Fixes
 - [APKS with ABI split crash on start up (#785)](https://github.com/NativeScript/android-runtime/issues/785)

3.1.0
==

## What's New
 - [Chrome DevTools Elements Tab Support (#746)](https://github.com/NativeScript/android-runtime/issues/746)

3.0.1
==

## Bug Fixes

 - [--debug-brk flag not working (#2741)](https://github.com/NativeScript/nativescript-cli/issues/2741)
 - [Clean app between different versions of application package. Ensure Android 6's AutoBackup feature doesn't restore files for NS apps](https://github.com/NativeScript/android-runtime/pull/771#issue-232247925)

3.0.0
==

## What's New

 - [Chrome DevTools Network Domain (#715)](https://github.com/NativeScript/android-runtime/issues/715)
 - [Chrome DevTools Scope Tab (#713)](https://github.com/NativeScript/android-runtime/issues/713)
 - [Enabling java source code or direct dex generation #663)](https://github.com/NativeScript/android-runtime/issues/663)
 - [Improve Gradle incremental build (#562)](https://github.com/NativeScript/android-runtime/issues/562)


## Bug Fixes

 - [Javascript array not marshalling to Java long[] properly  (#696)](https://github.com/NativeScript/android-runtime/issues/696)

2.5.0-RC
==

## What's New

 - [Error when running on real android device (#628)](https://github.com/NativeScript/android-runtime/issues/628)
 - [Updating v8 to 5.4/5.5 #631)](https://github.com/NativeScript/android-runtime/issues/631)

## Bug Fixes

 - [Can't use npm packages ending with ".js" (#666)](https://github.com/NativeScript/android-runtime/issues/666)
 - [Static binding generator crash build-time: clazz is null causes app to crash (#665)](https://github.com/NativeScript/android-runtime/issues/665)
 - [Decorators aren't respected when extending classes with TypeScript 2.1.4+   (#651)](https://github.com/NativeScript/android-runtime/issues/651)
 - [Samples SDK app crashes (#632)](https://github.com/NativeScript/android-runtime/issues/632)
 - [Missing stack trace on worker errors (#629)](https://github.com/NativeScript/android-runtime/issues/629)
 - [Classes using fields from compileSdk > Platform Sdk on device cause crash when extended in TS (#626)](https://github.com/NativeScript/android-runtime/issues/626)
 - [A failure building in debug and release in series (#649)](https://github.com/NativeScript/android-runtime/issues/649)

2.4.0
==

## What's New

 - [Update the V8 JavaScript Engine to 5.2.361 (97% ES6 support)](http://v8project.blogspot.bg/2016/06/release-52.html)
 - [[Experimental] Generate typings for android.jar and android support libs (--androidTypings) (#605)](https://github.com/NativeScript/android-runtime/pull/605)
 - [[Experimental] Multithreading support enabled with Web Workers API (#532)](https://github.com/NativeScript/android-runtime/issues/532)
 - [Enable enableProguardInReleaseBuilds in build.gradle (#567)](https://github.com/NativeScript/android-runtime/issues/567)
 - [Optimized default apk size (#529)](https://github.com/NativeScript/android-runtime/issues/529)
 - [Improved debug Error Activity (#293)](https://github.com/NativeScript/android-runtime/issues/293)

## Bug Fixes

 - [Build for armv7 and x86 only by default (#614)](https://github.com/NativeScript/android-runtime/issues/614)
 - [Make javascript parsing during build incremental (#572)](https://github.com/NativeScript/android-runtime/issues/572)
 - [App won't launch on Android 22 device (#592)](https://github.com/NativeScript/android-runtime/issues/592)
 - [Metadata isn't created for generated dex files (#552)](https://github.com/NativeScript/android-runtime/issues/552)
 - [App doesn't load with the new custom Application\Activity support (#546)](https://github.com/NativeScript/android-runtime/issues/546)

## Performance

 - [Enable enableProguardInReleaseBuilds in build.gradle (#567)](https://github.com/NativeScript/android-runtime/issues/567)
 - [Optimize default apk size  (#529)](https://github.com/NativeScript/android-runtime/issues/529)

2.3.0
==

## What's New

 - [Extend is not working as previous versions in all cases. (#514)](https://github.com/NativeScript/android-runtime/issues/514)
 - [JS: Binding: Run-time error occured in file: undefined at line: undefined and column: undefined (#443)](https://github.com/NativeScript/android-runtime/issues/443)

## Bug Fixes

 - [Crash when invoking a second (different) signature of an overloaded method (meta generator cache?) (#555)](https://github.com/NativeScript/android-runtime/issues/555)
 - [App crashes when set undefined to reference type field (#306)](https://github.com/NativeScript/android-runtime/issues/306)

2.2.0
==

## What's New

 - [Classes can implement multiple interfaces (#501)](https://github.com/NativeScript/android-runtime/pull/501)

## Performance

 - [Update gradle wrapper version to 2.10, and gradle plugin to 2.1.2 (#516)](https://github.com/NativeScript/android-runtime/pull/516)

2.1
==

## What's New

 - [Implement custom gradle clean (#459)](https://github.com/NativeScript/android-runtime/issues/459)

## Bug Fixes

 - [App crash (#476)](https://github.com/NativeScript/android-runtime/issues/476)
 - [The static binding generator should clean redundant files (#467)](https://github.com/NativeScript/android-runtime/issues/467)
 - [Android builds fail on nativescript 2.0  (#460)](https://github.com/NativeScript/android-runtime/issues/460)
 - [Need to add a Gradle Android.defaultConfig (#454)](https://github.com/NativeScript/android-runtime/issues/454)

## Performance

 - [Initial builds of ng2 apps are slow (#436)](https://github.com/NativeScript/android-runtime/issues/436)

2.0.0
==

## What's New

 - [Android N early developer preview (#378)](https://github.com/NativeScript/android-runtime/issues/378)
 - [[Proposal] Static binding generator specification. (#363)](https://github.com/NativeScript/android-runtime/issues/363)
 - [Android Runtime Support for older Android versions (#357)](https://github.com/NativeScript/android-runtime/issues/357)
 - [Data Marshalling: Support for typed arrays (#65)](https://github.com/NativeScript/android-runtime/issues/65)
 - [Support Android Widgets](https://github.com/NativeScript/android-runtime/issues/69)
 - [Add support for caching already compiled JS code](https://github.com/NativeScript/android-runtime/issues/257)
 - [Additional Intents Crashes app](https://github.com/NativeScript/android-runtime/issues/218)
 - [Enable Multidex support](https://github.com/NativeScript/android-runtime/issues/344)

## Bug Fixes

 - [Wrong object lifecycle management (#382)](https://github.com/NativeScript/android-runtime/issues/382)
 - [CLI can easily fail and blow project up on windows when you have multiple plugins. (#369)](https://github.com/NativeScript/android-runtime/issues/369)
 - [Provide method implementations for partially implemented interfaces. (#259)](https://github.com/NativeScript/android-runtime/issues/259)
 - [Generate metadata for protected interfaces (#236)](https://github.com/NativeScript/android-runtime/issues/236)
 - [Cannot resolve method/constructor signatures when null is passed (#90)](https://github.com/NativeScript/android-runtime/issues/90)
 - [App seems to load up with a white screen on run, but works in debug mode #397](https://github.com/NativeScript/android-runtime/issues/397)

## Performance

 - [Wrong object lifecycle management (#382)](https://github.com/NativeScript/android-runtime/issues/382)

1.7.1
==

## Bug Fixes

 - [Fix application initialization](https://github.com/NativeScript/android-runtime/issues/396)
 - [Fix error activity](https://github.com/NativeScript/android-runtime/issues/395)

1.7.0
==

## What's New
 - [Extendind Application and Activity classes](https://github.com/NativeScript/android-runtime/issues/226)
 - Gradle script improvements

## Bug Fixes

 - [App crashes with "NativeScriptApplication already initialized"](https://github.com/NativeScript/android-runtime/issues/362)
 - [Upgrade to Gradle 1.5.0](https://github.com/NativeScript/android-runtime/issues/375)


1.6.0
==

## What's New

 - [Build common test infrastructure for Android and iOS](https://github.com/NativeScript/android-runtime/issues/68)
 - [New syntax for Java arrays](https://github.com/NativeScript/android-runtime/issues/70)
 - [Improved debugger](https://github.com/NativeScript/android-runtime/issues/112)
 - [Log in the debugger console](https://github.com/NativeScript/android-runtime/issues/145)
 - [Update documentation](https://github.com/NativeScript/android-runtime/issues/290)
 - [Provide support for ARMv8a](https://github.com/NativeScript/android-runtime/issues/297)
 - [Imroved exception handling](https://github.com/NativeScript/android-runtime/issues/300)
 - Gradle script improvements

## Bug Fixes

 - [Fix app crash during debugging (#270)](https://github.com/NativeScript/android-runtime/issues/270)
 - [Fix app hang during array marshalling](https://github.com/NativeScript/android-runtime/issues/320)
 - [Fix incorrect module resolution](https://github.com/NativeScript/android-runtime/issues/334)
 - [Fix app crash during debugging (#338)](https://github.com/NativeScript/android-runtime/issues/338)

1.5.1
==

## What's New

 - [Enable requiring of JSON files (like in Node) (#217)](https://github.com/NativeScript/android-runtime/issues/217)
 - [Revisit the "assert" routine in the JNI part (#221)](https://github.com/NativeScript/android-runtime/issues/221)
 - [Android CallStack  (#228)](https://github.com/NativeScript/android-runtime/issues/228)
 - [error handling introducing c++ exceptions (#277)](https://github.com/NativeScript/android-runtime/pull/277)
 - [Simplify require errors (#287)](https://github.com/NativeScript/android-runtime/issues/287)
 - [Experimental: Support native modules (#291)](https://github.com/NativeScript/android-runtime/issues/291)
 - Gradle script improvements

## Bug Fixes

 - [Print meaningful error when metadata generator fails to reflect a class (#245)](https://github.com/NativeScript/android-runtime/issues/245)

1.5.0
==

## What's New

 - Improved LiveSync
 - [Improved error handling](https://github.com/NativeScript/android-runtime/issues/221)
 - Use Gradle Wrapper
 - Use V8 code cache (experimental)

 ## Bug Fixes

 - Proper handling of HTTP 401 status code
 - [Generate metadata for protected interfaces](https://github.com/NativeScript/android-runtime/issues/236)
 - [Fix loading module with NULL char in it](https://github.com/NativeScript/android-runtime/issues/271)

1.4.0
==

## Bug Fixes

 - [Generated metadata is not updated after initial build until after 'gradle clean' is called (#227)](https://github.com/NativeScript/android-runtime/issues/227)
 - [Incorrect behavior when getting or setting java fields from javascript (#219)](https://github.com/NativeScript/android-runtime/issues/219)
 - [Better handling of package.json main configuration (#190)](https://github.com/NativeScript/android-runtime/issues/190)
 - [Calling non existen ctor crashesh the runtime (#180)](https://github.com/NativeScript/android-runtime/issues/180)
 - [ClassCastException when tries to convert numeric return value of overridden methods (#139)](https://github.com/NativeScript/android-runtime/issues/139)

1.3.0
==

## What's New

 - [Expose public API for NativeScript Companion App for deleting old *.dex files (#187)](https://github.com/NativeScript/android-runtime/issues/187)
 - [Add support for AppBuilder LiveSync (#186)](https://github.com/NativeScript/android-runtime/issues/186)
 - [Create a new template project for Gradle build (#182)](https://github.com/NativeScript/android-runtime/issues/182)
 - [Support ~ path syntax in require (#177)](https://github.com/NativeScript/android-runtime/issues/177)
 - [Enable using the Google Design library (and alike) with "library add" command (#140)](https://github.com/NativeScript/android-runtime/issues/140)
 - [Implement support for CLI live sync feature (#137)](https://github.com/NativeScript/android-runtime/issues/137)
 - [Ahead-of-time generation of binding proxies (#103)](https://github.com/NativeScript/android-runtime/issues/103)
 - [Use pool of arrays for marshalling (#33)](https://github.com/NativeScript/android-runtime/issues/33)

## Bug Fixes

 - [Run after LiveSync starts the last synced app on the device/emulator (#214)](https://github.com/NativeScript/android-runtime/issues/214)
 - [Cannot load module with relative path on Android 6 (#206)](https://github.com/NativeScript/android-runtime/issues/206)
 - [App crashes when call overloaded method of a base class (#203)](https://github.com/NativeScript/android-runtime/issues/203)
 - [Fix file is external to application error on Android M (#185)](https://github.com/NativeScript/android-runtime/issues/185)
 - [App crash during GC (#184)](https://github.com/NativeScript/android-runtime/issues/184)
 - [JNI reference leaks when passing JavaScript arrays (#167)](https://github.com/NativeScript/android-runtime/issues/167)
 - [ArrayBuffer broken (#164)](https://github.com/NativeScript/android-runtime/issues/164)
 - [ClassCastException when tries to convert numeric return value of overridden methods (#139)](https://github.com/NativeScript/android-runtime/issues/139)
 - [Allow debugger reconnects (#136)](https://github.com/NativeScript/android-runtime/issues/136)
 - [__onUncaughtError is not called. (#108)](https://github.com/NativeScript/android-runtime/issues/108)

## Performance

 - [Cache parsed method signature (#181)](https://github.com/NativeScript/android-runtime/issues/181)
 - [Use pool of arrays for marshalling (#33)](https://github.com/NativeScript/android-runtime/issues/33)

# Android Runtime Changelog

1.2.1
==

## What's New

 - Updated android widgets library
 - [Allow verbose logging system property to enable debug messages early in engine bootstrap](https://github.com/NativeScript/android-runtime/issues/111)

## Bug Fixes

 - [Additional null checks in V8 to handle certain possible garbage collection issues](https://github.com/NativeScript/android-runtime/issues/111)
 - Fix sync support in runtime for specific (Samsung) Android devices where run-as is not working
 - [Fix JNI memory leak](https://github.com/NativeScript/android-runtime/issues/167)
 - Fix copy of correct android.jar referenced in project properties


1.2.0
==

## What's New

 - [Support http cookies in build-in http client (#159)](https://github.com/NativeScript/android-runtime/issues/159)
 - [Implement support for CLI live sync feature (#137)](https://github.com/NativeScript/android-runtime/issues/137)
 - [Rethink 0 day support for new android versions (#86)](https://github.com/NativeScript/android-runtime/issues/86)

## Bug Fixes

 - [Fix ErrorActivity not displayed on uncaught exceptions (#158)](https://github.com/NativeScript/android-runtime/issues/158)
 - [Fix JNI memory leak when resolving classes in metadata reader (#157)](https://github.com/NativeScript/android-runtime/issues/157)
 - [Application crash with JNI ERROR (app bug): local reference table overflow (max=512) (#149)](https://github.com/NativeScript/android-runtime/issues/149)
 - [Cannot set float field (#148)](https://github.com/NativeScript/android-runtime/issues/148)
 - [IndexedPropertySetter not called (#127)](https://github.com/NativeScript/android-runtime/issues/127)
 - [Fix GetDbgPort intent (#117)](https://github.com/NativeScript/android-runtime/issues/117)
 - [Recreating an Activity with fragments on same process crashes the runtime (#96)](https://github.com/NativeScript/android-runtime/issues/96)
 - [Grunt tasks fail on Windows (#61)](https://github.com/NativeScript/android-runtime/issues/61)

## Performance

 - [Optimize Strings marshaling between Java and V8 (#160)](https://github.com/NativeScript/android-runtime/issues/160)
 - [Improve required module loading (#156)](https://github.com/NativeScript/android-runtime/issues/156)
 - [Improve JNI String marshalling (#126)](https://github.com/NativeScript/android-runtime/issues/126)
 - [Cache folder-as-module resolved path (#121)](https://github.com/NativeScript/android-runtime/issues/121)


## 1.1.0 (2015, June 10)

### New

* Implemented [#58](https://github.com/NativeScript/android-runtime/issues/60) to remove the 3-seconds initial timeout for Debug builds.
* Implemented [#118](https://github.com/NativeScript/android-runtime/issues/118) to replace the MultiDex library with DexClassLoader.
* Started [#103](https://github.com/NativeScript/android-runtime/issues/103) AOT proxy generation to improve startup time and to enable new scenarios like BroadcastReceivers, BackgroundServices and arbitrary Activity types declared in the manifest.

### Fixed

* [#63](https://github.com/NativeScript/android-runtime/issues/63). An issue which prevented users to extend overloaded methods.
* [#64](https://github.com/NativeScript/android-runtime/issues/64). A JNI Crash when calling JS method with char.
* [#113](https://github.com/NativeScript/android-runtime/issues/113). Fixes the extend routine for an Activity.
* [#114](https://github.com/NativeScript/android-runtime/issues/114). Removes the redundant setNativeScriptOverrides method.

## 1.0.0 (2015, April 29)

### New

* Updated the V8 version to 4.1.0.27.
* Re-implemented debugger support (no more spontaneous dead locks).

### Fixed

* An issue with the error reporting routine.

### Breaking Changes

* Renamed global functions:
	* `__log` (was `Log`)
	* `__debugbreak` (was `waitForDebugger`)
	* `__enableVerboseLogging` (was `enableVerboseLogging`)
	* `__disableVerboseLogging` (was `disableVerboseLogging`)
	* `__exit` (was `fail`)

## 0.10.0 (2015, April 17)

### New

* Added Dynamic Generator for binding proxies. This boosts the initial loading time, especially on Android 5.0+ devices.
* Added several optimization techniques, which further optimize the loading time and the overall performance.
* Improved the error reporting mechanism for Debug builds.
* Added support for package.json and index.js for bootstrapping an application.

### Breaking Changes

  * Removed the simulated property-like support for Android types. E.g. the `android.content.Intent.getAction()` previously was accessible like `android.content.Intent.Action`. This is no longer valid as it contradicts with the Android APIs.
  * Changed the way `extend` constructs work
```javascript
// WRONG
var handler = new android.os.Handler.extend({...})();

// CORRECT
var handlerType = android.os.Handler.extend({...});
var handler = new handlerType();
```
  * The directory structure in the `assets` folder has changed. The `tns_modules` directory is now within the `assets/app` one. To migrate older CLI projects to the new structure simply move the content of the inner app folder one level up:

####Previous structure:
```
|--app
|--|--app
|--|--|--bootstrap.js
|--|--|--myFile.js
|--|--tns_modules
```

####New structure:
```
|--app
|--|--bootstrap.js
|--|--myFile.js
|--|--tns_modules
```
