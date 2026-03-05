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
│   └── Main.java
├── test/
    └── StudentAnalyzerTest.java
```

#### 5. Cách chạy kiểm thử đơn vị
Vào file `StudentAnalyzerTest.java`, nhấn nút Play (Run Tests) để thực thi.

## CHƯƠNG 3: Bài tập thực hành kiểm thử với Cypress
Minh chứng hoàn thành 
<img width="1910" height="847" alt="image" src="https://github.com/user-attachments/assets/c8b2146a-88a6-48bd-a85f-849a79431f81" />
<img width="1919" height="848" alt="Screenshot 2026-03-02 093416" src="https://github.com/user-attachments/assets/e967a52a-c47b-46d1-930e-0aa689c2e0cc" />
<img width="1918" height="858" alt="Screenshot 2026-03-02 093400" src="https://github.com/user-attachments/assets/4b1e6074-abdf-4120-9094-30b2b0b5741c" />
---
# Bài tập tuần 4 (26/01/2026 - 01/02/2026): Kiểm thử hiệu năng với JMeter
### 1. Giới thiệu
Bài tập: Sử dụng **Apache JMeter** (công cụ kiểm thử hiệu năng mã nguồn mở - open source performance testing tool) để thực hiện kiểm thử hiệu năng trên một trang web.  
Mục tiêu của bài tập:
- Hiểu cách sử dụng JMeter để thực hiện kiểm thử hiệu năng
- Thiết kế kịch bản kiểm thử với các tham số khác nhau (có tính cá nhân hoá)
- Phân tích kết quả kiểm thử và viết báo cáo

### 1.1. Website được kiểm thử
- **URL**: https://vnexpress.net
- **Mô tả**: Trang tin tức điện tử hàng đầu Việt Nam
- **Lý do chọn**: Website có lượng truy cập lớn, phù hợp để kiểm thử hiệu năng và đánh giá khả năng xử lý tải của hệ thống

### 2. Mục tiêu học tập
- Biết cách cài đặt và sử dụng JMeter để kiểm thử hiệu năng
- Hiểu các khái niệm về Thread Group (nhóm luồng - group of threads/users), HTTP Request (yêu cầu HTTP - HTTP request), Listeners (bộ lắng nghe - components that collect and display test results)
- Biết cách thiết kế kịch bản kiểm thử với các tham số khác nhau (số lượng người dùng, thời gian chạy, hành vi người dùng)
- Hiểu cách phân tích các chỉ số quan trọng: Response Time (thời gian phản hồi - response time), Throughput (thông lượng - throughput: requests per second), Error Rate (tỷ lệ lỗi - error rate: percentage of failed requests)
- Thực hành viết báo cáo kiểm thử hiệu năng

### 3. Cấu trúc thư mục
```
jmeter/
├── performance-test-plan.jmx    # File test plan JMeter (kế hoạch kiểm thử - test plan file)
├── README.md                    # Hướng dẫn chi tiết sử dụng JMeter
├── REPORT.md                    # Template báo cáo kết quả kiểm thử (mẫu báo cáo - report template)
├── QUICK_START.md              # Hướng dẫn nhanh (hướng dẫn nhanh - quick start guide)
├── .gitignore                   # Git ignore file (file bỏ qua của Git - Git ignore configuration)
└── results/                     # Thư mục lưu kết quả test (kết quả - results directory)
    ├── results.jtl              # File kết quả JMeter (file kết quả - JMeter results file)
    └── report/                  # HTML report (báo cáo HTML - HTML report directory)
```

### 4. Cấu hình Test Plan

File `performance-test-plan.jmx` chứa **3 kịch bản kiểm thử** (Thread Groups - nhóm luồng: group of threads/users) với các tham số khác nhau:

#### 4.1. Thread Group 1: Kịch bản cơ bản
- **Số lượng người dùng (Threads - luồng)**: ~10
- **Số lần lặp (Loop Count - số vòng lặp)**: 5
- **Ramp-up Period (thời gian tăng dần)**: 1 giây
- **Tổng số request (yêu cầu)**: 10 × 5 = 50 requests
- **Endpoint được test (điểm cuối được kiểm thử)**: 
  - GET `/` (Trang chủ)
- **Mục đích**: Kiểm tra hiệu năng cơ bản của website với lượng truy cập nhỏ

#### 4.2. Thread Group 2: Kịch bản tải nặng
- **Số lượng người dùng (Threads - luồng)**: ~50
- **Ramp-up Period (thời gian tăng dần)**: 30 giây (tăng dần từ 0 đến 50 users trong 30 giây)
- **Tổng số request (yêu cầu)**: ~100 requests (50 users × 2 endpoints)
- **Endpoints được test (điểm cuối được kiểm thử)**: 
  - GET `/` (Trang chủ)
  - GET `/tim-kiem?q=tin tức` (Trang tìm kiếm)
- **Mục đích**: Kiểm tra khả năng xử lý tải cao của hệ thống khi có nhiều người dùng đồng thời

#### 4.3. Thread Group 3: Kịch bản tùy chỉnh
- **Số lượng người dùng (Threads - luồng)**: ~20
- **Thời gian chạy (Duration - thời lượng)**: 60 giây
- **Ramp-up Period (thời gian tăng dần)**: 10 giây
- **Endpoints được test (điểm cuối được kiểm thử)**: 
  - GET `/the-thao` (Trang thể thao)
  - GET `/so-hoa` (Trang công nghệ)
- **Mục đích**: Mô phỏng người dùng duyệt nhiều trang khác nhau trong một phiên làm việc

### 5. Các thành phần trong Test Plan

#### 5.1. HTTP Request Defaults (Mặc định yêu cầu HTTP)
- Cấu hình URL cơ sở: `${BASE_URL}` (mặc định: `https://vnexpress.net`)
- Cho phép dễ dàng thay đổi website cần test bằng cách sửa biến `BASE_URL`

#### 5.2. Listeners (Bộ lắng nghe)
- **Summary Report (Báo cáo tóm tắt)**: Hiển thị tổng quan về kết quả test (Response Time - thời gian phản hồi, Throughput - thông lượng, Error Rate - tỷ lệ lỗi)
- **View Results Tree (Xem cây kết quả)**: Hiển thị chi tiết từng request (Request/Response headers - tiêu đề yêu cầu/phản hồi, body - nội dung, status code - mã trạng thái)

### 6. Cách chạy kiểm thử

#### 6.1. Yêu cầu hệ thống
- **Java**: JDK 8+ (Java Development Kit - bộ phát triển Java) hoặc JRE 8+ (Java Runtime Environment - môi trường chạy Java) (JMeter yêu cầu Java để chạy)
- **JMeter**: Tải từ https://jmeter.apache.org/download_jmeter.cgi
- Kiểm tra Java đã cài đặt:
  ```bash
  java -version
  ```

#### 6.2. Chạy Test Plan (GUI Mode - Chế độ giao diện đồ họa)
1. Mở JMeter: Chạy file `bin/jmeter.bat` (Windows) hoặc `bin/jmeter.sh` (Linux/Mac)
2. Mở Test Plan (Kế hoạch kiểm thử): **File** → **Open** → Chọn `jmeter/performance-test-plan.jmx`
3. Tùy chỉnh URL (nếu cần): Mở **User Defined Variables (Biến do người dùng định nghĩa)** → Sửa `BASE_URL`
4. Chạy từng Thread Group:
   - **Vô hiệu hóa** các Thread Group không cần: Click phải → **Disable (Tắt)**
   - **Kích hoạt** Thread Group cần chạy: Click phải → **Enable (Bật)**
   - Click nút **Start (Bắt đầu)** (▶)
5. Xem kết quả trong **Summary Report (Báo cáo tóm tắt)** và **View Results Tree (Xem cây kết quả)**
6. Lưu kết quả:
   - Summary Report: Click phải → **Save Table Data (Lưu dữ liệu bảng)** → Lưu CSV (Comma Separated Values - giá trị phân tách bằng dấu phẩy)
   - View Results Tree: Chụp màn hình hoặc Save Table Data

#### 6.3. Chạy Test Plan (Command Line - Dòng lệnh - Khuyến nghị cho test lớn)
Chạy ở chế độ non-GUI (không giao diện đồ họa - non-GUI mode: faster and uses less resources than GUI mode):

```bash
# Di chuyển đến thư mục jmeter
cd jmeter

# Chạy test và tạo HTML report
jmeter -n -t performance-test-plan.jmx -l results/results.jtl -e -o results/report/

# Xem HTML report
# Mở file: results/report/index.html trong trình duyệt
```

Giải thích các tham số:
- `-n`: Chạy ở chế độ non-GUI (không giao diện đồ họa - non-GUI mode)
- `-t`: Đường dẫn đến file test plan (kế hoạch kiểm thử - test plan file) (.jmx)
- `-l`: Đường dẫn file kết quả (results file) (.jtl - JMeter Test Log)
- `-e`: Tạo HTML report (báo cáo HTML - HTML report) sau khi test xong
- `-o`: Thư mục chứa HTML report (báo cáo HTML - HTML report directory)

### 7. Các chỉ số quan trọng cần phân tích

#### 7.1. Response Time (Thời gian phản hồi)
- **Average (Trung bình)**: Thời gian phản hồi trung bình (ms - milliseconds: mili giây)
- **Median (Trung vị)**: Thời gian phản hồi ở giữa (50th percentile - phân vị thứ 50)
- **Min/Max (Tối thiểu/Tối đa)**: Thời gian phản hồi nhỏ nhất/lớn nhất (ms)
- **90th/95th/99th Percentile (Phân vị 90/95/99)**: Thời gian phản hồi của 90%/95%/99% request (yêu cầu)
- **Đánh giá**: Response time càng thấp càng tốt, thường < 2000ms được coi là tốt

#### 7.2. Throughput (Thông lượng)
- Số lượng request (yêu cầu) được xử lý mỗi giây (requests/second - yêu cầu/giây)
- **Đánh giá**: Throughput càng cao càng tốt, thể hiện khả năng xử lý của server (máy chủ)

#### 7.3. Error Rate (Tỷ lệ lỗi)
- Tỷ lệ request (yêu cầu) bị lỗi (%)
- **Đánh giá**: Nên < 1% trong điều kiện bình thường, = 0% là lý tưởng

#### 7.4. Concurrent Users (Người dùng đồng thời)
- Số lượng người dùng cùng lúc
- **Ảnh hưởng**: Ảnh hưởng trực tiếp đến Response Time (thời gian phản hồi) và Throughput (thông lượng)

### 8. Kết quả kiểm thử


#### 8.1. Thread Group 1: Kịch bản cơ bản
- **Samples (Mẫu)**: 50
- **Average Response Time (Thời gian phản hồi trung bình)**: 299 ms
- **Min/Max Response Time (Thời gian phản hồi tối thiểu/tối đa)**: 67 / 1700 ms
- **Error Rate (Tỷ lệ lỗi)**: 0%
- **Throughput (Thông lượng)**: 22.9 requests/giây

#### 8.2. Thread Group 2: Kịch bản tải nặng
- **Samples (Mẫu)**: 100
- **Average Response Time (Thời gian phản hồi trung bình)**: 103 ms
- **Min/Max Response Time (Thời gian phản hồi tối thiểu/tối đa)**: 37 / 574 ms
- **Error Rate (Tỷ lệ lỗi)**: 0%
- **Throughput (Thông lượng)**: 3.4 requests/giây

#### 8.3. Thread Group 3: Kịch bản tùy chỉnh
- **Samples (Mẫu)**: 467
- **Average Response Time (Thời gian phản hồi trung bình)**: 2430 ms
- **Min/Max Response Time (Thời gian phản hồi tối thiểu/tối đa)**: 1308 / 10086 ms
- **Error Rate (Tỷ lệ lỗi)**: 0%
- **Throughput (Thông lượng)**: 7.1 requests/giây

### 9. Phân tích và So sánh

#### 9.1. So sánh Response Time (Thời gian phản hồi)
- Thời gian phản hồi có sự chênh lệch lớn: TG2 (Tải nặng) lại có tốc độ nhanh nhất (103 ms), nhanh hơn cả TG1 (299 ms). Tuy nhiên, TG3 tăng vọt lên 2430 ms (trung bình) và đạt đỉnh hơn 10s khi truy cập vào các trang chuyên mục.

#### 9.2. So sánh Throughput (Thông lượng)
- Throughput cao nhất ở TG1 (22.9 req/s). TG2 có throughput thấp (3.4 req/s) do thời gian Ramp-up kéo dài. TG3 đạt 7.1 req/s.

#### 9.3. Tỷ lệ Lỗi (Error Rate)
- Cả 3 kịch bản đều đạt độ ổn định tuyệt đối với 0% lỗi, cho thấy server chịu tải tốt và không bị quá tải dẫn đến ngắt kết nối.

### 10. Kết luận

#### 10.1. Đánh giá Tổng quan
- Website hoạt động rất ổn định (không có lỗi). Tuy nhiên hiệu năng không đồng đều: Trang chủ và Tìm kiếm được tối ưu/cache rất tốt (phản hồi siêu nhanh), trong khi các trang Chuyên mục (/so-hoa, /the-thao) phản hồi chậm.

#### 10.2. Điểm Mạnh
- Tỷ lệ lỗi tuyệt đối 0%.
- Tốc độ xử lý ở kịch bản tải nặng (TG2) rất ấn tượng (103 ms), cho thấy khả năng caching tốt.

#### 10.3. Điểm Cần Cải thiện
- Cần tối ưu hóa các trang chuyên mục (TG3) vì độ trễ trung bình > 2s và max > 10s là trải nghiệm chưa tốt.

#### 10.4. Khuyến nghị
- Kiểm tra tài nguyên (ảnh/video) và truy vấn database tại các trang /the-thao và /so-hoa.
- Duy trì cấu hình Cache hiện tại cho trang chủ.

### 11. Minh chứng hoàn thành

- Summary Report TG1:<img width="1523" height="861" alt="jmeter1" src="https://github.com/user-attachments/assets/42097bc8-640d-405c-8291-2830b64161b5" />

- Summary Report TG2:<img width="1531" height="861" alt="jmeter2" src="https://github.com/user-attachments/assets/12d27fcd-a028-4cb4-b4ad-f55147583d52" />

- Summary Report TG3:<img width="1520" height="860" alt="jmeter3" src="https://github.com/user-attachments/assets/1b086006-b296-471a-840c-1f8a0a83a962" />

- View Results Tree (mẫu request):<img width="1526" height="868" alt="jmeter4" src="https://github.com/user-attachments/assets/c95136f9-8a82-400c-84f2-7782b40762cb" />
