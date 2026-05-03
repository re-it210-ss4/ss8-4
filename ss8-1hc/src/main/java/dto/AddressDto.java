package dto;
import jakarta.validation.constraints.NotBlank;

public class AddressDto {
    @NotBlank(message = "Tên người nhận không được để trống")
    private String receiverName;
    @NotBlank(message = "Địa chỉ không được để trống hoặc chỉ có khoảng trắng")
    private String detailedAddress;

    public String getReceiverName() { return receiverName; }
    public void setReceiverName(String r) { this.receiverName = r; }
    public String getDetailedAddress() { return detailedAddress; }
    public void setDetailedAddress(String d) { this.detailedAddress = d; }
}