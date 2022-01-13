package com.mine.financial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.mine.financial.mapper")
public class MineFinancialPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(MineFinancialPlatformApplication.class, args);
    }

}
