package com.thanksgivingProject.move.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason = "Illegal move. The specified character is dead.")
public class Unauthorized extends RuntimeException {
}
