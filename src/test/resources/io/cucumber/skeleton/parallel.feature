Feature: When people sleep they dream

  Scenario Outline: A dreamer doesn't dream longer then his dream is long
    Given a dream takes <duration> <unit>
    When a dreamer experiences the dream
    Then they'll be awake after at most <duration> <unit>
    Examples:
      | duration | unit    |
      | 20       | seconds |
      | 15       | seconds |
      | 10       | seconds |
      | 5        | seconds |
      | 2        | seconds  |
      | 1        | second  |

