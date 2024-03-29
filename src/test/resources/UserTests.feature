Feature: Demo REST api testing

Background:
* url 'http://localhost:8080/rest'
* header Accept = 'application/json'
Scenario: Testing valid GET endpoint
Given path 'all'
When method GET
Then status 200
And match each response contains { id: '#notnull'}
And match each response contains { firstName: '#regex [A-Z][a-z]+', lastName: '#regex [A-Z][a-z]+'}
