package com.billboard.VO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class CommunityForm {
    private Integer id;
    private String title;
    private String body;
}
