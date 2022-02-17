Feature: Validating Login function of facebook Application

  Scenario Outline: Login with incorrect username and incorrect password
    #Given------>describe precondition
    Given user is on adactinhotelapp page
    When user enter "<username>" and "<password>"
    And user should click login button
    And user should dropdown the location
    And user should select the hotel
    When user enter "<first_name>","<last_name>","<address>","<cc_num>" and "<cc_cvv>"
    Then user should get the order id

    Examples: 
      | username | password | first_name | last_name | address      | cc_num           | cc_cvv |
      | vicky619 | 70T40L   | vicky      | j         | OMR          | 1234567890123455 |   8881 |
      | vicky619 | 70T40L   | vicky      | j         | OMR          | 1234567890123456 |   8882 |
      | vicky619 | 70T40L   | vicky      | j         | Ariyalur     | 1234567890123457 |   8883 |
      | vicky619 | 70T40L   | vicky      | j         | Chennai      | 1234567890123458 |   8884 |
      | vicky619 | 70T40L   | vicky      | j         | Thoraipakkam | 1234567890123459 |   8885 |
      | vicky619 | 70T40L   | vicky      | j         | Velacherry   | 1234567890123460 |   8886 |
      | vicky619 | 70T40L   | vicky      | j         | Guindy       | 1234567890123461 |   8887 |
      | vicky619 | 70T40L   | vicky      | j         | Egmore       | 1234567890123462 |   8888 |
      | vicky619 | 70T40L   | vicky      | j         | Tambaram     | 1234567890123463 |   8889 |
      | vicky619 | 70T40L   | vicky      | j         | Tanjore      | 1234567890123464 |   8890 |
