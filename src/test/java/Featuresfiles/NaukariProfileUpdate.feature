Feature: Naukari Profile update

@NakuariUpdate
Scenario Outline: Update the naukari resume hedline.
Given user is on the nakuri login page and signed in suceefully with <Username> and <Password>
When user udpated the resume headline
Then the success msg displayed

Examples:
|Username                 |Password  |
|sanketmali856@gmail.com |Sanket@856|