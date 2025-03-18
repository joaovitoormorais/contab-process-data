package contab.process_data.dto;

import java.time.LocalDateTime;

public record ProcessMonthlyRecord(LocalDateTime init,
                                   LocalDateTime finish) {
}
