# 1. Sử dụng python:3.9 làm base image theo đúng yêu cầu
FROM python:3.9

# 2. Thiết lập thư mục làm việc bên trong container
WORKDIR /app

# 3. Copy file requirements.txt vào trước và cài đặt thư viện
# Lệnh --no-cache-dir giúp giảm dung lượng image bằng cách không lưu cache của pip
COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# 4. Copy file mã nguồn app.py vào container
COPY app.py .

# 5. Khai báo cổng 5000 cho ứng dụng Flask
EXPOSE 5000

# 6. Lệnh thực thi khi container khởi chạy
CMD ["python", "app.py"]