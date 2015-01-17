package com.tree_bit.com.rcdl;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all of the tests within its
 * package as well as within any subpackages of its package.
 *
 * @generatedBy CodePro at 17.01.15 19:41
 * @author Sascha
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ com.tree_bit.com.rcdl.blocks.TestAll.class,
		com.tree_bit.com.rcdl.core.TestAll.class, })
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args
	 *            the command line arguments
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
