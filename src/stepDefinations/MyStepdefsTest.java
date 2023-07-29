package stepDefinations;

import io.cucumber.java.en.Given;

public class MyStepdefsTest {
    @Given("calling test step defination method")
    public void callingTestStepDefinationMethod() {
        System.out.println("This is a TEST");
    }
}
