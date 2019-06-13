

# Appium

http://appium.io/


JDK installation

Step 1 : Install JDK

https://www.oracle.com/technetwork/java/javase/downloads/index.html

![image](https://user-images.githubusercontent.com/33985509/59460626-da5a6b80-8e1f-11e9-92c9-fe3ba0cf6460.png)


Else if you any license trouble i follow openjdk,Select version and follow

https://openjdk.java.net/install/


Double click on downloaded .exe file

It will launch JDK software installation dialog.

Now we need to set JAVA_HOME variable in windows

in Windows search - edit the environmental variable


Referenced screenshot:

![image](https://user-images.githubusercontent.com/33985509/59461012-b6e3f080-8e20-11e9-81af-543ceb704c36.png)



For example :

Set Variable name = JAVA_HOME.
Set Variable Value = Path where JDK is located. For me It is "C:\Program Files\Java\jdk1.8.0_45"


Referenced screenshot:

![image](https://user-images.githubusercontent.com/33985509/59461114-eb57ac80-8e20-11e9-8126-dd93c9ec301c.png)


save the path



Verify java is installed properly or not
To verify java software is installed properly or not,
Open command prompt.
Run command "java -version"


![image](https://user-images.githubusercontent.com/33985509/59461311-5e612300-8e21-11e9-9d0a-b10668e29ec8.png)



Only if we are using Android Sdk


Download Android SDK
For downloading android SDK,
Go to this software web application page -> http://developer.android.com/sdk/index.html
Scroll down to bottom of page.
There will be SDK Tools Only" under "Other Download Options" section.
Click on android-sdk_r(Version number)-windows.zip link e.g. android-sdk_r24.3.3-windows.zip 
It will download android SDK zip file

Put zip file in E: drive. (Note : Android SDK needs 20 to 30 GB space on disc to store different files. 
So select appropriate disc where enough space is available.)
Extract .zip file. You will get "android-sdk-windows" folder as shown in above image.
Rename folder name  from "android-sdk-windows" to "SDK" for easy name.

Install Required Packages
In order to create android emulators for testing, You need to download and install few packages. 
You can do it using Android SDK Manager as described in bellow given steps.
Look inside SDK folder. There will be "SDK Manager.exe".
Execute it by double click. It will open Android SDK Manager dialog as shown in bellow image.
Android SDK Tools package will be installed by default.
You can select your required package from list of different packages and then click on Install packages button 
I have installed different 27 packages.
Downloading all packages can take lot of time. It depends on your internet speed.
After installation of different packages and system images 
we need to set ANDROID_HOME and Path environment variables. 



Set ANDROID_HOME Variable
After installation of different packages, You need to set ANDROID_HOME and path environment variables. 
Follow the steps given bellow to set it.
For example : 
Open "Environment Variables" dialog from win start menu -> Right click on My Computer -> Select properties -> Advanced system settings -> Environment Variables button from Advanced tab. 

Click on New button under User Variable table. It will open New User Variable dialog.
Set Variable Name = ANDROID_HOME and Variable value = E:\SDK (Path of SDK folder). Path can be different for you as per your SDK folder location as described in previous post.
Click on OK button to close New User Variable dialog.



Set Path Variables
Open SDK Folder from E: drive.
You will find "tools" and "platform-tools" folders inside SDK folder.
Copy path of both these folders. e.g. E:\SDK\tools and E:\SDK\platform-tools\
Open "Environment Variables" dialog as described above.
Locate Path variable line under System Variables table.
Edit Path variable by clicking on Edit button. It will open Edit  System Variables dialog.
Append "tools" and "platform-tools" folder's full path at the end of line 
e.g. ;E:\SDK\tools;E:\SDK\platform-tools\



Now close all dialog by clicking on OK buttons of all opened dialog as shown in above image.
Verify Android Is Installed And Configured Properly
To check if android is configured properly or not,
Open command prompt --->Type command android 
It will open Android SDK Manager dialog
android is configured properly in your system.
Now ANDROID_HOME and Path Environment Variables are set for android SDK in windows environment. 
So android environment is configured and ready to use with appium to execute software automation tests






Not required in this scenario

To integrate android SDK with eclipse IDE to access SDK tools in eclipse IDE. 
Android offers plugin called Android Developer Tools (ADT) to integrate android development environment in eclipse IDE.
After installing ADT in eclipse, we can setup android project, debug apps and build apps.

However we CAN use it to launch android emulators through eclipse to run software automation tests on it using appium. 
Also you can launch android virtual devices(Emulator) direct from SDK folder -> AVD Manager.exe. 
So this is optional step but still let me describe you how to do it if you wish to launch AVD Manager from eclipse.



Bellow given tools/components should be available/installed
Eclipse IDE -> VIEW POST.
JDK -> VIEW POST.
Android SDK -> VIEW POST.
Steps to install ADT plugin in eclipse IDE.
Open eclipse IDE
Go to Help -> Install New Software. It will open Install software dialog.
Click on Add button. It will open Add Repository dialog.
Set URL "https://dl-ssl.google.com/android/eclipse/" in Location text box and click on OK button as shown in above snap.
It will load Developer Tools with check box.
Select all check box of developer tools and click on Next button. 
It will take you to installation details.
Click on Next button. It will take you to Review Licenses screen.



On completion of ADT plugin, It will ask you to restart eclipse IDE. 
Click on Yes to restart eclipse IDE.

We need to set SDK folder path after installation of ADT plugin which enables eclipse to integrate with android software development environment. 
Open eclipse IDE Preferences dialog from Windows -> Preferences.

Select Android on Preferences dialog.
Set SDK folder path in SDK Location box. 
SDK folder is located in my E: drive which contain all android SDK related stuff


Verify Android SDK configured properly with eclipse
To verify if android SDK is integrated properly or not
Go to Eclipse IDE's Windows menu -> Select Android SDK Manager.
It will open Android SDK Manager dialog
hence we confirmconfirms that android SDK is integrated properly with eclipse IDE using ADT plugin.







Download And Install

Search for "download latest version of Microsoft .Net Framework" keyword In google
It will take you to Microsoft .Net Framework latest version download page.
Current latest version is Microsoft .NET Framework 4.5.
Click on download button. It will download .exe file to install Microsoft .Net Framework(e.g. dotNetFx45_Full_setup.exe).
Double click on .Net framework installation .exe file.
It will open .Net framework installation dialog.
Proceed for installation with default selected options and settings on each screen of installation dialog.



Download And Install node js 
Go to https://nodejs.org/en/download/
Download Windows Installer (.msi) file as per your system(32 bit or 64 bit)
Double click on Node JS installation .msi file.
It will open Node JS installation dialog.
Proceed for installation with default selected options and settings on each screen of installation dialog.



Download And Install PDANet+ for Android
http://pdanet.co/a/

Download PdaNet+ for Android (4.1 or above)
Version 5.10 installer for Windows 10/8/7/Vista/XP (both 32/64bit)

Download and installation instructions for Mac OS (5.0 or above).

We need to install this software only if you not able to detect your connected device in PC. Later on we will learn how to connect device with PC in THIS POST. 
Right now skip this software installation and install it only if you face any problem in detecting device in PC.


We need to connect real android device with PC in USB debugging mode in order to run android app automation tests in real android device using appium.



Enable Developer Option In Android Device
Previously if you have not enabled "developer options" in your android device then once you need to enable it in order to switch device in USB debugging mode. Otherwise you can not access USB debugging mode in your device

Verify Developer Option Is Enabled?
To check Developer Option is enabled or not,

Note: It may vary also with Android devices

Enable Developer Option
To enable Developer Option in android device,
Go to Settings.
Scroll down to bottom and tap on About Phone.

Scroll down bottom again on About Phone screen. You will see option Build number.
Tap seven times on Build number option one by one. After 3 tap, It will start showing you message like.. "You are now 2 steps away from being a developer" as shown in bellow image.
Now go back to Settings and scroll down bottom.
You will see option Developer Options above About Phone as shown in bellow image.


Connect Device With PC And Start USB Debugging Mode
To start USB Debugging mode,
Connect your device with PC using USB cable.
Go to Settings -> Developer options.
There will be option USB debugging with check box. Check it.
It will ask you to "Allow USB debugging?". Tap on OK.
It will enable USB debugging mode for your android device.


Verify Device Connected Properly With PC
To verify device is connected properly with PC with USB debugging mode,
Open command prompt in your PC.
Run command adb devices.

It will show you list of connected devices with your PC. If not display any device in list that means there is some issue with device connection or USB debugging mode is not enabled properly.


Referenced screenshot:

![image](https://user-images.githubusercontent.com/33985509/59462211-894c7680-8e23-11e9-996f-f25f2153b38d.png)




Installing Appium

Install Appium --- > http://appium.io/downloads.html
It will download zip file.
When download completes, Extract zip file.we will get AppiumForWindows folder
Open AppiumForWindows folder. "appium-installer.exe" file will be there.
Double click on "appium-installer.exe" file to install appium. It will start installing appium.


Android Settings :
Click on Android Settings button as shown in bellow image.
Select Platform Name = Android
Select Automation Name = Appium
Select PlatformVersion = Your android device's OS version. 

General Settings
Click on General Settings button as shown in bellow image.
Note down Server Address and Post number. 
We need it during appium software automation test script creation. 
Server Address is : 127.0.0.1 and Port number is : 4723.
Un-check Pre-Launch Application check box if it is checked.






# Automation Framework

An Automation Framework is collection of concepts, assumptions and practices while developing the automation project, so it useful to constitute a work platform or support for automated testing. 
If you look into the existing framework, it will be block of function libraries for reporting, error handling, and driver scripts. So the test automation framework is an execution environment for automated tests. It is the overall system in which our tests will be automated.

<b>Contents</b>

    • What is a Framework 
    • Why do we need Automation framework
    • Data-Driven Framework
    • Purpose of Framework
    • Frameworks Tools
    • Framework Structure
        ◦ Keywords Library
        ◦ Object Repository
        ◦ Generate reports
        ◦ Send reports by Email
        ◦ Screenshot
        
<b>What is a Framework?</b>

In general, a framework is a real or conceptual structure intended to serve as a support or guide for the building of something that expands the structure into something useful.
Using Frameworks, produce beneficial outcomes like increased code re-usage, higher portability, reduced script maintenance cost, higher code readability, etc. 
Prior to knowing about the Hybrid Test Automation Framework, we should know about the existing frameworks. Generally we have,
    • Data Driven Framework
    • Hybrid Framework
    
<b>Why do we need Automation framework?</b>

Using Framework, we can solve many issues like
    • Writing code once and reusing it. Significant Reduction in Testing Cycle Time
    • Running the script with different set of data.
    • Executing the scripts end-to-end without any manual intervention. ( If any error occurs from tool or application, Script run will stop. If we use framework, it will skip or fail that test case and run with the next test case.)
    • With basic knowledge on tool also anyone can run and write the script. 
    • Maintenance becomes very easy.
    
Combination of above all framework is nothing but Hybrid Driven Framework.
Example: In the application, We have 5 scenarios.

    • login with out using password
    • login with wrong password
    • login with valid Credentials 
    • logout and relogin with same credentials
    • log out and verify fogot password link
    
Now write a script for all 5 scenarios using any automation tool.
Write a script for one time. Make it as a function and reuse the same function
    • Read all the scenarios.
    • Identify the repeated steps.
    • Convert them into function.
    
<b>Advantages:</b>
    • Write once (saves time)
    • Reusable
    • Easy Maintenance
    
<b>Disadvantages:</b>
    • Data is hard-coded, we can’t run with multiple sets of data.
    
<b>Data Driven Framework:</b>

It is a framework where test input and output values are read from data files (Excel, CSV, Database) and are loaded into variables in captured or manually coded scripts. If we see the above example, For Login(uname) we can run the script with any data picking it from excel or CSV.
<b>Purpose:</b>

To build a Hybrid Test Automation Framework which can be used across different web/Mobile based applications. With this framework in place, whenever we need to automate a web based application.

<b>Tools Used:</b>

    • Eclipse Java EE
    • Java 7+
    • Jxl
    • Apache Maven
    • JUnit 4.10
    • TestNG
    • XML
    • Extent Libraries
    • Appium 1.12.0
    • Android Studio
    • Others Open-Source tools
    
<b>Framework Structure:</b>

The framework consists of the following components.

    • pageObjects
        ◦ Locators


    • testSuite/Scenarios
        ◦ TestCases
    • utils
        ◦ BaseClass

<b>Object Repository:</b>

-- Page objects we are using for the locators.

<b>Generate reports:</b>
-- using Extent reports library we are generating reports for passed and failed test cases including screenshots
Available under utils package

<b> Note:</b> Sample code snippets for reusable methods and other methods are availble in the project.
