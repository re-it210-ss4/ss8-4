package controller;

import dto.*;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AppController {

    @PostMapping("/address")
    public ResponseEntity<?> updateAddress(@Valid @RequestBody AddressDto dto, BindingResult result) {
        if (result.hasErrors()) return ResponseEntity.badRequest().body(result.getFieldError().getDefaultMessage());
        return ResponseEntity.ok("Cập nhật địa chỉ thành công!");
    }

    @PostMapping("/withdraw")
    public ResponseEntity<?> withdraw(@Valid @RequestBody TransactionDto dto, BindingResult result) {
        if (result.hasErrors()) return ResponseEntity.badRequest().body(result.getFieldError().getDefaultMessage());
        return ResponseEntity.ok("Rút tiền thành công: " + dto.getWithdrawAmount());
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody RegisterDto dto, BindingResult result) {
        if (result.hasErrors()) {
            String msg = result.hasGlobalErrors() ? result.getGlobalError().getDefaultMessage() : result.getFieldError().getDefaultMessage();
            return ResponseEntity.badRequest().body(msg);
        }
        return ResponseEntity.ok("Đăng ký thành công!");
    }
}