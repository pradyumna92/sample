$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/TestSuites/friendsurance.feature");
formatter.feature({
  "line": 1,
  "name": "Expenses Tracker Test cases",
  "description": "",
  "id": "expenses-tracker-test-cases",
  "keyword": "Feature"
});
formatter.before({
  "duration": 54583797000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "As a Customer ,I want to register new User",
  "description": "",
  "id": "expenses-tracker-test-cases;as-a-customer-,i-want-to-register-new-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Expense Tracker HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"username\" and \"password1\" and \"password2\" to register new user",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks on register button",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnExpenseTrackerHomePage()"
});
formatter.result({
  "duration": 16211112600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    },
    {
      "val": "password1",
      "offset": 28
    },
    {
      "val": "password2",
      "offset": 44
    }
  ],
  "location": "MyStepdefs.userEntersAndAndToRegisterNewUser(String,String,String)"
});
formatter.result({
  "duration": 62609491901,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@href\u003d\u0027register.jsp\u0027]\"}\n  (Session info: chrome\u003d80.0.3987.132)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027LAPTOP-HV3BVF0F\u0027, ip: \u0027192.168.2.112\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.132, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\PRADYU~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:54106}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 5c5cdfcf4fdfe80bc79d9850771c3040\n*** Element info: {Using\u003dxpath, value\u003d//a[@href\u003d\u0027register.jsp\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:419)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.isDisplayed(Unknown Source)\r\n\tat com.methods.commonMethods.registerNewUser(commonMethods.java:75)\r\n\tat com.stepdefs.MyStepdefs.userEntersAndAndToRegisterNewUser(MyStepdefs.java:76)\r\n\tat ✽.When User enters \"username\" and \"password1\" and \"password2\" to register new user(src/test/java/TestSuites/friendsurance.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "register",
      "offset": 15
    }
  ],
  "location": "MyStepdefs.userClicksOnRegisterButton(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 4147866501,
  "status": "passed"
});
formatter.before({
  "duration": 10920029899,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "As a Customer ,I want to change my password",
  "description": "",
  "id": "expenses-tracker-test-cases;as-a-customer-,i-want-to-change-my-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "User is on Expense Tracker HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User enters valid \"username\" and \"password\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on EditAccount from the navigation menu",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enter details to update the account",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User clicks on update button",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnExpenseTrackerHomePage()"
});
formatter.result({
  "duration": 9668436200,
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
  "duration": 60226773400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#login\"}\n  (Session info: chrome\u003d80.0.3987.132)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027LAPTOP-HV3BVF0F\u0027, ip: \u0027192.168.2.112\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.132, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\PRADYU~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:54146}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 1db56782a096f730f4ff66007955f79b\n*** Element info: {Using\u003did, value\u003dlogin}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.sendKeys(Unknown Source)\r\n\tat com.methods.commonMethods.login(commonMethods.java:56)\r\n\tat com.stepdefs.MyStepdefs.userEntersValidAnd(MyStepdefs.java:18)\r\n\tat ✽.When User enters valid \"username\" and \"password\"(src/test/java/TestSuites/friendsurance.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "EditAccount",
      "offset": 15
    }
  ],
  "location": "MyStepdefs.userClicksOnAddExpensesFromTheNavigationMenu(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.userEnterDetailsToUpdateTheAccount()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "update",
      "offset": 15
    }
  ],
  "location": "MyStepdefs.userClicksOnRegisterButton(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 3572328901,
  "status": "passed"
});
});