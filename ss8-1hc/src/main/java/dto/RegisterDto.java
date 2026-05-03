package dto;
import validation.FieldMatch;
import jakarta.validation.constraints.NotBlank;

@FieldMatch(first = "password", second = "confirmPassword", message = "Mật khẩu xác nhận không khớp")
public class RegisterDto {
    @NotBlank(message = "Username không được để trống")
    private String username;
    @NotBlank(message = "Mật khẩu không được để trống")
    private String password;
    @NotBlank(message = "Xác nhận mật khẩu không được để trống")
    private String confirmPassword;

    public String getUsername() { return username; }
    public void setUsername(String u) { this.username = u; }
    public String getPassword() { return password; }
    public void setPassword(String p) { this.password = p; }
    public String getConfirmPassword() { return confirmPassword; }
    public void setConfirmPassword(String c) { this.confirmPassword = c; }
}