Feature: Demo REST api testing

Scenario: Testing valid GET endpoint
Given url 'http://localhost:8080/rest/all'
When method GET
Then status 200
And match each response contains { id: '#notnull'}
And match each response contains { firstName: '#regex [A-Z][a-z]+', lastName: '#regex [A-Z][a-z]+'}
