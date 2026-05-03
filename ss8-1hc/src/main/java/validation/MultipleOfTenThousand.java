package validation;
import jakarta.validation.*;
import java.lang.annotation.*;

@Constraint(validatedBy = WithdrawValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface MultipleOfTenThousand {
    String message() default "Số tiền phải >= 50.000 và là bội số của 10.000";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}