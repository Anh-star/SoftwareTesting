# Software-testing-class
## CHƯƠNG 1: Bài tập kiểm thử giao diện phần mềm trên trang web [Can't Unsee](https://cantunsee.space/)
<img width="1914" height="903" alt="image" src="https://github.com/user-attachments/assets/0c9b39e1-b216-4894-8d12-e0cd8bcca756" />

## CHƯƠNG 2: Bài tập thực hành kiểm thử với JUnit

#### 1. Mục tiêu
- Viết kiểm thử đơn vị bằng JUnit 5
- Thực hành quy trình làm việc với GitHub Issues và Commit

#### 2. Mô tả bài toán
Chương trình phân tích điểm số học sinh với các chức năng:
- Đếm học sinh Giỏi: Lọc ra các điểm số >= 8.0 và =< 10.
- Tính điểm trung bình của các điểm hợp lệ (từ 0 đến 10)
Nếu danh sách trống hoặc không có điểm hợp lệ, kết quả trả về phải là 0 hoặc 0.0

#### 3. Công nghệ sử dụng
- Ngôn ngữ lập trình: Java (JDK 21).
- Thư viện kiểm thử: JUnit 5.
- Môi trường phát triển (IDE): Visual Studio Code
- Công cụ hỗ trợ: Java Extension Pack cho VS Code.

#### 4. Cấu trúc thư mục
```
StudentProject/
├── src/
│   └── StudentAnalyzer.java
├── test/
    └── StudentAnalyzerTest.java
```

#### 5. Cách chạy kiểm thử đơn vị
Vào file StudentAnalyzerTest.java, nhấn nút Play (Run Tests) để thực thi.
