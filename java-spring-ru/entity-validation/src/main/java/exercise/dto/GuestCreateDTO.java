package exercise.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

// BEGIN
@Getter
@Setter
public class GuestCreateDTO {
    @NotBlank
    private String name;

    @Pattern(regexp = "^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$")
    private String email;

    @Pattern(regexp = "^[+][(]?[0-9]{11,13}")
    private String phoneNumber;

    @Pattern(regexp = "^[0-9]{4}$")
    private String clubCard;

    @FutureOrPresent
    private LocalDate cardValidUntil;
}
// END
