$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/TestSuites/friendsurance.feature");
formatter.feature({
  "line": 1,
  "name": "Expenses Tracker Test cases",
  "description": "",
  "id": "expenses-tracker-test-cases",
  "keyword": "Feature"
});
formatter.before({
  "duration": 43936452900,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#  Scenario:As a Customer ,I want to register new User"
    },
    {
      "line": 4,
      "value": "#    Given User is on Expense Tracker HomePage"
    },
    {
      "line": 5,
      "value": "#    When User enters \"username\" and \"password1\" and \"password2\" to register new user"
    },
    {
      "line": 6,
      "value": "#    Then User clicks on register button"
    },
    {
      "line": 7,
      "value": "#"
    },
    {
      "line": 8,
      "value": "#  Scenario:As a Customer ,I want to change my password"
    },
    {
      "line": 9,
      "value": "#    Given User is on Expense Tracker HomePage"
    },
    {
      "line": 10,
      "value": "#    When User enters valid \"username\" and \"password\""
    },
    {
      "line": 11,
      "value": "#    And User clicks on EditAccount from the navigation menu"
    },
    {
      "line": 12,
      "value": "#    And user enter details to update the account"
    },
    {
      "line": 13,
      "value": "#    Then User clicks on update button"
    },
    {
      "line": 14,
      "value": "#"
    }
  ],
  "line": 15,
  "name": "As a Customer ,I want to login with valid credentials",
  "description": "",
  "id": "expenses-tracker-test-cases;as-a-customer-,i-want-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "User is on Expense Tracker HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User enters valid \"username\" and \"password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnExpenseTrackerHomePage()"
});
formatter.result({
  "duration": 30497241800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 12
    },
    {
      "val": "username",
      "offset": 19
    },
    {
      "val": "password",
      "offset": 34
    }
  ],
  "location": "MyStepdefs.userEntersValidAnd(String,String,String)"
});
formatter.result({
  "duration": 70228267000,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#logout\"}\n  (Session info: chrome\u003d80.0.3987.132)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027LAPTOP-HV3BVF0F\u0027, ip: \u0027192.168.2.112\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.132, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\PRADYU~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:60953}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 54ee5de374fd12389a93465d6ad2aec4\n*** Element info: {Using\u003did, value\u003dlogout}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.isDisplayed(Unknown Source)\r\n\tat com.methods.commonMethods.login(commonMethods.java:43)\r\n\tat com.stepdefs.MyStepdefs.userEntersValidAnd(MyStepdefs.java:29)\r\n\tat ✽.Then User enters valid \"username\" and \"password\"(src/test/java/TestSuites/friendsurance.feature:17)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 204400,
  "error_message": "cucumber.runtime.CucumberException: When a hook declares an argument it must be of type cucumber.api.Scenario. public void com.stepdefs.MyStepdefs.tearDown(org.testng.ITestResult)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:52)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:86)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:643)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:820)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1128)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:129)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:112)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:782)\r\n\tat org.testng.TestRunner.run(TestRunner.java:632)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:366)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:361)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:319)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:268)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1244)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1169)\r\n\tat org.testng.TestNG.run(TestNG.java:1064)\r\n\tat com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)\r\n\tat com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:110)\r\n",
  "status": "failed"
});
});