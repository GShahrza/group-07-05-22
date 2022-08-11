package main.java.lesson_32;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TesterInfo {

	public enum Priority {
	   LOW, MEDIUM, HIGH
	}
	Priority priority() default Priority.MEDIUM;
	String[] tags() default "";
	String createdBy() default "Tuğrul";
	String lastModified() default "18/08/2019";

}