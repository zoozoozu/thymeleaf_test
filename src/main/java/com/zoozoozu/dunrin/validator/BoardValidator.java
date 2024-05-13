package com.zoozoozu.dunrin.validator;


import com.zoozoozu.dunrin.model.Board;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class BoardValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Board.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        Board b = (Board) obj;
        if(StringUtils.isEmpty(b.getContent())){
            errors.rejectValue("content", "key", "내용을 입력하세요.");
        }

//        if(b.getUser().getUsername() != SecurityContextHolder.getContext().getAuthentication().getName()){
//            errors.rejectValue("content", "key", "게시판을 수정할 수 없습니다.");
//        }
    }
}
