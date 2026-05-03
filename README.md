Phần 1 & 2 - Phân tích & So sánh:

Giải pháp 1: If-else Controller:
- Boilerplate code	Cao (phải viết lại ở mọi Controller).
- Tái sử dụng	Thấp
- Separation of Concerns	Vi phạm (Controller làm cả validation)

Giải pháp 2: Class-Level Annotation
- Boilerplate code Thấp (viết 1 lần, dùng mọi nơi)
- Tái sử dụng Rất cao
- Separation of Concerns Đảm bảo (Tách biệt logic validate)

Chốt giải pháp: Giải pháp 2 (Class-Level Annotation) là tối ưu nhất vì đảm bảo tính Clean Code và dễ bảo trì.
