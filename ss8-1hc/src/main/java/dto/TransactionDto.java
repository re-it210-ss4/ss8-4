package dto;
import validation.MultipleOfTenThousand;
import jakarta.validation.constraints.NotNull;

public class TransactionDto {
    @NotNull(message = "Số tiền không được để trống")
    @MultipleOfTenThousand
    private Long withdrawAmount;

    public Long getWithdrawAmount() { return withdrawAmount; }
    public void setWithdrawAmount(Long w) { this.withdrawAmount = w; }
}