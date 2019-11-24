package com.example.demo.dto;

import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestDto {

    public int id;
    public String user_id;
    public String pw;
    public String img_url;
}
