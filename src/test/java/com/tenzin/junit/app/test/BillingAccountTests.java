package com.tenzin.junit.app.test;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@IncludeCategory({Billing.class,Account.class})
@Suite.SuiteClasses({AllTests.class,})
public class BillingAccountTests {


}