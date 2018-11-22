package com.thanksgivingProject.move.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "Illegal move. The location does not have the specified exit.")
public class Forbidden extends RuntimeException {
}
