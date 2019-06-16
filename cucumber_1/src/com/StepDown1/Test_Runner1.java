package com.StepDown1;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="OHMS_Credentials",glue= {"com.StepDown1"})
public class Test_Runner1 {

}
