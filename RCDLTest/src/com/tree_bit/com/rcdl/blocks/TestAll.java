package com.tree_bit.com.rcdl.blocks;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 18.01.15 17:25
 * @author Alexander
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	HalfSlabsTest.class,
	RepeaterTest.class,
	RedStoneTorchTest.class,
	WoolTest.class,
	RedstoneLampTest.class,
	HangingSignTest.class,
	RedstoneTest.class,
	BlocksTest.class,
	StandingSignTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 18.01.15 17:25
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
