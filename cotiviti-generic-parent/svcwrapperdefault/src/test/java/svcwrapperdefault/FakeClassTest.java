package svcwrapperdefault;

import static org.junit.Assert.*;

import org.junit.Test;

public class FakeClassTest {

	@Test
	public void testFakeClass() {
		assertNotNull("Fakes should be real", new FakeClass());
	}

}
