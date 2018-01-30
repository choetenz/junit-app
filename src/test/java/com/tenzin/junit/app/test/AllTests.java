package com.tenzin.junit.app.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.tenzin.junit.app.util.MathUtilTest;
import com.tenzin.junit.app.util.NameUtilTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({NameUtilTest.class,MathUtilTest.class})
public class AllTests {

	

}
