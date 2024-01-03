package com.ra;

import com.ra.model.Category;

import java.util.ArrayList;
import java.util.List;

public class DemoPrintTable {
    public static void main(String[] args) {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1,"Truyện Ma",true));
        categories.add(new Category(2,"Trinh Thám",false));
        categories.add(new Category(3,"Cười",true));

        System.out.printf("|-------------------------------------------------|%n");
        System.out.printf("|-------------❤️Danh sách danh mục❤️-------------|%n");
        System.out.printf("*-------------------------------------------------*%n");
        System.out.printf("| %-6s | %-20s | %-15s |%n","ID","Tên thể loại","Trạng Thái");
        System.out.printf("|-------------------------------------------------|%n");
        for (Category category : categories) {
            System.out.printf("| %-6d | %-20s | %-15s |%n",
                    category.getId(),category.getName(),category.isStatus()?"Hoạt động":"Không hoạt động");
        }
        System.out.printf("*-------------------------------------------------*%n");
    }
}
