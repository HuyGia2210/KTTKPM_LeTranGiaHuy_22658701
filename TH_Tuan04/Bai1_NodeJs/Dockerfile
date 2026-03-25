# 1. Sử dụng node:18 làm base image theo đúng yêu cầu đề bài
FROM node:18

# 2. Chỉ định thư mục làm việc mặc định bên trong container
WORKDIR /usr/src/app

# 3. Copy file app.js từ máy tính của bạn (host) vào bên trong container
COPY app.js .

# 4. Khai báo cổng 3000 để container biết ứng dụng sẽ lắng nghe ở cổng này
EXPOSE 3000

# 5. Câu lệnh sẽ được thực thi khi container khởi động
CMD ["node", "app.js"]