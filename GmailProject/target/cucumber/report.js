$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login to Gmail account",
  "description": "User with right credential should be able to login into gmail account",
  "id": "login-to-gmail-account",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "duration": 4066794400,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Login to Gmail account using correct credentials",
  "description": "",
  "id": "login-to-gmail-account;login-to-gmail-account-using-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    },
    {
      "line": 5,
      "name": "@tagLogin"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User navigates to gmail login page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "# And User will click Sign in button"
    }
  ],
  "line": 9,
  "name": "User will enter valid username \"seleniumt59@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click Next button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User will enter valid password \"Sel@1test\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click Next button to Sign in",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should be logged in to the account successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.navigateToLogin()"
});
formatter.result({
  "duration": 7842998300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "seleniumt59@gmail.com",
      "offset": 32
    }
  ],
  "location": "Login.enterUsername(String)"
});
formatter.result({
  "duration": 3528832300,
  "status": "passed"
});
formatter.match({
  "location": "Login.clickNext()"
});
formatter.result({
  "duration": 229871900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sel@1test",
      "offset": 32
    }
  ],
  "location": "Login.enterPassword(String)"
});
formatter.result({
  "duration": 9295822600,
  "status": "passed"
});
formatter.match({
  "location": "Login.clickNextToSignIn()"
});
formatter.result({
  "duration": 23810832100,
  "status": "passed"
});
formatter.match({
  "location": "Login.verifyLogin()"
});
formatter.result({
  "duration": 6080350700,
  "status": "passed"
});
formatter.uri("SendMail.feature");
formatter.feature({
  "line": 2,
  "name": "Compose and Send mail",
  "description": "User will compose a mail and will send it",
  "id": "compose-and-send-mail",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag1"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#"
    },
    {
      "line": 5,
      "value": "#@tag1 @tagSendMail"
    },
    {
      "line": 6,
      "value": "#Scenario: Compose and Send mail to given email id"
    },
    {
      "line": 7,
      "value": "#\tGiven User will click Compose button"
    },
    {
      "line": 8,
      "value": "#\tThen Compose email pop up will come"
    },
    {
      "line": 9,
      "value": "#\tWhen User will enter valid email \"pragyasingh1308@gmail.com\""
    },
    {
      "line": 10,
      "value": "#\tAnd User will enter subject \"Test subject\""
    },
    {
      "line": 11,
      "value": "#\tAnd User will enter body \"Test body\""
    },
    {
      "line": 12,
      "value": "#\tThen User click Send button"
    }
  ],
  "line": 16,
  "name": "Compose and Send mail to given email id",
  "description": "",
  "id": "compose-and-send-mail;compose-and-send-mail-to-given-email-id",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@tag1"
    },
    {
      "line": 15,
      "name": "@tagSendMail"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User will click Compose button",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Compose email pop up will come",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User will enter valid email \"\u003cEmail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User will enter subject \"\u003cSubject\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User will enter body \"\u003cBody\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User click Send button",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "compose-and-send-mail;compose-and-send-mail-to-given-email-id;",
  "rows": [
    {
      "cells": [
        "Email",
        "Subject",
        "Body"
      ],
      "line": 25,
      "id": "compose-and-send-mail;compose-and-send-mail-to-given-email-id;;1"
    },
    {
      "cells": [
        "pragyasinghrajput@gmail.com",
        "Test Sub1",
        "Test Body"
      ],
      "line": 26,
      "id": "compose-and-send-mail;compose-and-send-mail-to-given-email-id;;2"
    },
    {
      "cells": [
        "pragyasinghrajput13@gmail.com",
        "Test Sub2",
        "Test Body2"
      ],
      "line": 27,
      "id": "compose-and-send-mail;compose-and-send-mail-to-given-email-id;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 26,
  "name": "Compose and Send mail to given email id",
  "description": "",
  "id": "compose-and-send-mail;compose-and-send-mail-to-given-email-id;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@tagSendMail"
    },
    {
      "line": 1,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User will click Compose button",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Compose email pop up will come",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User will enter valid email \"pragyasinghrajput@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User will enter subject \"Test Sub1\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User will enter body \"Test Body\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User click Send button",
  "keyword": "Then "
});
formatter.match({
  "location": "SendMail.clickCompose()"
});
formatter.result({
  "duration": 480788600,
  "status": "passed"
});
formatter.match({
  "location": "SendMail.verifyMailPopup()"
});
formatter.result({
  "duration": 3092072200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pragyasinghrajput@gmail.com",
      "offset": 29
    }
  ],
  "location": "SendMail.enterEmail(String)"
});
formatter.result({
  "duration": 973414000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Sub1",
      "offset": 25
    }
  ],
  "location": "SendMail.enterMailSubject(String)"
});
formatter.result({
  "duration": 4303267100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Body",
      "offset": 22
    }
  ],
  "location": "SendMail.enterMailBody(String)"
});
formatter.result({
  "duration": 546353300,
  "status": "passed"
});
formatter.match({
  "location": "SendMail.clickSend()"
});
formatter.result({
  "duration": 256067100,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Compose and Send mail to given email id",
  "description": "",
  "id": "compose-and-send-mail;compose-and-send-mail-to-given-email-id;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@tagSendMail"
    },
    {
      "line": 1,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User will click Compose button",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Compose email pop up will come",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User will enter valid email \"pragyasinghrajput13@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User will enter subject \"Test Sub2\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User will enter body \"Test Body2\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User click Send button",
  "keyword": "Then "
});
formatter.match({
  "location": "SendMail.clickCompose()"
});
formatter.result({
  "duration": 231950500,
  "status": "passed"
});
formatter.match({
  "location": "SendMail.verifyMailPopup()"
});
formatter.result({
  "duration": 3067442000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pragyasinghrajput13@gmail.com",
      "offset": 29
    }
  ],
  "location": "SendMail.enterEmail(String)"
});
formatter.result({
  "duration": 643581100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Sub2",
      "offset": 25
    }
  ],
  "location": "SendMail.enterMailSubject(String)"
});
formatter.result({
  "duration": 4286879700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Body2",
      "offset": 22
    }
  ],
  "location": "SendMail.enterMailBody(String)"
});
formatter.result({
  "duration": 512068500,
  "status": "passed"
});
formatter.match({
  "location": "SendMail.clickSend()"
});
formatter.result({
  "duration": 192018200,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Verify mail has been sent or not",
  "description": "",
  "id": "compose-and-send-mail;verify-mail-has-been-sent-or-not",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@tag1"
    },
    {
      "line": 30,
      "name": "@tagSendMail"
    },
    {
      "line": 30,
      "name": "@LastTag"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "User will navigate to Sent tab",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "User will verify the content",
  "keyword": "Then "
});
formatter.match({
  "location": "SendMail.navigateToSentTab()"
});
formatter.result({
  "duration": 5301968600,
  "status": "passed"
});
formatter.match({
  "location": "SendMail.verifyContents()"
});
formatter.result({
  "duration": 6208797300,
  "status": "passed"
});
});