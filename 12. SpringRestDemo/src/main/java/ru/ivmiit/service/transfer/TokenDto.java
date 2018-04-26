package ru.ivmiit.service.transfer;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.ivmiit.service.models.Token;

/**
 * 25.04.2018
 * TokenDto
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Data
@AllArgsConstructor
public class TokenDto {
    private String value;

    public static TokenDto from(Token token) {
        return new TokenDto(token.getValue());
    }

}
