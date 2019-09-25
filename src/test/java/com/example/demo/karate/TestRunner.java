package com.example.demo.karate;

import com.intuit.karate.junit4.Karate;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Karate.class)
@CucumberOptions(features = "/home/jeffrey/demo/src/test/resources/UserTests.feature")
public class TestRunner {
}
