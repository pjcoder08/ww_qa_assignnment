# ww_qa_assignnment @author: Pranav Joshi

Folder structure-
       ww --|
            |------/ main -------->coding_challenge --------> FileActions.java (Question 1)
            |                 |                     |
            |                 |                     |------> FindSecondSmallestNumber.java(Question 3)
            |                 |  
            |                 |
            |                 |---> com.ww.pageObjects--------> WWHomePage_US.java 
            |                                              |--> StudioPage.java 
            |                                              |--> SearchMeetingPage.java 
            |
            |-----/test----------->testcases-----> BasePage.java 
            |                                |---> TC_0001_Get_WWHomePage_US.java 
            |                                |---> TC_0002_Get_Search_Location_Page.java
            |                                |---> TC_0003_Search_Studio_Location.java
            |                                |---  TC_0004_Select_First_Studio_Location.java
            |                                |---> TC_0005_Get_Studio_Hours_Of_Operations.java
            |
            |
            |
            |----/resources-----> inputfile.txt-(used as input file for for FileActions.java)
            |
            |
            |----Drivers-------> ChromeDriver()
            |
            |
            |---Screenshots---empty
            |
            |
            |-----pom.xml --(Contains all the maven dependecies required for this project)
            |
            |-----testng.xml 
