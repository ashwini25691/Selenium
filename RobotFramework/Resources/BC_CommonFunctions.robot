*** Settings ***
Library         Selenium2Library
Library         OperatingSystem
Library         String
Library         DateTime
Library         OracleDB
Library         Selenium2Library
Library         OperatingSystem
Library         String
Library         ${EXECDIR}/Utilities/TestData.py

*** Variables ***

*** Keywords ***
I am on the WestwingNow home page
    Open Browser        %{Url}         %{Browser}
    sleep   2s
    Maximize Browser Window
    Capture Page Screenshot

Close the Application
    Close Browser

Get Test data from excel
   [Documentation]   This keyword is to get the test data from the excel.
   [Arguments]   ${sheetname}  ${colNames}
    : For   ${colname}   IN       @{colNames}
    \  log  ${colname}
    \   log  ${TEST_NAME}
    \   log   ${sheetname}
    \  ${data}=    GetCellData   ${sheetname}   ${colname}   ${TEST_NAME}
    \   Set Global Variable    ${${colname}}     ${data}


Initialize test data variables
  [Documentation]   This keyword is to get the test data from the excel for Requisiton and PO related workflow.
  [Arguments]   ${sheetname}  @{colNames}
  FOR   ${colname}   IN       @{colNames}
        ${data}=    GetCellData   ${sheetname}   ${colname}   ${TEST_NAME}
        Set Global Variable    ${${colname}}     ${data}
        log  ${${colname}}
  END

Get Start and End Iterations
    ${StartIterations}=         GetTestIteration            ${TEST_NAME}        Start_Iteration
    ${EndIterations}=           GetTestIteration            ${TEST_NAME}        End_Iteration
    Set Global Variable   ${StartIterations}
    Set Global Variable   ${EndIterations}

TestSetup
   Get Start and End Iterations


Create variables from testdata
     [Documentation]   This keyword is to get the test data from the excel.
     [Arguments]    ${Sheet_Name}
     @{column_list}   get_colmn_name    ${Sheet_Name}
     #log many   @{column_list}
     Initialize test data variables  ${Sheet_Name}   @{column_list}

Click Link using JavaScript
    [Documentation]   This keyword is to click Link using JavaScript
     [Arguments]    ${ele}
     ${ele}    Get WebElement    ${ele}
     Execute Javascript    arguments[0].click();     ARGUMENTS    ${ele}

