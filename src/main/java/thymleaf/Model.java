package thymleaf;

import java.time.LocalDateTime;

public interface Model {
    void addAttribute(String theDate, LocalDateTime now);
}
