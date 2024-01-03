package com.ra.view;

import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);
    public static void showMenu(){

        do {
            System.out.println("==========Quản lý thư viện==========");
            System.out.println("1. Quản lý thể loại ");
            System.out.println("2. Quản lý sách");
            System.out.println("3. Thoát");
            System.out.println("Mời bạn chọn từ 1 - 3");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    menuCategory();
                    break;
                case 2:
                    menuBook();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Chọn sai mời chọn lại");
            }
        } while (true);

    }
   public static void menuCategory(){
        do {
            System.out.println("========Quản lý thể loại=========");
            System.out.println("1. Thêm mới thể loại");
            System.out.println("2. Hiển thị danh sách theo tên A-Z");
            System.out.println("3. Thống kê");
            System.out.println("4. Cập nhật thể loại");
            System.out.println("5. Xóa thể loại");
            System.out.println("6. Quay lại");
            System.out.println("Mời bạn chọn từ 1 - 5");
            int choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1){
                case 1:
                    System.out.println("Thực hiện thêm mới");
                    break;
                case 2:
                    break;
                case 3:
                   break;
                case 6:
                    showMenu();
                    break;
                default:
                    System.out.println("Chọn sai mời chọn lại");
            }
        } while (true);
    }
    public static void menuBook(){
        do {
            System.out.println("========Quản lý thể sách=========");
            System.out.println("1. Thêm mới sách");
            System.out.println("2. Cập nhật sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Tìm kiếm sách");
            System.out.println("5. Hiển thị danh sách sách theo nhóm thể loại");
            System.out.println("6. Quay lại");
            System.out.println("Mời bạn chọn từ 1 - 5");
            int choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1){
                case 1:
                    System.out.println("Thực hiện thêm mới sach");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 6:
                    showMenu();
                    break;
                default:
                    System.out.println("Chọn sai mời chọn lại");
            }
        } while (true);
    }
}
