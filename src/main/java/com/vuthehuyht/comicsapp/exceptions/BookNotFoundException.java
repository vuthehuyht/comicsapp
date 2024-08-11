package com.vuthehuyht.comicsapp.exceptions;

import com.vuthehuyht.comicsapp.enums.ErrorCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookNotFoundException extends RuntimeException {
    private ErrorCode errorCode;

    public BookNotFoundException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
