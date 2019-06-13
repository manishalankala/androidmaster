<h1>Automation Framework</h1>

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
