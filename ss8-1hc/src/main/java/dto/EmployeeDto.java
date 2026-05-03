package dto;
import jakarta.validation.constraints.*;

public class EmployeeDto {
    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không đúng định dạng")
    private String email;
    @Min(value = 18, message = "Tuổi tối thiểu là 18")
    @Max(value = 60, message = "Tuổi tối đa là 60")
    private Integer age;

    public String getEmail() { return email; }
    public void setEmail(String e) { this.email = e; }
    public Integer getAge() { return age; }
    public void setAge(Integer a) { this.age = a; }
}