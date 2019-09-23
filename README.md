# ww_qa_assignnment
@author: Pranav Joshi
Refer to README.png file for folder structure information.

=================================
Eciplse log output from local run
=================================
[RemoteTestNG] detected TestNG version 6.10.0
[TestNG] Running:
  /private/var/folders/g8/7mckfsx542b_g0r3cl2h01ch0000gn/T/testng-eclipse-1133614182/testng-customsuite.xml

Launching google chrome with new profile..
Starting ChromeDriver 76.0.3809.68 (420c9498db8ce8fcd190a954d51297672c1515d5-refs/branch-heads/3809@{#864}) on port 24285
2019-09-22 21:38:38 INFO  WW_UI_AUTOMATION:27 -****************** Starting TC_0001_Get_WWHomePage_US  ******************
the current URL is : https://www.weightwatchers.com/us/
------------------------------------------------------------------------
------------------------------------------------------------------------
The current URL is:.... https://www.weightwatchers.com/us/
The Actual BASE URL is:.... https://www.weightwatchers.com/us/
------------------------------------------------------------------------
------------------------------------------------------------------------
US HomePage title is: WW (Weight Watchers): Weight Loss & Wellness Help
------------------------------------------------------------------------
Navigating to US home page.........
------------------------------------------------------------------------
US HomePage title is:.... WW (Weight Watchers): Weight Loss & Wellness Help
Expected US HomePage title should be:.... WW (Weight Watchers): Weight Loss & Wellness Help
------------------------------------------------------------------------
IT's A MATCH:.....Title for US HomePage 
2019-09-22 21:38:59 INFO  WW_UI_AUTOMATION:42 -****************** Finished TC_0001_Get_WWHomePage_US  ******************
Launching google chrome with new profile..
Starting ChromeDriver 76.0.3809.68 (420c9498db8ce8fcd190a954d51297672c1515d5-refs/branch-heads/3809@{#864}) on port 28572
2019-09-22 21:39:00 INFO  WW_UI_AUTOMATION:25 -****************** Starting TC_0002_Get_Search_Location_Page ******************
Actual Page Title for Search Studios Page:....Find WW Studios & Meetings Near You | WW USA
------------------------------------------------------------------------
Actual Page Title for Search Studios Page:....Find WW Studios & Meetings Near You | WW USA
Expected Page Title for Search Studios Page:....Find WW Studios & Meetings Near You | WW USA
------------------------------------------------------------------------
true
------------------------------------------------------------------------
Actual Page Title for Search Studios Page:....Find WW Studios & Meetings Near You | WW USA
Expected Page Title for Search Studios Page:....Find WW Studios & Meetings Near You | WW USA
------------------------------------------------------------------------
true
IT's A MATCH:.....Search Studio page Title matches expected title 
2019-09-22 21:39:24 INFO  WW_UI_AUTOMATION:40 -****************** Finished TC_0002_Get_Search_Location_Page ******************
Launching google chrome with new profile..
Starting ChromeDriver 76.0.3809.68 (420c9498db8ce8fcd190a954d51297672c1515d5-refs/branch-heads/3809@{#864}) on port 38574
2019-09-22 21:39:25 INFO  WW_UI_AUTOMATION:24 -****************** Starting TC_0003_Search_Studio_Location ******************
Actual Page Title for Search Studios Page:....Find WW Studios & Meetings Near You | WW USA
Search Studio by zip -10011
------------------------------------------------------------------------

First Studio in the search result is: 
WW Studio Flatiron

------------------------------------------------------------------------
2019-09-22 21:40:27 INFO  WW_UI_AUTOMATION:33 -****************** Finished TC_0003_Search_Studio_Location ******************
Launching google chrome with new profile..
Starting ChromeDriver 76.0.3809.68 (420c9498db8ce8fcd190a954d51297672c1515d5-refs/branch-heads/3809@{#864}) on port 18493
2019-09-22 21:40:29 INFO  WW_UI_AUTOMATION:25 -****************** Starting TC_0004_Select_First_Studio_Location ******************
Actual Page Title for Search Studios Page:....Find WW Studios & Meetings Near You | WW USA
Search Studio by zip -10011
------------------------------------------------------------------------

First Studio in the search result is: 
WW Studio Flatiron

------------------------------------------------------------------------
------------------------------------------------------------------------
Studio Name of first listed studio:....WW Studio Flatiron
Selected First Studio name from the search list:....WW Studio Flatiron
------------------------------------------------------------------------
IT's A MATCH:.....First Studio name listed and selected studio are the same. 
2019-09-22 21:41:42 INFO  WW_UI_AUTOMATION:45 -****************** Finished TC_0004_Select_First_Studio_Location ******************
Launching google chrome with new profile..
Starting ChromeDriver 76.0.3809.68 (420c9498db8ce8fcd190a954d51297672c1515d5-refs/branch-heads/3809@{#864}) on port 5151
2019-09-22 21:41:44 INFO  WW_UI_AUTOMATION:29 -****************** Starting TC_0005_Get_Studio_Hours_Of_Operations ******************
Actual Page Title for Search Studios Page:....Find WW Studios & Meetings Near You | WW USA
Search Studio by zip -10011
------------------------------------------------------------------------

First Studio in the search result is: 
WW Studio Flatiron

------------------------------------------------------------------------
------------------------------------------------------------------------
Studio Name of first listed studio:....WW Studio Flatiron
Selected First Studio name from the search list:....WW Studio Flatiron
------------------------------------------------------------------------
---------------------Today's hours of operations------------------------
TODAY’s hours of operation: 
SUN
10:00 AM – 1:00 PM
-----------------------------------------------------------------------
SUN
JOHN B. - 2
MON
DANA F. - 1
LISA S. - 2
TUE
ARANSAS S. - 2
LAUREN C. - 2
WED
KENDRA V. - 1
CAMI B. - 2
THU
DIANE M. - 1
MINDI K. - 2
STEVEN H. - 2
FRI
SILMARA R. - 2
SAT
ROBERT B. - 3
2019-09-22 21:42:00 INFO  WW_UI_AUTOMATION:46 -****************** Finished TC_0005_Get_Studio_Hours_Of_Operations ******************
PASSED: navigate_WWPage_US
PASSED: getSearchStudiosPage
PASSED: searchStudio
PASSED: select_First_Studio_Location
PASSED: getHoursOfOperations

===============================================
    Default test
    Tests run: 5, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 5, Failures: 0, Skips: 0
===============================================

[TestNG] Time taken by org.testng.reporters.EmailableReporter2@68c9d179: 20 ms
[TestNG] Time taken by [FailedReporter passed=0 failed=0 skipped=0]: 1 ms
[TestNG] Time taken by org.testng.reporters.XMLReporter@3feb2dda: 60 ms
[TestNG] Time taken by org.testng.reporters.SuiteHTMLReporter@69c81773: 207 ms
[TestNG] Time taken by org.testng.reporters.JUnitReportReporter@4d15107f: 54 ms
[TestNG] Time taken by org.testng.reporters.jq.Main@66ea810: 151 ms

