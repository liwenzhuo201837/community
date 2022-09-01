package life.majiang.community.community.dto;

import lombok.Data;

/**
 * @author: 李文卓
 * @create: 2022/8/25
 * @Description:
 * @FileName: AccessTokenDTO
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}


