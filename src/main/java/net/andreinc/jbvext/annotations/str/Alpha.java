package net.andreinc.jbvext.annotations.str;

import net.andreinc.jbvext.annotations.str.validators.AlphaValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Checks if the String contains only unicode letters.
 */
@Documented
@Constraint(validatedBy = AlphaValidator.class)
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
public @interface Alpha {
    String message() default "{str.alpha}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
