package Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.OK, reason = "Legal move. Location of the Character updated")
public class StatusOk extends RuntimeException {
}
