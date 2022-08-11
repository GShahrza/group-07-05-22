package main.java.lesson_32;

import main.java.lesson_32.TesterInfo.Priority;

@TesterInfo(
	priority = Priority.HIGH,
	tags = {"test" }
)
public class TestExample {

	@Test
	void testA() {
	  if (true)
		throw new RuntimeException("Bu test her zaman başarısız sayılacak.");
	}

	@Test(enabled = false)
	void testB() {
	  if (false)
		throw new RuntimeException("Bu test görmezden gelinecek.");
	}

	@Test(enabled = true)
	void testC() {
	  if (10 > 1) {
		// Bu test her zaman başarılı sayılacak.
	  }
	}
}