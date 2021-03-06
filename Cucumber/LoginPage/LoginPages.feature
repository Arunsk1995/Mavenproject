Feature: Verify the Adactin page Details

  Scenario Outline: Verifying Adactin login with valid credentials
    Given User is on the Adactin Hotel Page
    When User should enter "<username>" , "<Password>"
    And user should select a Hotel "<location>","<hotel>","<roomtype>","<roomNo>","<Datein>","<Dateout>","<adultroom>","<childroom>"
    And user should Booking Page "<firstname>","<lastname>","<address>","<creditnum>","<credittype>","<expmonth>","<expyear>","<cvv>"
    And user should print order id
    Then User should verify succsess message

    Examples: 
      | username  | Password    | location  | hotel          | roomtype | roomNo | Datein     | Dateout    | adultroom | childroom | firstname | lastname | address    | creditnum        | credittype | expmonth | expyear | cvv |
      | ARUNSK007 | Goodarun007 | Melbourne | Hotel Sunshine | Deluxe   |      2 | 18/05/2022 | 19/05/2022 |         2 |         2 | Arun      | S K      | Kovilpatti | 6234567890123456 | VISA       | November |    2022 | 234 |
      | ARUNSK007 | Goodarun007 | Melbourne | Hotel Sunshine | Deluxe   |      2 | 18/05/2022 | 19/05/2022 |         2 |         2 | Arun      | S K      | Kovilpatti | 6234567890123456 | VISA       | November |    2022 | 234 |
      | ARUNSK007 | Goodarun007 | Melbourne | Hotel Sunshine | Deluxe   |      2 | 18/05/2022 | 19/05/2022 |         2 |         2 | Arun      | S K      | Kovilpatti | 6234567890123456 | VISA       | November |    2022 | 234 |
      | ARUNSK007 | Goodarun007 | Melbourne | Hotel Sunshine | Deluxe   |      2 | 18/05/2022 | 19/05/2022 |         2 |         2 | Arun      | S K      | Kovilpatti | 6234567890123456 | VISA       | November |    2022 | 234 |
      | ARUNSK007 | Goodarun007 | Melbourne | Hotel Sunshine | Deluxe   |      2 | 18/05/2022 | 19/05/2022 |         2 |         2 | Arun      | S K      | Kovilpatti | 6234567890123456 | VISA       | November |    2022 | 234 |
      | ARUNSK007 | Goodarun007 | Melbourne | Hotel Sunshine | Deluxe   |      2 | 18/05/2022 | 19/05/2022 |         2 |         2 | Arun      | S K      | Kovilpatti | 6234567890123456 | VISA       | November |    2022 | 234 |
      | ARUNSK007 | Goodarun007 | Melbourne | Hotel Sunshine | Deluxe   |      2 | 18/05/2022 | 19/05/2022 |         2 |         2 | Arun      | S K      | Kovilpatti | 6234567890123456 | VISA       | November |    2022 | 234 |
      | ARUNSK007 | Goodarun007 | Melbourne | Hotel Sunshine | Deluxe   |      2 | 18/05/2022 | 19/05/2022 |         2 |         2 | Arun      | S K      | Kovilpatti | 6234567890123456 | VISA       | November |    2022 | 234 |
      | ARUNSK007 | Goodarun007 | Melbourne | Hotel Sunshine | Deluxe   |      2 | 18/05/2022 | 19/05/2022 |         2 |         2 | Arun      | S K      | Kovilpatti | 6234567890123456 | VISA       | November |    2022 | 234 |
      | ARUNSK007 | Goodarun007 | Melbourne | Hotel Sunshine | Deluxe   |      2 | 18/05/2022 | 19/05/2022 |         2 |         2 | Arun      | S K      | Kovilpatti | 6234567890123456 | VISA       | November |    2022 | 234 |
    