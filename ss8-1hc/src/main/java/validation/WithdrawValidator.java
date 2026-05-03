package validation;
import jakarta.validation.*;

public class WithdrawValidator implements ConstraintValidator<MultipleOfTenThousand, Long> {
    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        if (value == null) return true;
        return value >= 50000 && value % 10000 == 0;
    }
}